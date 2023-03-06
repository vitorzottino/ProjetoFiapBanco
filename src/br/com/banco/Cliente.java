package br.com.banco;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Cliente {

	protected String name, address;
	protected final Date birthday;
	
	

	public Cliente(String name, String address, String birthday) throws ParseException { //Converter date para string em birthday
		super();
		this.name = name;
		this.address = address;
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		this.birthday = format.parse(birthday);
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBirthday() {
		return birthday;
	}
	
	
}
