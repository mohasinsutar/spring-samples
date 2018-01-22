package com.cdac;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class BookResponse {
	private String status;
	private String correlationid;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCorrelationid() {
		return correlationid;
	}

	public void setCorrelationid(String correlationid) {
		this.correlationid = correlationid;
	}
	
}
