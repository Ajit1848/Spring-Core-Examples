package com.di.beans;

public class MessageWriter {
	IMessageFormatter messageFormatter;
	public void writeMessage(String message)
	{
		System.out.println(messageFormatter.messageFormatter(message));
	}
	public void setMessageFormatter(IMessageFormatter messageFormatter) {
		this.messageFormatter = messageFormatter;
	}

}
