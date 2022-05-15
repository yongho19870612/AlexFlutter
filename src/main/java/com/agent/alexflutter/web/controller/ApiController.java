package com.agent.alexflutter.web.controller;

import com.agent.alexflutter.service.AgentCapabilityService;
import com.agent.alexflutter.web.dto.agentcapability.RequestErrorReport;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/agent/v0")
public class ApiController {

    private final AgentCapabilityService agentCapabilityService;


    //Adapter Agent 서버에 구현되어 있는 Capability 정보를 카카오 i 서비스 시스템에 제공
    @GetMapping("/getAgentCapabilities")
    public ResponseEntity<?> getAgentCapabilities() {
        return agentCapabilityService.getAgentCapabilities();
    }

    //Adapter Agent 서버에 구현되어 있는 Capability 정보를 카카오 i 서비스 시스템에 제공
    @PostMapping("/reportError")
    public ResponseEntity<?> getReportError(@RequestBody RequestErrorReport requestErrorReport) {
        ResponseEntity<?> responseEntity = agentCapabilityService.getErrorReport(requestErrorReport);
        System.out.println(requestErrorReport.getCapability());
        System.out.println(requestErrorReport.getCode());
        System.out.println(requestErrorReport.getData());
        System.out.println(responseEntity);
        return responseEntity;
    }
}
