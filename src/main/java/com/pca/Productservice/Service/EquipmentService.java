package com.pca.Productservice.Service;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Getter
@Setter
public class EquipmentService {

    /*@Autowired
    private AirportRepository equipementReposiotry;

    public Equipment findById(Long id) {
        return equipementReposiotry.findById(id).orElse(null);
    }

    public Equipment save(Equipment equipement) {
        return equipementReposiotry.save(equipement);
    }

    public void deleteById(Long id) {
        equipementReposiotry.deleteById(id);
    }

    public Equipment saveAndFlush(Equipment existingEquipement) {
        return equipementReposiotry.saveAndFlush(existingEquipement);
    }

    /*
    public Page<Equipement> findByFilter(SearchCriteria searchCriteria) {
        Equipement equipement = new Equipement();
        equipement.setName(searchCriteria.getName());
        equipement.setAssetTag(searchCriteria.getAssetTag());
        equipement.setPrice(searchCriteria.getPrice());
        equipement.setNumber(searchCriteria.getNumber());
        equipement.setQuantity(searchCriteria.getQuantity());

        ExampleMatcher equipementExampleMatcher = ExampleMatcher.matchingAny()
                .withMatcher("name",  ExampleMatcher.GenericPropertyMatchers.contains())
                .withMatcher("assetTag",  ExampleMatcher.GenericPropertyMatchers.contains())
                .withMatcher("price",  ExampleMatcher.GenericPropertyMatchers.contains())
                .withMatcher("number",  ExampleMatcher.GenericPropertyMatchers.contains())
                .withMatcher("quantity",  ExampleMatcher.GenericPropertyMatchers.contains());
        Example<Equipement> equipementExample= Example.of(equipement, equipementExampleMatcher);
        Page<Equipement> response = equipementReposiotry.findAll(equipementExample,
                PageRequest.of(searchCriteria.getPageOffset(), searchCriteria.getPageSize()));
        return response;
    }*/
}
