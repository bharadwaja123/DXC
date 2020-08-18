
public class task2B {
	String replaceLast(String var,char find , char replace)
	 {
		
		 char[] arr=var.toCharArray();
	
		 for(int i=var.length()-1;i>=0;i--)
		 {
		 
		
		 if(arr[i]==find)
		 {
		 arr[i]=replace;
		 break;
		 }
		 }
		 String manStr=new String(arr);
		 return manStr;
	 }


	public static void main(String[] args) {
		task2B t1=new task2B();
		String s=t1.replaceLast("hellllllo worllld",'l','k');
		System.out.println(s);
	}

}
