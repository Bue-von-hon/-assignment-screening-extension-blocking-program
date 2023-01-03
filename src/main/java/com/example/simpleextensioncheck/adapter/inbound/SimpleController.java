package com.example.simpleextensioncheck.adapter.inbound;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class SimpleController {
    @GetMapping("/")
    public String index() {
        return "index.html";
    }
}
