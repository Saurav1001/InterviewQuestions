package Misc;

public class DailyPractise1 {
	
	private int age;
	private String name;
	public  DailyPractise1() {
		System.out.println("DailyPractise1-----");
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public static void main(String []args) {
		DailyPractise1 d=new DailyPractise1();
		d.setAge(10);
		d.setName("saurav");
		int a=d.getAge();
		String b=d.getName();
		System.out.println("Age is : "+ a + " "+ "name is : "+ b);
	}

}
