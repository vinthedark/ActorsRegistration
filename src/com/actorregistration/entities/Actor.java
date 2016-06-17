package com.actorregistration.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Actor {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="actorId")
	private int actorId;
	private String actorName;
	@Column(unique=true)
	private long actorContactNo;
	@Column(unique=true)
	private String actorMailId;
	private String actorAddress;

	public Actor() {
		super();
	}

	public Actor(String actorName, long actorContactNo, String actorMailId, String actorAddress) {
		super();
		this.actorName = actorName;
		this.actorContactNo = actorContactNo;
		this.actorMailId = actorMailId;
		this.actorAddress = actorAddress;
	}

	public int getActorId() {
		return actorId;
	}

	public void setActorId(int actorId) {
		this.actorId = actorId;
	}

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	public long getActorContactNo() {
		return actorContactNo;
	}

	public void setActorContactNo(long actorContactNo) {
		this.actorContactNo = actorContactNo;
	}

	public String getActorMailId() {
		return actorMailId;
	}

	public void setActorMailId(String actorMailId) {
		this.actorMailId = actorMailId;
	}

	public String getActorAddress() {
		return actorAddress;
	}

	public void setActorAddress(String actorAddress) {
		this.actorAddress = actorAddress;
	}
	
}
