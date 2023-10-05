package com.acorn.web;

public class Book {
String name;
String price;

public Book() {
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Book [name=" + name + ", price=" + price + "]";
}

public Book(String name, String price) {
	super();
	this.name = name;
	this.price = price;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPrice() {
	return price;
}

public void setPrice(String price) {
	this.price = price;
}

}
