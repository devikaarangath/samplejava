package assignment7;

public class Person {
    private static String name;
    private static int age;

    public static void setDetails(String personName, int personAge) {
        name = personName;
        age = personAge;
    }


    public static void getDetails() {
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
    }

    public static void main(String[] args) {
        setDetails("Devika", 24);
        getDetails();
    }
}
