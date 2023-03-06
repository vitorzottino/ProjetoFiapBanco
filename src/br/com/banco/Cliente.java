package br.com.banco;

public class Cliente {

	private String name, address, birthday;	
	

	public Cliente(String name, String address, String birthday) {
		super();
		this.name = name;
		this.address = address;
		this.birthday = birthday;
	
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

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	
}
