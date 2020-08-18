
public class cons {
	int x=20;
 /* void conn() this is for constructor
	{
		x=100;
	}*/
	void disp()
	{
		int x=30;
		System.out.println(x);
		System.out.println(this.x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cons c=new cons();
		c.disp();

	}

}
