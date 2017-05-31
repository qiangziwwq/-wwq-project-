package org.spring.springboot.domain;

import java.io.Serializable;

public class QueryEntity  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 719351451751083584L;
	public  Integer limit; 
	public  Integer offset;
	public  Integer pageNum; 
    public  Integer pageSize; 
    
	public Integer getPageNum() {
		return pageNum;
	}
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum; 
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getLimit() {
		return limit;
	}
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	public Integer getOffset() {
		return offset;
	}
	public void setOffset(Integer offset) {
		this.offset = offset;
	}
	
}
