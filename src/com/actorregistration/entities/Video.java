package com.actorregistration.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Video {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="videoId")
	private int videoId;
	private String videoName;
	private String videoUrl;
	
	@ManyToOne
	@JoinColumn(name="actorId")
	private Actor actor;

	public Video() {
		super();
	}
	public Video(int videoId, String videoName, String videoUrl, Actor actor) {
		super();
		this.videoId = videoId;
		this.videoName = videoName;
		this.videoUrl = videoUrl;
		this.actor = actor;
	}

	public int getVideoId() {
		return videoId;
	}

	public void setVideoId(int videoId) {
		this.videoId = videoId;
	}

	public String getVideoName() {
		return videoName;
	}

	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}

	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

	public Actor getActor() {
		return actor;
	}

	public void setActor(Actor actor) {
		this.actor = actor;
	}
	
	
}
