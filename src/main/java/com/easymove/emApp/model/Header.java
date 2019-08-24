package com.easymove.emApp.model;

import java.sql.Blob;
import java.sql.Clob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="header")
public class Header {
	
	public Header() {
		
	}
	@Id
	@Column(name = "header_id")
	private Integer headerId;
	@Column(name = "header_name")
	private String headerName;
	@Column(name = "introduction", columnDefinition = "TEXT")
	private String introduction;
	public Integer getHeaderId() {
		return headerId;
	}
	public void setHeaderId(Integer headerId) {
		this.headerId = headerId;
	}
	public String getHeaderName() {
		return headerName;
	}
	public void setHeaderName(String headerName) {
		this.headerName = headerName;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

}
