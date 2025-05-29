package assignment7;

public class Voting {

	public static void main (String[]args)
	  {
		boolean result = isEligibleForVoting(24);
		if(result) {
			System.out.print("Eligible for voting");
		} else {
			System.out.print("Not Eligible for voting");
		}
	  }
	
	public static boolean isEligibleForVoting(int age) {
		if(age>=18)
	    {
	        return true;
	    }
	    else
	    {
	    	return false;
	    }
	}
}
