package com.manyifu.q.controller;

import org.springframework.http.HttpRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

/**
 * <h3>manyifu</h3>
 *
 * @author : bitso
 * @date : 2023-10-21 18:44
 **/
@RestController
@RequestMapping("q.manyifu.com")
public class ManController {

    @GetMapping("{a}/{b}")
    public String get(@PathVariable String a, @PathVariable String b) {
        return a + b;
    }

}
