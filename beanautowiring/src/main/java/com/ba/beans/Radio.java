package com.ba.beans;
public class Radio {
	Reciever reciever;
	Tunner tunner;

	
	public Radio() {
		super();
	}

	public Radio(Tunner tunner) {
		super();
		this.tunner = tunner;
	}

	public Radio(Reciever reciever, Tunner tunner) {
		super();
		this.reciever = reciever;
		this.tunner = tunner;
	}

	@Override
	public String toString() {
		return "Radio [reciever=" + reciever + ", tunner=" + tunner + "]";
	}

	
	
}
