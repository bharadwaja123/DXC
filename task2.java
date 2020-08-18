
public class task2 {
	String replaceFirst(String var,char find , char replace)
	 {
		int ctr=0;
		 char[] arr=var.toCharArray();
		 for(int i=0;i<var.length();i++){
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
		// TODO Auto-generated method stub
		task2 t=new task2();
		String s=t.replaceFirst("hello bobby", 'l', 'b');
		System.out.println(s);
		

	}

}
