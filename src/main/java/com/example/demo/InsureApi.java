package com.example.demo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bo.*;
import com.example.demo.dto.*;

@RestController
@RequestMapping("/api/v1/")
public class InsureApi {
	
	@RequestMapping("/insure")
	public InsureResponse insure(@RequestBody InsureRequest request){
		
	 
		InsureResponse insureResponse = new InsureResponse();
		insureResponse.setAppNo(request.getAppNo());
		insureResponse.setPolNo(request.getPolNo());
		insureResponse.setPrem(String.valueOf(1000));
		 
		return insureResponse;
		
	}
}
