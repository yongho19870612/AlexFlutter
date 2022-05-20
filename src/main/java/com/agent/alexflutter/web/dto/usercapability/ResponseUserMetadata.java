package com.agent.alexflutter.web.dto.usercapability;

import lombok.*;

import java.util.List;

@Data
public class ResponseUserMetadata {
    private Integer _code;
    private String message;
    private Object profile;
    private Object synchronize_options;
    private String []account_categories;

}
