package com.cdac;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
@WebService
@SOAPBinding(parameterStyle= SOAPBinding.ParameterStyle.BARE)
public interface MyService {
	@WebMethod
	public BookResponse orderBook(@WebParam(name = "Book", targetNamespace = "http://www.example.org",  partName = "Book")Book b);
}
