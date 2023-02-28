package spring_core_y.injecting_collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
	private String name;
	private List<String> phones;
	private Set<String> address;
	private Properties general;
	private Map<String, String> courseEnrolled;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	public Set<String> getAddress() {
		return address;
	}

	public void setAddress(Set<String> address) {
		this.address = address;
	}

	public Properties getGeneral() {
		return general;
	}

	public void setGeneral(Properties general) {
		this.general = general;
	}

	public Map<String, String> getCourseEnrolled() {
		return courseEnrolled;
	}

	public void setCourseEnrolled(Map<String, String> courseEnrolled) {
		this.courseEnrolled = courseEnrolled;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", phones=" + phones + ", address=" + address + ", general=" + general
				+ ", courseEnrolled=" + courseEnrolled + "]";
	}

}
