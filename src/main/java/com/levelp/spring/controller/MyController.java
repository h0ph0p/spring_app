package com.levelp.spring.controller;


import com.levelp.spring.DAO.daoCharacteristics;
import com.levelp.spring.Entity.CharacteristicsEntity;
//import com.levelp.spring.DAO.;
import com.levelp.spring.service.CharactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MyController {

    private daoCharacteristics _dao = new daoCharacteristics();

    @Autowired
    CharactService service;

    @RequestMapping(value = "/hello")
    public String hello(ModelMap map){

//        _dao = new daoCharacteristics();
        List<CharacteristicsEntity> list = service.findAll();
        map.addAttribute("list", list);
        return "index";
    }

}
