package com.agent.alexflutter.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class AgentContoller {

    @GetMapping("/abc")
    public String index()
    {
        return "board/write";
    }
}
