package com.kamkanakdurga.sms.exam.dto;

import io.swagger.annotations.ApiModelProperty;

public class TermThreeSADTO {
	
	@ApiModelProperty(position = 0)
	private TermInfoDTO T1;

	@ApiModelProperty(position = 1)
	private TermInfoDTO T2;

	@ApiModelProperty(position = 2)
	private TermInfoDTO T3;

	public TermThreeSADTO(TermInfoDTO t1, TermInfoDTO t2, TermInfoDTO t3) {
		super();
		T1 = t1;
		T2 = t2;
		T3 = t3;
	}

	public TermInfoDTO getT1() {
		return T1;
	}

	public void setT1(TermInfoDTO t1) {
		T1 = t1;
	}

	public TermInfoDTO getT2() {
		return T2;
	}

	public void setT2(TermInfoDTO t2) {
		T2 = t2;
	}

	public TermInfoDTO getT3() {
		return T3;
	}

	public void setT3(TermInfoDTO t3) {
		T3 = t3;
	}

}
