package com.pca.Productservice.web;

import com.pca.Productservice.Domain.entities.Equipment;
import com.pca.Productservice.Domain.support.Response;
import com.pca.Productservice.Service.EquipmentService;
import com.pca.Productservice.Domain.filters.SearchCriteria;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/equipments")
public class EquipmentController {

    @Autowired
    private EquipmentService equipmentService;

    @GetMapping("/find/{id}")
    public Response<Equipment> findEquipmentById(@PathVariable String id){
        return equipmentService.findEquipmentById(id);
    }

    @PostMapping("/save")
    public Response<Equipment> saveEquipment(@RequestBody Equipment equipement){
        return equipmentService.saveEquipment(equipement);
    }

    @RequestMapping(value = "{id}",method = RequestMethod.DELETE)
    public void deleteEquipmentById(@PathVariable String id){
        equipmentService.deleteEquipmentById(id);
    }

    @PutMapping("/update/{id}")
    public Response<Equipment> updateEquipement(@PathVariable String id, @RequestBody Equipment equipment){
        return equipmentService.updateEquipment(id, equipment);
    }

    @GetMapping("/findByFilter")
    public Page<Equipment> findByFilter(SearchCriteria searchCriteria){
        return equipmentService.findByFilter(searchCriteria);
    }

    @GetMapping("/index")
    public String page(){
        return "index";
    }

}
