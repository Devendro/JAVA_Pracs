// src/main/java/<package>
// run main.java

package com.example.demo2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class InputController {

    @GetMapping("/calculatePercentage")
    public String showForm() {
        return "inputForm";
    }

    @PostMapping("/calculatePercentage")
    public String calculatePercentage(
            @RequestParam String rollNo,
            @RequestParam String name,
            @RequestParam String marks,
            @RequestParam String subject,
            Model model
    ) {
        try {
            int marksInt = Integer.parseInt(marks);
            double percentage = (marksInt / 100.0) * 100;

            model.addAttribute("rollNo", rollNo);
            model.addAttribute("name", name);
            model.addAttribute("marks", marksInt);
            model.addAttribute("subject", subject);
            model.addAttribute("percentage", percentage);

            return "result";
        } catch (NumberFormatException e) {
            model.addAttribute("error", "Marks should be a valid integer.");
            return "inputForm";
        }
    }
}
