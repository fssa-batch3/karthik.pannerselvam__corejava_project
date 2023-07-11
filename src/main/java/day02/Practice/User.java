package day02.Practice;

public class User {
	
	private int id;
	private String name;
	private String password;
	private String emailId;
	
	public void setId(int id){
		this.id = id;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setPassword(String password){
		this.password = password;
	}
	public void setEmail(String emailId){
		this.emailId = emailId;
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	public String getEmail() {
		return emailId;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setId(10);
		user.setName("Karthik");
		user.setPassword("Karthik@69");
		user.setEmail("karthik@gmail.com");
		
		System.out.println("UserDetails");
		System.out.println("ID :"+ user.getId());
		System.out.println("Name :"+ user.getName());
		System.out.println("Password :"+ user.getPassword());
		System.out.println("Email :"+user.getEmail());
	}

}
