package org.chalenges.solutions.append_and_delete.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RecordEntity {
	public RecordEntity(String firstString, String secondString,String result ,long timeTaken) {
		super();
		this.firstString = firstString;
		this.secondString = secondString;
		this.timeTaken = timeTaken;
		this.result=result;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String firstString;
	public String getFirstString() {
		return firstString;
	}
	public void setFirstString(String firstString) {
		this.firstString = firstString;
	}
	public String getSecondString() {
		return secondString;
	}
	public void setSecondString(String secondString) {
		this.secondString = secondString;
	}
	public long getTimeTaken() {
		return timeTaken;
	}
	public void setTimeTaken(long timeTaken) {
		this.timeTaken = timeTaken;
	}
	private String secondString;
	private long timeTaken;
	private String result;
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
}
