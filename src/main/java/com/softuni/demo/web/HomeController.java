package com.softuni.demo.web;

import com.softuni.demo.models.entity.CategoryEnum;
import com.softuni.demo.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    private final ProductService productService;

    public HomeController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public String index(HttpSession httpSession,
                        Model model){
        if (httpSession.getAttribute("user") == null){
            return "index";
        }

        model.addAttribute("totalSum", productService.getTotalSum());
        model.addAttribute("drinks", productService.findAllProductsByCategory(CategoryEnum.DRINK));
        model.addAttribute("food", productService.findAllProductsByCategory(CategoryEnum.FOOD));
        model.addAttribute("households", productService.findAllProductsByCategory(CategoryEnum.HOUSEHOLD));
        model.addAttribute("others", productService.findAllProductsByCategory(CategoryEnum.OTHER));

        return "home";
    }

}
