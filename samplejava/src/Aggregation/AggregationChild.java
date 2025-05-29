package Aggregation;

public class AggregationChild {

	String city;
	String state;
	AggregationParent ref;

	public AggregationChild(String city, String state, AggregationParent ref) {
		this.city = city;
		this.state = state;
		this.ref = ref;
	}

	public void display() {
		System.out.println(city + " " + state +" " +ref.name + " " +ref.rollno +" "+ ref.address);
		System.out.println(ref.name + " "+ ref.rollno);
	}

	public static void main(String[] args) {
		AggregationParent obj1 = new AggregationParent("Joy",15,"ABC 123");  //this should be created 1st
		AggregationChild obj = new AggregationChild("Trivandrum", "Kerala", obj1);
		obj.display();
	}
}