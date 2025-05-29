package package1;

public class StringBuilderMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 StringBuilder sb = new StringBuilder();
	 
	 sb.append("Hello World");
	 System.out.println(sb.toString());
     
	 sb.insert(4, ", Java");
	 System.out.println(sb.toString());
	 
	 sb.replace(5, 10, "python");
	 System.out.println(sb.toString());
	 
	 sb.delete(4, 4);
	 System.out.println(sb.toString());
	 
	 sb.reverse();
	 System.out.println(sb.toString());
	}

}
