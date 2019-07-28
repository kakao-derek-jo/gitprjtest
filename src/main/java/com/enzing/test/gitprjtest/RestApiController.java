package com.enzing.test.gitprjtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {

    @GetMapping("/enzing")
    public Object getEnzing() {
        return "hello enzing";
    }
}
