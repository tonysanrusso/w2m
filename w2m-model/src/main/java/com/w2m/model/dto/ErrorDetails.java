package com.w2m.model.dto;

import java.util.Date;

public class ErrorDetails {

	private Date timestamp;

	private String message;

	private String details;

	public ErrorDetails(final Date timestamp, final String message, final String details) {
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}

	public Date getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(final Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(final String message) {
		this.message = message;
	}

	public String getDetails() {
		return this.details;
	}

	public void setDetails(final String details) {
		this.details = details;
	}

}