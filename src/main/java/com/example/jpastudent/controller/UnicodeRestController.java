package com.example.jpastudent.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UnicodeRestController {

    @GetMapping("/unicode/{i}")
    public String unicodeToChar(@PathVariable int i) {
        char c = (char)i;
        return "unicode=" + i + " char=" + c;
    }

    @GetMapping("/ch/{ch}")
    public String unicodeValueCharacter(@PathVariable Character ch) {
        int i = ch;
        //int i2 = ch.hashCode();
        return "char="+ ch + " unicode=" + i;
    }


}
