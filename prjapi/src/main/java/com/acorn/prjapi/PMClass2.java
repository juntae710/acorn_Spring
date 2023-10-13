package com.acorn.prjapi;

public class PMClass2 {

String informCode;
String informCause;
String informOverall;
String informGrade;
String dataTime;
String informData;

public PMClass2() {
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "PMClass2 [informCode=" + informCode + ", informCause=" + informCause + ", informOverall=" + informOverall
			+ ", informGrade=" + informGrade + ", dataTime=" + dataTime + ", informData=" + informData + "]";
}

public PMClass2(String informCode, String informCause, String informOverall, String informGrade, String dataTime,
		String informData) {
	super();
	this.informCode = informCode;
	this.informCause = informCause;
	this.informOverall = informOverall;
	this.informGrade = informGrade;
	this.dataTime = dataTime;
	this.informData = informData;
}

public String getInformCode() {
	return informCode;
}

public void setInformCode(String informCode) {
	this.informCode = informCode;
}

public String getInformCause() {
	return informCause;
}

public void setInformCause(String informCause) {
	this.informCause = informCause;
}

public String getInformOverall() {
	return informOverall;
}

public void setInformOverall(String informOverall) {
	this.informOverall = informOverall;
}

public String getInformGrade() {
	return informGrade;
}

public void setInformGrade(String informGrade) {
	this.informGrade = informGrade;
}

public String getDataTime() {
	return dataTime;
}

public void setDataTime(String dataTime) {
	this.dataTime = dataTime;
}

public String getInformData() {
	return informData;
}

public void setInformData(String informData) {
	this.informData = informData;
}


}
