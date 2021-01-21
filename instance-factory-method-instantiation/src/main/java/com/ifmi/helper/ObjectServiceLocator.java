package com.ifmi.helper;

import com.icici.beans.QuoteEjb;
import com.icici.beans.QuoteEjbImpl;

public class ObjectServiceLocator {
	
	QuoteEjb getObject(String name)
	{
		if(name.equals("quoteEjb"))
		{
			return new QuoteEjbImpl();
		}
		
			return null;
	}
	
}
