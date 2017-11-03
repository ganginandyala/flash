package com.fhe.entities;

import java.io.Serializable;

public class Project implements Serializable {
	private int projectId;
	private String tittle;
	private String description;
	private int duration;
	private String clientName;
	private String status;
	private String domain;
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getTittle() {
		return tittle;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", tittle=" + tittle + ", description=" + description + ", duration="
				+ duration + ", clientName=" + clientName + ", status=" + status + ", domain=" + domain + "]";
	}


}
