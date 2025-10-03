package com.LibraryManagement.LibraryManagement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @GetMapping("/home")
    public String greet() {
//        System.out.println("good Evening bhaskar");
        return "good evening shreyash";
    }
}
