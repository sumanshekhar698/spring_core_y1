package spring_core_y.autowiring.annotaions;

public class Address {
	private String city;
	private int pin;
	private String state;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", pin=" + pin + ", state=" + state + "]";
	}

	public Address(String city, int pin, String state) {
		super();
		this.city = city;
		this.pin = pin;
		this.state = state;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

}
