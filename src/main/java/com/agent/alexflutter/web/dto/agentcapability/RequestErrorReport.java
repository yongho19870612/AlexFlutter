package com.agent.alexflutter.web.dto.agentcapability;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class RequestErrorReport {
    private Integer code;
    private String message;
    private String capability;
    private Object data;
}
