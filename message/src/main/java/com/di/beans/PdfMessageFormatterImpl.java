package com.di.beans;

public class PdfMessageFormatterImpl implements IMessageFormatter{
public String messageFormatter(String message) {
	return "<pdf>"+message+"</pdf>";
}
}
