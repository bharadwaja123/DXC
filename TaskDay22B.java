
public class TaskDay22B {
	String mySubStr(String data)
	{
		char[] arr=data.toCharArray();
		int count=1;  
		int max=0;
     //Hello
		int idx=0;
		for(int i=0;i<data.length();i++)       
		{
			for(int j=i+1;j<data.length();j++) 
			{
          
				if(arr[i]==arr[j])  
				{
	             count=count+1;    
				}
			}
			
			if(count>max)
			{
				max=count;
			idx=i;
			}
			count=1;

			
       }
       

		System.out.println(arr[idx]+" "+max);
      

    String manStr=new String(arr);
	 return manStr;
    }
		
	public static void main(String[] args) {
			TaskDay22B t=new TaskDay22B();
		String s=t.mySubStr("Hello WWworldddddd");

	}

}
