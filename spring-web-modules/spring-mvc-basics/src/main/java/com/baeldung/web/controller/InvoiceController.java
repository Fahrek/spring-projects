package com.baeldung.web.controller;

import com.baeldung.model.Invoice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/invoice")
public class InvoiceController {

    @GetMapping
    public String showForm(Model model) {
        model.addAttribute("invoice", new Invoice());
        return "invoice/create";
    }

    @PostMapping
    public String submitForm(@ModelAttribute("invoice") Invoice invoice) {
        return "invoice/summary";
    }
}
