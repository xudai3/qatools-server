package com.xd.qatools.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping(value = "/v1/index", method = RequestMethod.GET)
    public String initMainPage() {
        return "Hello World";
    }
}
