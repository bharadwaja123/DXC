
public class Revrse {
	String Rvrse(String data)
	{
		char[] arr=data.toCharArray();
		for(int i=data.length()-1;i>=0;i--)
		{
			System.out.print(arr[i]);
		}
		String manStr=new String(arr);
		 return manStr;
	}
	
		
	void array()
	{
		System.out.println();
		int[] arr ={12,23,45,65,1,2,43,2,56,-1,-10};  
		for (int i = 0; i < arr.length; i++)   
		{  
		for (int j = i + 1; j < arr.length; j++)   
		{  
		int tmp = 0;  
		if (arr[i] > arr[j])   
		{  
		tmp = arr[i];  
		arr[i] = arr[j];  
		arr[j] = tmp;  
		}  
		}  
		System.out.println(arr[i]);  
		}  
		}   

	public static void main(String[] args) {
       Revrse r=new Revrse();
       String s=r.Rvrse("Hello world");
       Revrse r2=new Revrse();
       r2.array();
    		
	}

}
