package com.pca.Productservice.web;

import com.pca.Productservice.Domain.entities.Equipment;
import com.pca.Productservice.Service.EquipmentService;
import com.pca.Productservice.Domain.filters.SearchCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/equipments")
public class EquipmentController {

    @Autowired
    EquipmentService equipmentService;

    @GetMapping("/find/{id}")
    public Equipment findEquipementById(@PathVariable Long id){

        //return equipmentService.findById(id);
        return null;
    }

    @PostMapping("/save")
    public Equipment saveEquipement(@RequestBody Equipment equipement){
        //return equipementService.save(equipement);
        return null;
    }

    @RequestMapping(value = "{id}",method = RequestMethod.DELETE)
    public void deleteEquipementById(@PathVariable Long id){

        //equipmentService.deleteById(id);

    }

    @RequestMapping(value = "{id}",method = RequestMethod.PUT)
    public Equipment updateEquipement(@PathVariable Long id, @RequestBody Equipment equipement){
        //Equipment existingEquipement = equipmentService.findById(id);
        //BeanUtils.copyProperties(equipement, existingEquipement, "equipement_id");
        //Equipment newEquipement = equipmentService.saveAndFlush(existingEquipement);
        //return  newEquipement;
        return null;
    }

    @GetMapping("/findbyfilter")
    public Page<Equipment> findByFilter(SearchCriteria searchCriteria){
        //return equipementService.findByFilter(searchCriteria);
        return null;
    }

    @GetMapping("/index")
    public String page(){
        return "index";
    }

}
