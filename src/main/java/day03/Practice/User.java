package day03.Practice;

public class User {
	private String name;
	private String password;
	private String emailid;
	
	public User() {
		
	}
	
	public User(String name,String password, String emailid) {
		this.name = name;
		this.password = password;
		this.emailid = emailid;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return emailid;
	}
	public void setEmail(String emailid) {
		this.emailid = emailid;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User User1 = new User();
		User1.setName("Karthik");
		User1.setPassword("Karthik@123");
		User1.setEmail("Karthik@gmail.com");
		
		System.out.println("Name :" + User1.getName());
		System.out.println("Email :" + User1.getEmail());
		System.out.println("Password :" + User1.getPassword());

		User User2 = new User("Nithya" , "A01992", "nithi@gmail.com");
		
		
		System.out.println("Name :" + User2.getName());
		System.out.println("Email :" + User2.getEmail());
		System.out.println("Password :" + User2.getPassword());

	}

}
