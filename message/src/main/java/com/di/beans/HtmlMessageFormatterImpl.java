package com.di.beans;

public class HtmlMessageFormatterImpl implements IMessageFormatter{
public String messageFormatter(String message) {
	return "<html><Body>"+message+"</body></html>";
}
}
