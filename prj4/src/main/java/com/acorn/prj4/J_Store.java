package com.acorn.prj4;

import lombok.Data;

@Data
public class J_Store {
String storename;
String address;
String name;
String tel;
String bnum;

public J_Store(String storename, String address, String name, String tel, String bnum) {
	super();
	this.storename = storename;
	this.address = address;
	this.name = name;
	this.tel = tel;
	this.bnum = bnum;
}


public J_Store() {
	// TODO Auto-generated constructor stub
}




}
