package com.cms;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.security.Principal;


@RestController
public class TestController {


    @GetMapping("/user/me")
    public Principal user(Principal principal) {
        return principal;
    }
}
