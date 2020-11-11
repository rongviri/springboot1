package com.example.springboot1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class ProductService{
   private static Map<String, Product> productRepo = new HashMap<String, Product>();
   static {
      Product honey = new Product();
      honey.setId("1");
      honey.setName("Honey");
      productRepo.put(honey.getId(), honey);

      Product almond = new Product();
      almond.setId("2");
      almond.setName("Almond");
      productRepo.put(almond.getId(), almond);
   }
   
   public Product getProductByID(String id) {
	   return productRepo.get(id);
   }
   
   public void createProduct(Product product) {
      productRepo.put(product.getId(), product);
   }
  
   public void updateProduct(String id, Product product) {
      productRepo.remove(id);
      product.setId(id);
      productRepo.put(id, product);
   }
   
   public void deleteProduct(String id) {
      productRepo.remove(id);

   }
   
   public Collection<Product> getProducts() {
      return productRepo.values();
   }
}