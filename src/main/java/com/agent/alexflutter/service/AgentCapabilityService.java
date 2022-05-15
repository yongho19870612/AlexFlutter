package com.agent.alexflutter.service;

import com.agent.alexflutter.web.dto.agentcapability.RequestErrorReport;
import org.springframework.http.ResponseEntity;

public interface AgentCapabilityService {
    ResponseEntity<?> getAgentCapabilities();

    ResponseEntity<?> getErrorReport(RequestErrorReport requestErrorReport);
}
