package com.pca.Productservice.Service;

import com.pca.Productservice.domain.Product;
import com.pca.Productservice.domain.Support.SearchCriteria;
import com.pca.Productservice.repository.ProductReposiotry;
import com.pca.Productservice.web.ProductController;
import com.pca.Productservice.web.Response;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Getter
@Setter
public class ProductService{

    @Autowired
    private ProductReposiotry productReposiotry;

    public Product findById(Long id) {
        return productReposiotry.findById(id).orElse(null);
    }

    public Product save(Product product) {
        return productReposiotry.save(product);
    }

    public void deleteById(Long id) {
        productReposiotry.deleteById(id);
    }

    public Product saveAndFlush(Product existingProduct) {
        return productReposiotry.saveAndFlush(existingProduct);
    }

    public Page<Product> findByFilter(SearchCriteria searchCriteria) {
        Product product = new Product();
        product.setName(searchCriteria.getName());
        product.setAssetTag(searchCriteria.getAssetTag());
        product.setPrice(searchCriteria.getPrice());
        product.setNumber(searchCriteria.getNumber());
        product.setQuantity(searchCriteria.getQuantity());

        ExampleMatcher productExampleMatcher = ExampleMatcher.matchingAny()
                .withMatcher("name",  ExampleMatcher.GenericPropertyMatchers.contains())
                .withMatcher("assetTag",  ExampleMatcher.GenericPropertyMatchers.contains())
                .withMatcher("price",  ExampleMatcher.GenericPropertyMatchers.contains())
                .withMatcher("number",  ExampleMatcher.GenericPropertyMatchers.contains())
                .withMatcher("quantity",  ExampleMatcher.GenericPropertyMatchers.contains());
        Example<Product> productExample= Example.of(product, productExampleMatcher);
        Page<Product> response = productReposiotry.findAll(productExample,
                PageRequest.of(searchCriteria.getPageOffset(), searchCriteria.getPageSize()));
        return response;
    }
}
