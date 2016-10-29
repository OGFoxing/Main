package kz.ogfox.serialization;

import java.io.Serializable;


@SuppressWarnings("serial")
public class Profile implements Serializable {
	private String id;
	private String name;
	private String address;
	private String ext_id;
	private String ext_name;
	private String ext_address;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getExt_id() {
		return ext_id;
	}
	public void setExt_id(String ext_id) {
		this.ext_id = ext_id;
	}
	public String getExt_name() {
		return ext_name;
	}
	public void setExt_name(String ext_name) {
		this.ext_name = ext_name;
	}
	public String getExt_address() {
		return ext_address;
	}
	public void setExt_address(String ext_address) {
		this.ext_address = ext_address;
	}
	
	
}
