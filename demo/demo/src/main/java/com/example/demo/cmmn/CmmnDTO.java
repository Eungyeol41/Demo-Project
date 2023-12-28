package com.example.demo.cmmn;

import org.apache.ibatis.type.Alias;

@Alias("cmmnDTO")
public class CmmnDTO {

	private String procType; // 구분값

	public String getProcType() {
		return procType;
	}

	public void setProcType(String procType) {
		this.procType = procType;
	}
}
