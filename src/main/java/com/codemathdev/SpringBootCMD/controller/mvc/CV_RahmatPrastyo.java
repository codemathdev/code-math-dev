package com.codemathdev.SpringBootCMD.controller.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cv_rahmatprastyo")
public class CV_RahmatPrastyo {

    @GetMapping
    public String CV_RahmatPrastyo() {
        return "CV_RahmatPrastyo";
    }

}
