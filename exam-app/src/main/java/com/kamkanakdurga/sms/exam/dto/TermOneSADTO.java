package com.kamkanakdurga.sms.exam.dto;

import io.swagger.annotations.ApiModelProperty;

public class TermOneSADTO {
	
	@ApiModelProperty(position = 0)
	private TermInfoDTO T1;

	public TermOneSADTO(TermInfoDTO t1) {
		super();
		T1 = t1;
	}

	public TermInfoDTO getT1() {
		return T1;
	}

	public void setT1(TermInfoDTO t1) {
		T1 = t1;
	}
	
}
