package akiyama;

public class Person {
	public String name;
	public int age;
	public String from;

	  public static int count = 0;
	  public String firstName;
	  public String middleName;
	  public String lastName;
	  public double height, weight;
	  public String money;


	Person(String name,int age,String from){
		this.name = name;
		this.age = age;
		this.from = from;

	}

	Person(String name,int age,String from,String money){
		this(name,age,from);
		this.money = money;

	}


	public void profile(){
		System.out.println("私は"+this.name + this.from+"です");

	}

}
