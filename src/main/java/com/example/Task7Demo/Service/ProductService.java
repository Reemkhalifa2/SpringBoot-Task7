package com.example.Task7Demo.Service;

import com.example.Task7Demo.Product;
import org.springframework.stereotype.Service;

import java.util.HashMap;
@Service
public class ProductService {
    HashMap<Integer, Product> productMap = new HashMap<>();
    public ProductService() {
        LoadSampleProducts();
    }

    public void LoadSampleProducts(){
        productMap.put(1,new Product(101,"Bag", 21.5));
        productMap.put(2,new Product(102,"Shoes", 15.6));
        productMap.put(3,new Product(103,"watch", 40.3));
    }

    public String deleteProductById(int productId) {

        if (productMap.containsKey(productId)) {

            Product product = productMap.remove(productId);

            return product.getProductName() + " deleted successfully";
        }

        return "Product not found";
    }


}
