package com.kamkanakdurga.sms.library.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ap_menu_groups")
public class MenuGroups {
	
	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Integer id;
	
	  @Column(name = "name", unique = true, nullable = false)
	  private String name;
	  
	  @Column(name = "description", unique = true, nullable = false)
	  private String description;
	  
	  @Column(name = "url", unique = true, nullable = false)
	  private String url;
	  
	  @Column(name = "icon")
	  private String icon;
	  
	  @Column(name = "sequence", nullable = false)
	  private int sequence;
	  
	  @Column(name = "deleted", nullable = false)
	  private int deleted;
	  
	  @Column(name = "in_active", nullable = false)
	  private int InActive;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public int getDeleted() {
		return deleted;
	}
	
	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public void setDeleted(int deleted) {
		this.deleted = deleted;
	}

	public int getInActive() {
		return InActive;
	}

	public void setInActive(int inActive) {
		InActive = inActive;
	}

}
