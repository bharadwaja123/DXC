
public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='a';
		int s=4;
		int dl=2;
		int rp=dl*70;
		//int i=3;
		//int u=4;
		//String a="hell";
		//System.out.println(i+u);
		//System.out.println(i+a);
		System.out.println("dollar value="+rp);
		
		if(s%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
		if(c>='A' && c<='Z')
		{
			System.out.println("upper");
		}
		else if (c>='a' && c<='b')
		{
			System.out.println("Lower");
		}
		else
		{
			System.out.println("Invalid Alphabet");
		}
		

	}

}
