package org.launchcode.secret_review.controllers;

import org.launchcode.secret_review.data.ReviewRepository;
import org.launchcode.secret_review.models.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class ReviewController {

    @Autowired
    private ReviewRepository reviewRepository;

    @GetMapping("review")
    private String displayReviews(Model model) {
        model.addAttribute("title", "Create Review");
        model.addAttribute(new Review());
        model.addAttribute("reviews", reviewRepository.findAll());
        return "review";
    }

    @PostMapping("review")
    public String createReviews(@ModelAttribute @Valid Review newReview,
                                Errors errors, Model model) {
        if(errors.hasErrors()) {
            model.addAttribute("title", "Create Review");
            return "review";
        }

        reviewRepository.save(newReview);
        return "redirect:";
    }

}
