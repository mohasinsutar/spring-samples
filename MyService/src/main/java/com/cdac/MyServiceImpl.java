package com.cdac;

import org.apache.log4j.Logger;

import javax.jws.WebResult;
import javax.jws.WebService;
@WebService(endpointInterface="com.cdac.MyService",
targetNamespace="http://www.example.org",
portName="MyServicePort",
serviceName="MyService"
)
public class MyServiceImpl implements MyService{
	private MyUtil myUtil;
	
	private Logger logger =  Logger.getLogger(MyServiceImpl.class);
	@WebResult(name="BookResponse",targetNamespace="http://www.example.org",partName="BookResponse")
	public BookResponse orderBook(Book b) {
		logger.info("received:" + b);
		BookResponse out = new BookResponse();
		out.setStatus("Success");
		out.setCorrelationid(getMyUtil().getCorrelationId());
		logger.info("sending response:" + out);
		return out;
	}
	public MyUtil getMyUtil() {
		return myUtil;
	}
	public void setMyUtil(MyUtil myUtil) {
		this.myUtil = myUtil;
	}
}
