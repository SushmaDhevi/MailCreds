package EmailAdministrationApplication;

public class EmailApp {
	public static void main(String[] args) {
		
		//Generating email for user
		Email e1=new Email("Tony","Stark","Stark Industries");
		
		//Giving Alternate mail through Setter method
		e1.setAlternateMail("howard.stark@gmail.com");
		System.out.println("ALTERNATE EMAIL: "+e1.getAlternateMail());
	}
}
