package org.spring.springboot.domain;

import java.util.List;

public class ResultEntity <T>{
	private Long  total; 
	private List<T>  rows;
	
	public Long getTotal() {
		return total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	} 
	
	
}
