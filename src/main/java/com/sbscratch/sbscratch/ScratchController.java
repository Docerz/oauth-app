package com.sbscratch.sbscratch;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.ui.Model;

public class ScratchController {

    @RequestMapping("/")
    public String getUserName(Model model, OAuth2AuthenticationToken token) {
        model.addAttribute("userName", token.getPrincipal().getName());
        return "authd";
    }
}