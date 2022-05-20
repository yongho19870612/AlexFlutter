package com.agent.alexflutter.web.dto.usercapability;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Editability {
    private Boolean name;
    private Boolean nickname;
    private Boolean email;
    private Boolean telephone;
    private Boolean birthday;
    private Boolean is_lunar;
    private Boolean is_leap_month;
    private Boolean gender;
    private Boolean photo_url;
}
