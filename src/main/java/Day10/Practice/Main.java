package Day10.Practice;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            String email = "karthik@gmail.com";
            EmailException.isValidEmail(email);

            ValidateUser user = new ValidateUser();
            user.register(new ValidateUser(1, "Karthik", email));
            user.register(new ValidateUser(1, "panner selvam", email));

            System.out.println("User registered successfully.");
        } catch (InvalidEmailException | UserAlreadyExistsException e) {
            e.printStackTrace();
        }
	}

}
