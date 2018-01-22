package com.cdac;

import java.util.UUID;

public class MyUtil {
	public String getCorrelationId(){
		UUID uuid = UUID.randomUUID();
		return uuid.toString();
	}
}
