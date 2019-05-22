package com.test.easyui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("")
    public String testdata(){
        System.out.println("testdata");
        return "testdatagrid-easyui";
    }

    @GetMapping("main")
    public String main(){
        return "main/index";
    }
}
