package com.kamkanakdurga.sms.location.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ap_mandal")
public class Mandal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "block_code")
	private int blockCode;
	
	@Column(name = "block_name")
	private String blockName;
	
	@Column(name = "district_code")
	private int districtCode;
	
	public Mandal() {
		
	}
		
	public Mandal(Integer id, int blockCode, String blockName, int districtCode) {
		//super();
		this.id = id;
		this.blockCode = blockCode;
		this.blockName = blockName;
		this.districtCode = districtCode;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getBlockCode() {
		return blockCode;
	}

	public void setBlockCode(int blockCode) {
		this.blockCode = blockCode;
	}

	public String getBlockName() {
		return blockName;
	}

	public void setBlockName(String blockName) {
		this.blockName = blockName;
	}

	public int getDistrictCode() {
		return districtCode;
	}

	public void setDistrictCode(int districtCode) {
		this.districtCode = districtCode;
	}
	
}
