
public class lcclinvar {
         int a=10; // instance variable
         static int b=20;
         void acc()
         {
        	 int c=30;
        	 System.out.println(c);
         }
	public static void main(String[] args) {
		lcclinvar t =new lcclinvar();
		System.out.println(t.a);
		System.out.println(b);
		t.acc();

	}

}
