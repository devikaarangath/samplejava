package exceptionhandling;

public class customexception {

	public static void main(String[] args) throws AgeException {
		int age = 14;
		if(age > 18)
		{
			System.out.println("Eligible for voting");
		}
		else 
		{
		throw new AgeException("age under 18");
		}
		// TODO Auto-generated method stub

	}

}
