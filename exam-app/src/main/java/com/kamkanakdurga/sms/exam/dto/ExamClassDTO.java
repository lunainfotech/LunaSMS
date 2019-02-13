package com.kamkanakdurga.sms.exam.dto;


import io.swagger.annotations.ApiModelProperty;

public class ExamClassDTO {

	@ApiModelProperty(position = 0)
	private int classId;
	
	@ApiModelProperty(position = 1)
	private String className;

	public ExamClassDTO(int classId, String className) {
		super();
		this.classId = classId;
		this.className = className;
	}

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
	
}
