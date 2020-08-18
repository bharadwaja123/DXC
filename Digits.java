
public class Digits {
	boolean Check(String data)
	{
		char[] arr=data.toCharArray();
		for(int i=0;i<data.length()-1;i++)
		{
			if(!(arr[i]>='0' && arr[i]<='9'))
				return false;
			}
				return true;
			}
		boolean num(String str)
		{
		char[] arr=str.toCharArray();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
		count++;
		if(count==10)
			return true;
}
return false;
}
	public static void main(String[] args) {
		Digits d=new Digits();
		boolean b=d.Check("hell12");
		System.out.println(b);
		Digits d1=new Digits();
		boolean b1=d1.Check("12234567890");
		System.out.println(b1);

	}

}
