package com.pca.Productservice.web;

import com.pca.Productservice.entity.Product;
import com.pca.Productservice.repository.ProductReposiotry;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/product")
public class ProductController {

    @Autowired
    ProductReposiotry productReposiotry;


    @GetMapping("/find/{id}")
    public Product findProductById(@PathVariable Long id){
        return productReposiotry.findById(id).orElse(null);
    }

    @PostMapping("/save")
    public Product saveProduct(@RequestBody Product product){
        return productReposiotry.save(product);
    }

    @RequestMapping(value = "{id}",method = RequestMethod.DELETE)
    public void deleteProductById(@PathVariable Long id){
        productReposiotry.deleteById(id);
    }

    @RequestMapping(value = "{id}",method = RequestMethod.PUT)
    public Product updateProduct(@PathVariable Long id, @RequestBody Product product){
        Product existingProduct = productReposiotry.findById(id).orElse(null);
        BeanUtils.copyProperties(product, existingProduct, "product_id");
        Product product1 = productReposiotry.saveAndFlush(existingProduct);
        return  product;
    }

}
