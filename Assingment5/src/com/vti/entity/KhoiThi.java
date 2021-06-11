package com.vti.entity;

public class KhoiThi {
public String name;
public String subject;

public KhoiThi(String name) {
	super();
	this.name = name;
}

/**
 * @return the name
 */
public String getName() {
	return name;
}

/**
 * @return the subject
 */
public String getSubject() {
	switch (this.name) {
	case "A":
	this.subject = "Toán, Lý, Hóa";
	break;
	case "B":
	this.subject = "Toán, Hóa, Sinh";
	break;
	case "C":
	this.subject = "Văn, Sử, Địa";
	break;
	}
	return this.subject;
	}



}
