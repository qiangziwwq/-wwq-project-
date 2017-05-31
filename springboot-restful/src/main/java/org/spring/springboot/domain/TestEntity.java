package org.spring.springboot.domain;

public class TestEntity  extends QueryEntity {
	/*"Tid": "3",
    "First": "作家崔成浩",
    "sex": "男",
    "Score": "80"*/
	private Integer tid; 
	private String  first; 
	private String  sex; 
	private Integer score;
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	} 
	
}
