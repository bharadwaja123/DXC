class MarksException extends Exception{

public MarksException() {
super("Marks can not exceed 100");
}
}
class Marks
{
	void find(int marks)throws MarksException
	{
		if(marks>100)
		{
			throw new MarksException();
		}
		else
		{
			int marksGot=marks;
			System.out.println(marksGot);
		}
	}
}
public class UnCheckedException 
{
public static void main(String[] args) {
	Marks m=new Marks();
	try {
		m.find(190);
		System.out.println("hell");
	} 
	catch (Exception e) {
		//e.printStackTrace();
		System.out.println(e);
	}
}
}
