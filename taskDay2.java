
public class taskDay2 {
	String hasUpper(String data)
	{
		char[] arr=data.toCharArray();
		for(int i=0;i<=data.length()-1;i++)
		{
		if(arr[i]>= 'A' && arr[i]<= 'Z')
		System.out.println("yes");
		else
		System.out.println("no");
		}
		String manStr=new String(arr);
		 return manStr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		taskDay2 t=new taskDay2();
		String a=t.hasUpper("StrinG");
		System.out.println(a);
	}

}
