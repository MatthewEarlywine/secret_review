package org.launchcode.secret_review.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReviewController {

    @GetMapping("review")
    private String review() {

        return "review";
    }
}
