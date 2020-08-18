
public class taskDay2L {

	boolean isEqual(String str1,String str2)
	{
		char[] arr1=str1.toCharArray();
		char[] arr2=str2.toCharArray();
		int len1=arr1.length;
		int len2=arr2.length;
		int i=0;
		if(len1 != len2){
			return false;
		}
		else{
		while(i<len1)
		{
			if(arr1[i]==arr2[i]){
				i++;
			}
			else{
				if(arr1[i]>='a' && arr1[i]<='z')
				{
					if(arr1[i]-32 != arr2[i])
					{
						return false;
					}
				}
				else if(arr1[1]>='A' && arr1[i]<='Z')
				{
					if(arr1[i]+32 != arr2[i])
					{
						return false;
					}
				}
				
				i++;
				
			}
		}
		
		return true;
		
		}
		
	}

	public static void main(String[] args) {
		
		taskDay2L ft=new taskDay2L();
		boolean isequal=ft.isEqual("hello","HELLO");
		System.out.println(isequal);
		
		
		
	}
}

