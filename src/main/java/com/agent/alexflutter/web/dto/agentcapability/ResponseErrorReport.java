package com.agent.alexflutter.web.dto.agentcapability;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ResponseErrorReport {
    private Integer _code;
    private String _message;
}
