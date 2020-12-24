package com.ba.beans;
public class Library {
	private int libraryNO;
	private String libraryName;
	private int books;
	public Library(int libraryNO, String libraryName, int books) {
		super();
		this.libraryNO = libraryNO;
		this.libraryName = libraryName;
		this.books = books;
	}
	@Override
	public String toString() {
		return "Library [libraryNO=" + libraryNO + ", libraryName=" + libraryName + ", books=" + books + "]";
	}

}
