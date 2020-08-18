class arguments
{
	int x;
	arguments()
	{
		x=50;
	}
	arguments(int a)
	{
		x=100;
	}
	void disp()
	{
		System.out.println(x);
	}
}
public class consargs {
	public static void main(String[] args) {
		arguments a=new arguments((int)10.5f);
		a.disp();
		
	}

}
