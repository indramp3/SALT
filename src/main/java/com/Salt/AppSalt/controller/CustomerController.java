package com.Salt.AppSalt.controller;

import com.Salt.AppSalt.dto.CustomerInsertDto;
import com.Salt.AppSalt.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/index")
    public String index(Model model){

        model.addAttribute("list", customerService.getList());

        return "/customer/index";
    }

    @GetMapping("/insert")
    public String insert(Model model){
        CustomerInsertDto dto = new CustomerInsertDto();
        model.addAttribute("dto", dto);

        return "customer/insert";
    }

    @PostMapping("insert")
    public String insert(@Valid @ModelAttribute("dto") CustomerInsertDto dto,
                         BindingResult bindingResult,
                         Model model){

        if(bindingResult.hasErrors()){
            model.addAttribute("dto", dto);
            return "/customer/insert";
        }
        else {
            customerService.insert(dto);
            return "redirect:/customer/index";
        }

    }
}
