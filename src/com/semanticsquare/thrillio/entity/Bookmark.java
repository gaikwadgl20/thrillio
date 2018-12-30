package com.semanticsquare.thrillio.entity;

import com.semanticsquare.thrillio.constants.KidFriendlyStatus;

public abstract class Bookmark {
	private long id;
	private String title;
	private String profileUrl;
	private String isKidFriendlyStatus = KidFriendlyStatus.UNKNOWN;
	
	
	
	public abstract boolean isKidFriendly();
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getProfileUrl() {
		return profileUrl;
	}

	public void setProfileUrl(String profileUrl) {
		this.profileUrl = profileUrl;
	}

	public String getIsKidFriendlyStatus() {
		return isKidFriendlyStatus;
	}

	public void setIsKidFriendlyStatus(String isKidFriendlyStatus) {
		this.isKidFriendlyStatus = isKidFriendlyStatus;
	}

	@Override
	public String toString() {
		return "Bookmark [id=" + id + ", title=" + title + ", profileUrl=" + profileUrl + "]";
	}


	




}
