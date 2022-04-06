package com.pca.Productservice.web;

import com.pca.Productservice.Domain.entities.Equipement;
import com.pca.Productservice.Service.EquipementService;
import com.pca.Productservice.Domain.filters.SearchCriteria;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/equipements")
public class EquipementController {

    @Autowired
    EquipementService equipementService;

    @GetMapping("/find/{id}")
    public Equipement findEquipementById(@PathVariable Long id){

        return equipementService.findById(id);
    }

    @PostMapping("/save")
    public Equipement saveEquipement(@RequestBody Equipement equipement){
        return equipementService.save(equipement);
    }

    @RequestMapping(value = "{id}",method = RequestMethod.DELETE)
    public void deleteEquipementById(@PathVariable Long id){

        equipementService.deleteById(id);
    }

    @RequestMapping(value = "{id}",method = RequestMethod.PUT)
    public Equipement updateEquipement(@PathVariable Long id, @RequestBody Equipement equipement){
        Equipement existingEquipement = equipementService.findById(id);
        BeanUtils.copyProperties(equipement, existingEquipement, "equipement_id");
        Equipement newEquipement = equipementService.saveAndFlush(existingEquipement);
        return  newEquipement;
    }

    @GetMapping("/findbyfilter")
    public Page<Equipement> findByFilter(SearchCriteria searchCriteria){
        //return equipementService.findByFilter(searchCriteria);
        return null;
    }

    @GetMapping("/index")
    public String page(){
        return "index";
    }

}
