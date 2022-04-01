package com.pca.Productservice.web;

import com.pca.Productservice.Service.ProductService;
import com.pca.Productservice.Domain.entities.Product;
import com.pca.Productservice.Domain.filters.SearchCriteria;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/find/{id}")
    public Product findProductById(@PathVariable Long id){

        return productService.findById(id);
    }

    @PostMapping("/save")
    public Product saveProduct(@RequestBody Product product){

        return productService.save(product);
    }

    @RequestMapping(value = "{id}",method = RequestMethod.DELETE)
    public void deleteProductById(@PathVariable Long id){

        productService.deleteById(id);
    }

    @RequestMapping(value = "{id}",method = RequestMethod.PUT)
    public Product updateProduct(@PathVariable Long id, @RequestBody Product product){
        Product existingProduct = productService.findById(id);
        BeanUtils.copyProperties(product, existingProduct, "product_id");
        Product product1 = productService.saveAndFlush(existingProduct);
        return  product;
    }

    @GetMapping("/findbyfilter")
    public Page<Product> findByFilter(SearchCriteria searchCriteria){
        return productService.findByFilter(searchCriteria);
    }

    @GetMapping("/index")
    public String page(){
        return "index";
    }

}
