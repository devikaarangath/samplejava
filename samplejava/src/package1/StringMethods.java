package package1;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "Java";
		char c = s.charAt(2);
		System.out.println("character at position 2 is :"+c);
		int len = s.length();
		System.out.println("length of the string is :"+len);
		System.out.println(s.isEmpty());
		System.out.println(s.concat(" class "));
		String s1 = "JAVA";
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s.toUpperCase());

	}

}
