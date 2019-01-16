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
	
}
