
public class task5 {
	boolean isEqual(String str1,String str2)
	{
		char[] arr1=str1.toCharArray();
		char[] arr2=str2.toCharArray();
		int i=0;
		if(arr1.length!=arr2.length)
		{
		return false;	
		}
		else if(!((arr1[i]==arr2[i])||(arr1[i]-32==arr2[i])||(arr1[i]+32==arr2[i])||(arr1[i]==arr2[i]-32)||(arr1[i]==arr2[i]+32)))
		{
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		taskDay2L ft=new taskDay2L();
		boolean isequal=ft.isEqual("hello","HELLO");
		System.out.println(isequal);

	}

}
