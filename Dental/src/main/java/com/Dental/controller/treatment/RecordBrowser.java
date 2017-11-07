package com.Dental.controller.treatment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RecordBrowser {
	@RequestMapping("/dental/HoSoKham")
	public String getFrmHoSo() {
		return "/treatment/frmHoSoKham";
	}
	@RequestMapping("/dental/PhieuKham")
	public String getFrmPhieuKham() {
		return "/treatment/frmPhieuKham";
	}
	
	@RequestMapping("/dental/DangKiKham")
	public String getFrmDangKi() {
		return "/treatment/DangkiKham";
	}
}
