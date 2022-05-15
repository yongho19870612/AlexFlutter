package com.agent.alexflutter.service.serviceImpl;

import com.agent.alexflutter.service.AgentCapabilityService;
import com.agent.alexflutter.web.dto.agentcapability.AgentCapabilityDto;
import com.agent.alexflutter.web.dto.agentcapability.RequestErrorReport;
import com.agent.alexflutter.web.dto.agentcapability.ResponseErrorReport;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Component
@Service
public class AgentCapabilityServiceImpl implements AgentCapabilityService {


    @Override
    public ResponseEntity<AgentCapabilityDto> getAgentCapabilities() {
        AgentCapabilityDto agentCapabilityDto = new AgentCapabilityDto();
        agentCapabilityDto.set_code(200);
        agentCapabilityDto.set_message("ok");

        String[] arr = new String[2];
        arr[0]="agent";
        arr[1]="user";
        agentCapabilityDto.setCapabilities(arr);

        return new ResponseEntity<>(agentCapabilityDto, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<ResponseErrorReport> getErrorReport(RequestErrorReport requestErrorReport) {
        ResponseErrorReport responseErrorReport = new ResponseErrorReport();

        try {
            if(doReportError(requestErrorReport) == true) {
                responseErrorReport.set_code(200);
                responseErrorReport.set_message("ok");
            } else {
                responseErrorReport.set_code(500);
                responseErrorReport.set_message("fail");
            }
            return new ResponseEntity<>(responseErrorReport, HttpStatus.OK);
        } catch(Exception e) {
            responseErrorReport.set_code(500);
            responseErrorReport.set_message("fail");
            return new ResponseEntity<>(responseErrorReport, HttpStatus.OK);
        }
    }

    public boolean doReportError(RequestErrorReport requestErrorReport) {
        try {
            // DB로 적재 필요시 변경 가능
            //logger.info(requestReportError.toString());
            return true;
        } catch (Exception e){
            //logger.error(e.getMessage());
            return false;
        }
    }
}
