
class demo
{
	int empid;
	String empname;
	void ins(String empname,int empid)
	{
		this.empname=empname;
		this.empid=empid;
	}
	void disp()
	{
		System.out.println(empname+" "+empid);
	}
}
public class init {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo d=new demo();
		d.ins("bobby",12);
		demo d1=new demo();
		d1.ins("subbu",123);
         d.disp();
         d1.disp();
	}

}
