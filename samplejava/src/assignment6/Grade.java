package assignment6;
class Student {
	int mark1,mark2,mark3;
	Student(int sub1, int sub2, int sub3){
		mark1 = sub1;
		mark2 = sub2;
		mark3 = sub3;
	}
	public String getgrade() {
		int average = (this.mark1+this.mark2+this.mark3)/3;
		if(average >= 80) {
			return "A";
		} else if(average < 80 && average >= 60)	{
			return "B";
		} else if(average < 60 && average >= 40)	{
			return "C";
		} else {
			return "Failed";
		}
	}
}
public class Grade{
	public static void main(String[] args) {
		Student student1 = new Student(90,96,97);
		Student student2 = new Student(60,71,63);
		Student student3 = new Student(40,41,36);
		String result = student1.getgrade();
		System.out.println("the grade of student1 is: "+result);
		result = student2.getgrade();
		System.out.println("the grade of student2 is: "+result);
		result = student3.getgrade();
		System.out.println("the grade of student3 is: "+result);
	}
}