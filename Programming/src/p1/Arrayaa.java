package p1;

import java.util.ArrayList;
import java.util.List;

class Arrayss
{
	private int number;
    private String name;
    private int age;
    

    public Arrayss(int number, String name, int age){
        this.number = number;
        this.name = name;
        this.age = age;
    }

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
    
	}

	

public class Arrayaa 
{

	public static void main(String[] args) 
	{

		List<Arrayss> students = new ArrayList<Arrayss>();
		Arrayss foo = new Arrayss(1, "Mohan Singh", 23);
		 students.add(foo); 
		 System.out.println(foo.getNumber());
		 System.out.println(foo.getName());
		 System.out.println(foo.getAge());

	}

}
