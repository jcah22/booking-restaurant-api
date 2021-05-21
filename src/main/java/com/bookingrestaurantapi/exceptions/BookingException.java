package com.bookingrestaurantapi.exceptions;

import java.util.ArrayList;
import java.util.List;

import com.bookingrestaurantapi.dtos.ErrorDto;

public class BookingException extends Exception {

	private static final long serialVersionUID = 1L;

	private String code;

	private int responseCode;

	private List<ErrorDto> errorList = new ArrayList<>();

	public BookingException(String code, int resposeCode, String message) {
		super(message);
		this.code = code;
		this.responseCode = resposeCode;
	}

	public BookingException(String code, int resposeCode, String message, List<ErrorDto> errorList) {
		super(message);
		this.code = code;
		this.responseCode = resposeCode;
		this.errorList.addAll(errorList);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}

	public List<ErrorDto> getErrorList() {
		return errorList;
	}

	public void setErrorList(List<ErrorDto> errorList) {
		this.errorList = errorList;
	}

}
