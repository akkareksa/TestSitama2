/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.restAPI.Controller;

import com.example.restAPI.Entity.Header;
import com.example.restAPI.Repository.DetailRepository;
import com.example.restAPI.Repository.HeaderRepository;
import com.example.restAPI.Service.HeaderDetailService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author vckev
 */
@RestController
@RequestMapping("/header-detail")
public class HeaderDetailController {
    private HeaderDetailService service;

    public HeaderDetailController(HeaderDetailService service) {
        this.service = service;
    }
    
    @GetMapping
    public Object findAllHeaderDetail() {
        return service.getData();
    }
//    
//    @GetMapping("/{headerId}")
//    public Header findHeader(Long id) {
//        return headerRepository.findById(id).orElse(null);
//    }
}
