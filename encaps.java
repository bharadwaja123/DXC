
public class encaps {

	private String name;
	private int rollno;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public encaps(String name, int rollno) {
		//super();
		this.name = name;
		this.rollno = rollno;
	}
	
	public void display()
	{
		System.out.println(name+" "+rollno);

	}

}
