package com.edu.mybatis.controller;

import com.edu.mybatis.CompanyMapper;
import com.edu.mybatis.bean.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {
    @Autowired
    CompanyMapper companyMapper;

    @GetMapping("/com/{id}")
    public Company getCom(@PathVariable Integer id){
        return companyMapper.getComById(id);
    }
}
