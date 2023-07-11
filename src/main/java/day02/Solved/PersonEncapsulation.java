package day02.Solved;

public class PersonEncapsulation {
    private String name;  // Private data member

    public String getName() {  // Public getter method
        return name;
    }

    public void setName(String nam) {  // Public setter method
        // name = name; Wrong way to use refer the attribute of class
			this.name = nam; // this Keyword used for referring current instance
    }


// Usage
	public static void main(String[] args) {

PersonEncapsulation person = new PersonEncapsulation();
person.setName("John");      
String name1 = person.getName(); 
System.out.println(name1);   
	}
}