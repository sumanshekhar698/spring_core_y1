package spring_core_y.constructor_injections;

import java.util.List;

public class IndianCitizen {
	private String name;
	private Aadhar aadharCard;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Aadhar getAadharCard() {
		return aadharCard;
	}

	public void setAadharCard(Aadhar aadharCard) {
		this.aadharCard = aadharCard;
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	public IndianCitizen(String name, Aadhar aadharCard, List<String> phones) {
		super();
		this.name = name;
		this.aadharCard = aadharCard;
		this.phones = phones;
	}

	private List<String> phones;

	@Override
	public String toString() {
		return "IndianCitizen [name=" + name + ", aadharCard=" + aadharCard + ", phones=" + phones + "]";
	}

}
