package com.shivu.orderservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.shivu.orderservice.dto.OrderRequest;
import com.shivu.orderservice.model.Order;
import com.shivu.orderservice.model.Product;
import com.shivu.orderservice.model.Users;
import com.shivu.orderservice.repository.OrderRepository;
import com.shivu.orderservice.repository.ProductRepository;
import com.shivu.orderservice.repository.UserRepository;

@Service
public class OrderService {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    OrderRepository orderRepo;
    @Autowired
    UserRepository userRepository;
    @Autowired
    ProductRepository productRepository;
   
    public Order placeOrder(OrderRequest orderRequest){
        System.out.println("called service method"+orderRequest.getEmail_id());
        Users users = restTemplate.getForObject("http://localhost:9090/api/users/email/"+orderRequest.getEmail_id(),Users.class);
        // ;//rest template to call use service get user object
        
        System.out.println(users);
        List<Product> listOfProducts=new ArrayList<>();
        for (Integer productId : orderRequest.getOrderedProductIdQuantityList().keySet()) {
            Integer productQuantity = orderRequest.getOrderedProductIdQuantityList().get(productId);
            System.out.println(productId+" "+productQuantity);
            Product product=restTemplate.getForObject("http://localhost:9191/api/products/"+productId, Product.class);
            if(product!=null){
                
                listOfProducts.add(product);
            }
        }   
        System.out.println(listOfProducts);
        Order order=new Order();
        order.setProductsOrder(listOfProducts);
        order.setUsers(users);
       
        return  orderRepo.save(order);
    }
}
