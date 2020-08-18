
public class attr {
	String name;
	int roll;
	char sec;
	String brnch;
	String clg;

	void init()
	{
		 name="Bobby";
		 roll=12;
		 sec='a';
		 brnch="ECE";
		 clg="Sathyabama";
		}
	
		void disp(){
		System.out.println(name);
		System.out.println(roll);
		System.out.println(sec);
		System.out.println(brnch);
		System.out.println(clg);
		}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		attr a=new attr();
		a.init();
		a.disp();

	}

}
