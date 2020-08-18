
public class task2C {
	
	boolean equal(char a,char b)
	{
		int d=a;
		int e=b;
		if(d==e||d+32==e||d==e+32||d-32==e||d==e-32)
		{
			return true;
		}
		else
		{
		return false;
		}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		task2C b=new task2C();
		boolean c=b.equal('b','B');
		System.out.println(c);

	}

}
