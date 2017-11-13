import java.util.Scanner;

public class UserException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the age");
	
		
		int age = s.nextInt();

		s.close();

		
		if (age < 0) {

		

			try {

				

				throw new NegativeAgeException("Age should not be less than Zero");
			}

			catch (NegativeAgeException e) {
				
				System.out.println(e);

			}
		} else {
			
			System.out.println("Age is: " + age);

		}

	}

}