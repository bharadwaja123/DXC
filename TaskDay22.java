
public class TaskDay22 {
	String mySubStr(String data,int index)
	{
		char[] arr=data.toCharArray();
		for(int i=0;i<data.length();i++)
		{
			if(i>=index)
			{
				System.out.print(arr[i]);
			}
			System.out.println( );
		}		
		String manStr=new String(arr);
		 return manStr;		 
	}	
	String mySubStr(String data,int index,int LastIndex)
	{
		char[] arr1=data.toCharArray();
		for(int i=0;i<data.length();i++)
		{
			if(i< index||i>=index+LastIndex)
			{
				System.out.print(arr1[i]);
			}
		}
		String manStr=new String(arr1);
		 return manStr;
	}
	public static void main(String[] args) {
		TaskDay22 t=new TaskDay22();
		String s=t.mySubStr("Hello",3);
		//System.out.println(s);
		TaskDay22 t1=new TaskDay22();
		String g=t1.mySubStr("hello world", 4, 2);
	}

}
