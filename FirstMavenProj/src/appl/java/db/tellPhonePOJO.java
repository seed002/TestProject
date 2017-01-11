package db;

import org.json.JSONML;

public class tellPhonePOJO {
     private String name;
     private byte[] homePhone;
     private byte[] tellPhone;
     private String eMail;
     private String lineID;
     private JSONML others;
	public JSONML getOthers() {
		return others;
	}
	public void setOthers(JSONML others) {
		this.others = others;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public byte[] getHomePhone() {
		return homePhone;
	}
	public void setHomePhone(byte[] homePhone) {
		this.homePhone = homePhone;
	}
	public byte[] getTellPhone() {
		return tellPhone;
	}
	public void setTellPhone(byte[] tellPhone) {
		this.tellPhone = tellPhone;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getLineID() {
		return lineID;
	}
	public void setLineID(String lineID) {
		this.lineID = lineID;
	}
}
