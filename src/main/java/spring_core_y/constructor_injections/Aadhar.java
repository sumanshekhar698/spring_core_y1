package spring_core_y.constructor_injections;

public class Aadhar {

	private int aadharNo;
	private String address;
	private String dob;
	
	public Aadhar(int aadharNo, String address, String dob) {
		super();
		this.aadharNo = aadharNo;
		this.address = address;
		this.dob = dob;
	}

	public int getAadharNo() {
		return aadharNo;
	}

	public String getAddress() {
		return address;
	}

	public String getDob() {
		return dob;
	}
	
	
}
