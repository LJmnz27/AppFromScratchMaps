package org.pursuit.appfromscratchmaps.models;

public class Museum {
	private String zip;
	private String address;
	private String city;
	private String name;
	private String state;

    public Museum(String zip, String address, String city, String name, String state) {
        this.zip = zip;
        this.address = address;
        this.city = city;
        this.name = name;
        this.state = state;
    }

    public void setZip(String zip){
		this.zip = zip;
	}

	public String getZip(){
		return zip;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public String getAddress(){
		return address;
	}

	public void setCity(String city){
		this.city = city;
	}

	public String getCity(){
		return city;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setState(String state){
		this.state = state;
	}

	public String getState(){
		return state;
	}
}
