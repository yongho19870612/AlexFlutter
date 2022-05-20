package com.agent.alexflutter.web.controller;

import com.agent.alexflutter.service.UserCapabilityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/agent/v0")
public class UserController {

    private final UserCapabilityService userCapabilityService;

    @GetMapping("/getUserMetadata")
    public ResponseEntity<?> getUserMetadata()
    {
        return userCapabilityService.getUserMetadata();
    }
}
