package com.pca.Productservice.Service;

import com.pca.Productservice.Domain.entities.Airport;
import com.pca.Productservice.Domain.entities.Equipment;
import com.pca.Productservice.Domain.filters.SearchCriteria;
import com.pca.Productservice.Domain.repositories.AirportRepository;
import com.pca.Productservice.Domain.repositories.EquipmentRepository;
import com.pca.Productservice.Domain.support.CommonId;
import com.pca.Productservice.Domain.support.Response;
import com.pca.Productservice.Service.exception.NotFoundException;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Getter
@Setter
public class EquipmentService {


    private final EquipmentRepository equipmentRepository;
    private final AirportRepository airportRepository;

    public Response<Equipment> findEquipmentById(String id) {
        Equipment equipment = equipmentRepository.findById(CommonId.valueOf(id))
                .orElseThrow(()->new NotFoundException("Not found") );
        return new Response<>(true,201,equipment,"");
    }

    @Transactional
    public Response<Equipment> saveEquipment(Equipment equipment) {
        Airport result = airportRepository.save(equipment.getAirport());
        //if(result != null ) throw new NotFoundException(" Exception ");
        equipment.getAirport().setAirport_id(result.getAirport_id());
        Equipment newEquipment = equipmentRepository.save(equipment);
        return new Response<>(true, 201, newEquipment, "");
    }

    public void deleteEquipmentById(String id) {
        equipmentRepository.deleteById(CommonId.valueOf(id));
    }

    @Transactional
    public Response<Equipment> updateEquipment(String id, Equipment equipment) {
        Equipment existingEquipment = equipmentRepository.findById(CommonId.valueOf(id)).orElse(null);
        Integer newIdAirport = existingEquipment.getAirport().getAirport_id();
        BeanUtils.copyProperties(equipment,existingEquipment, "id", "createdAt", "version");
        existingEquipment.getAirport().setAirport_id(newIdAirport);
        airportRepository.saveAndFlush(existingEquipment.getAirport());
        Equipment newEquipment = equipmentRepository.saveAndFlush(existingEquipment);
        return  new Response<>(true, 200, newEquipment, "");
    }

    public Page<Equipment> findByFilter(SearchCriteria searchCriteria) {
        Equipment equipment = new Equipment();
        equipment.setSerialNumber(searchCriteria.getSerialNumber());
        equipment.setAssetTag(searchCriteria.getAssetTag());
        equipment.setNodeName(searchCriteria.getNodeName());
        equipment.setQuantity(searchCriteria.getQuantity());
        equipment.setComment(searchCriteria.getComment());
        equipment.setModel(searchCriteria.getModel());
        equipment.setType(searchCriteria.getType());
        equipment.setProject(searchCriteria.getProject());
        equipment.setSite(searchCriteria.getSite());
        equipment.setState(searchCriteria.getState());
        equipment.setAirport(searchCriteria.getAirport());

        ExampleMatcher equipmentExampleMatcher = ExampleMatcher.matchingAny()
                .withMatcher("serialNumber",  ExampleMatcher.GenericPropertyMatchers.contains())
                .withMatcher("assetTag",  ExampleMatcher.GenericPropertyMatchers.contains())
                .withMatcher("nodeName",  ExampleMatcher.GenericPropertyMatchers.contains())
                .withMatcher("quantity",  ExampleMatcher.GenericPropertyMatchers.contains())
                .withMatcher("comment",  ExampleMatcher.GenericPropertyMatchers.contains())
                .withMatcher("model",  ExampleMatcher.GenericPropertyMatchers.contains())
                .withMatcher("type",  ExampleMatcher.GenericPropertyMatchers.contains())
                .withMatcher("project",  ExampleMatcher.GenericPropertyMatchers.contains())
                .withMatcher("site",  ExampleMatcher.GenericPropertyMatchers.contains())
                .withMatcher("state",  ExampleMatcher.GenericPropertyMatchers.contains());
        Example<Equipment> equipementExample= Example.of(equipment, equipmentExampleMatcher);
        Page<Equipment> response = equipmentRepository.findAll(equipementExample,
                PageRequest.of(searchCriteria.getPageOffset(), searchCriteria.getPageSize()));
        return response;
    }
}
