
public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int x=1234;
             int y;
             int a=120050;
             int b;
             int count=0;
             int e=120050,f,cnt=0;
             while(x>0)
             {
            	 y=x%10;
            	 System.out.print(y);
            	 x=x/10;
             }
             System.out.println();
             while(a>0)
             {
            	 b=a%10;
            	 if(b==0)
            		 count++;
            	 a=a/10;      	
            	 }
             System.out.println("no of zeros="+count);
             System.out.println();
             while(e>0)
             {
            	 f=e%10;
            	 if(f==0)
            		 cnt++;
            	 else
            		 break;
            	 e=e/10;      	
            	 }
             System.out.println("no of zeros="+cnt);
             }
	}
	

