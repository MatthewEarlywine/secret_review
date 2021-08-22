package org.launchcode.secret_review.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping
    private String index() {
        return "index";
    }

    @GetMapping("index")
    private String indexPage() {
        return "index";
    }

}
