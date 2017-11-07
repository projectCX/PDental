package com.Dental.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Dental.api.bean.AddSeviceBean;
import com.Dental.api.bean.ApiResult;
import com.Dental.api.bean.ServiceBean;

@RestController
public class ServiceAController {

	@RequestMapping(value="/addService")
	public ApiResult addService(@Valid AddSeviceBean addService, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			System.out.println(bindingResult.getAllErrors().toString());
		}
		ApiResult apiResult = new ApiResult();
		//validate
		//add -> add Phieu kham (idHoSo)
		//for -> add Service (idPhieuKham)
//		System.out.println(addService.getListService().size());
		System.out.println(addService.getHosoId());
//		System.out.println(hosoId);
		apiResult.setSuccessed(true);
		return apiResult;
	}
	
}
