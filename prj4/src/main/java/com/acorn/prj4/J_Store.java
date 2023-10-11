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


public String getStorename() {
	return storename;
}


public void setStorename(String storename) {
	this.storename = storename;
}


public String getAddress() {
	return address;
}


public void setAddress(String address) {
	this.address = address;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getTel() {
	return tel;
}


public void setTel(String tel) {
	this.tel = tel;
}


public String getBnum() {
	return bnum;
}


public void setBnum(String bnum) {
	this.bnum = bnum;
}


@Override
public String toString() {
	return "J_Store [storename=" + storename + ", address=" + address + ", name=" + name + ", tel=" + tel + ", bnum="
			+ bnum + "]";
}




}
