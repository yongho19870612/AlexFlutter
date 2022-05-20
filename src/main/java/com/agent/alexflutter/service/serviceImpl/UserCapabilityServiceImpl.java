package com.agent.alexflutter.service.serviceImpl;

import com.agent.alexflutter.service.UserCapabilityService;
import com.agent.alexflutter.web.dto.usercapability.Editability;
import com.agent.alexflutter.web.dto.usercapability.ResponseUserMetadata;
import com.agent.alexflutter.web.dto.usercapability.SynchronizeOptions;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.sql.Struct;

@RequiredArgsConstructor
@Component
@Service
public class UserCapabilityServiceImpl implements UserCapabilityService {
    @Override
    public ResponseEntity<?> getUserMetadata() {
        Editability editability = new Editability();
        editability.setName(false);
        editability.setNickname(false);
        editability.setEmail(false);
        editability.setTelephone(true);
        editability.setBirthday(false);
        editability.setIs_lunar(false);
        editability.setGender(false);
        editability.setPhoto_url(false);

        SynchronizeOptions synchronizeOptions = new SynchronizeOptions();
        synchronizeOptions.setDisplay_name("정직원 제외");
        synchronizeOptions.setValue("except_full_time_employee");

        ResponseUserMetadata responseUserMetadata = new ResponseUserMetadata();
        responseUserMetadata.set_code(200);
        responseUserMetadata.setMessage("ok");
        responseUserMetadata.setProfile(editability);
        responseUserMetadata.setSynchronize_options(synchronizeOptions);


        return new ResponseEntity<>(responseUserMetadata, HttpStatus.OK);
    }
}
