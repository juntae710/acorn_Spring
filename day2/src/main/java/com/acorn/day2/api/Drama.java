package com.acorn.day2.api;

import lombok.Data;

@Data
public class Drama {
String name;
String actor;
public Drama() {
	// TODO Auto-generated constructor stub
}

public Drama(String name, String actor) {
	super();
	this.name = name;
	this.actor = actor;
}

public void setName(String name) {
	this.name = name;
}
public void setActor(String actor) {
	this.actor = actor;
}

public String getName() {
	return name;
}

public String getActor() {
	return actor;
}

@Override
public String toString() {
	return "Drama [name=" + name + ", actor=" + actor + "]";
}

}
