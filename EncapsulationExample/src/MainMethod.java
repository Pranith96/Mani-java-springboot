
public class MainMethod {

	public static void main(String[] args) {

		Address address = new Address();
		address.setPlotNo(1);
		address.setPincode("1234567");
		address.setCity("HYD");
		address.setState("ASDFG");

		Student student = new Student();
		student.setId(1);
		student.setName("ABCDE");
		student.setMobileNumber("1234567890");
		student.setAddress(address);

		System.out.println(student);
		String name = student.getName();
		System.out.println(name);
		
		Student student1 = new Student();
		student1.setId(2);
		student1.setName("ABCDF");
		student1.setMobileNumber("1234567899");
		student1.setAddress(address);
	}

}
