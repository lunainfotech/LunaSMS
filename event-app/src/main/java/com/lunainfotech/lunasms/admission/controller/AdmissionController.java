package com.lunainfotech.lunasms.admission.controller;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lunainfotech.lunasms.commons.entities.Admission;



@RestController
public class AdmissionController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/admission")
    public Admission admission(@RequestParam(value="name", defaultValue="World") String name) {
        return new Admission(counter.incrementAndGet(),
                            String.format(template, name));
    }
}
