package ba.sum.fpmoz.javaapp.controllers;

import ba.sum.fpmoz.javaapp.model.Product;
import ba.sum.fpmoz.javaapp.repositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;



    @Controller
    public class ClientController {

        @Autowired
        private ProductsRepository repo;

        @GetMapping("/products")
        public String showProducts(Model model) {
            List<Product> products = repo.findAll();
            model.addAttribute("products", products);
            return "client";  // učitava client.html
        }
    }


