
public class arrdem {

	public static void main(String[] args) {
		
		/*int [][] a= {{1,2,3,4},{6,7,8,9}};
		for(int b[]:a){
			for(int c:b){
			System.out.println(c);
		}}*/ //using for each
		
		/*int [] a= {1,2,3,4};
		int [] b=a;
		b[2]=10;
		System.out.println(a[2]); this is for reference */
		
		/*int [] a= {1,2,3,4,5,6,7,8};
		int [] b=new int[a.length];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		for(int x:b) {
			System.out.println(x);
		}
		System.out.println("==============");
		b[2]=200;
		System.out.println(a[2]);
		System.out.println(b[2]); for copy */
		
		/*int a[]= {1,2,3,4,5,6,7,8};
		int b[]=new int[a.length];
	       System.arraycopy(a, 0, b, 0, 8);
	       for(int c:b)
	       {
	    	   System.out.print(c+","); this is to copy the elements by using length linearly
	       }*/
		
	      int a[]= {1,2,3,4,5,6,7,8};
			int b[]=new int[a.length];
		       System.arraycopy(a, 0, b, 0, 1);
		       System.arraycopy(a, 2, b, 1, 1);
		       System.arraycopy(a, 4, b, 2, 1);
		       System.arraycopy(a, 7, b, 3, 1);
		       for(int c:b)
		       {
		    	   System.out.print(c+","); //for the alternative elements method :arraycopy
		       } 
		       
		
}
}
