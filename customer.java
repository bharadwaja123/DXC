class attributes
{
	int custid;
	float custsal;
	String custloc;
	String custpos;
   
   attributes(int custid,float custsal,String custloc,String custpos) {
	   this.custid=custid;
	   this.custsal=custsal;
	   this.custloc=custloc;
	   this.custpos=custpos;	
}
   
   void display()
   {
	   System.out.println("customerId="+custid);
	   System.out.println("customersalary="+custsal);
	   System.out.println("customerlocation="+custloc);
	   System.out.println("customerposition="+custpos);
   }
}
 public class customer {
	/*static String custname;
	   static long custphno;*/
	    static void var(String custoname,long custophno)
	   {
		/* custoname=custname;
		 custophno=custphno;  	
	   /* }
	    static void disp()
	    {*/
	    	System.out.println("customer name="+custoname);
	    	System.out.println("customer phone="+custophno);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var("bobby", 999999);
		attributes custm1=new attributes(123, 1300.5f, "chennai", "manager");
		custm1.display();
		var("john", 9999989);
		attributes custm2=new attributes(123, 1200.5f, "bang", "manager hr");
		custm2.display();
		var("ramos", 99999908);
		attributes custm3=new attributes(123, 1100.5f, "mysore", "lead");
		custm3.display();
		var("Dhoni", 99936367);
		attributes custm4=new attributes(123, 1000.5f, "delhi", "member");
		custm4.display();
		var("khabib", 9999983);
		attributes custm5=new attributes(123, 13000.5f, "kashmir", "chief");
		custm5.display();
		var("NTR", 9999484);
		attributes custm6=new attributes(123, 130.5f, "shimla", "cleaner");
		custm6.display();
				
	}

}
