
public class taskDay2B {
	boolean isCapsOnly(String data)
	{
		int ctr=0;
		char[] arr=data.toCharArray();
		for(int i=0;i<=data.length()-1;i++)
		{
			if(arr[i]>= 'A' && arr[i]<= 'Z')
			{
			ctr=ctr+1;
			}
		}
			if(ctr==data.length())
				return true;
			else 
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		taskDay2B t=new taskDay2B();
		boolean a=t.isCapsOnly("STRING");
		System.out.println(a);
	}

}
