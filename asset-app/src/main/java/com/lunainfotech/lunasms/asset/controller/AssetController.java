package com.lunainfotech.lunasms.asset.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//import com.lunainfotech.lunasms.commons.entities.Admission;



@RestController
public class AssetController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/asset")
    public String admission(@RequestParam(value="name", defaultValue="World") String name) {
        return "hello asset module";
    }
    
}
