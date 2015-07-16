package pack;

public class EditorInfo {
	 
	     private String ID;
	     private String Firstname;
	     private String Lastname;
	     private int age;
	     private double salary;
	 
	     public EditorInfo() {
			super();
			// TODO Auto-generated constructor stub
		}

		public EditorInfo(String ID, String Firstname, String Lastname, int age, double salary) {
	          this.ID = ID;
	          this.Firstname = Firstname;
	          this.Lastname = Lastname;
	          this.age = age;
	          this.salary = salary;
	     }
	 
	     @Override
	     public String toString() {
	          return "<" + ID + ", " + Firstname + ", " + Lastname + ", " + age + ", "
	                                   + salary + ">";
	     }
}