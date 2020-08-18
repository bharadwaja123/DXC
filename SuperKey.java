class Calcu
{
	int x=40;
	Calcu()
	{
		System.out.println("ramos");
	}
	Calcu(int x)
	{
		System.out.println("messi");
	}
}
class SciCalcu extends Calcu
{
	int x=20;
	public SciCalcu() {
		super(10);
		//System.out.println("value is ="+x);
		System.out.println("value is ="+super.x);
}}
public class SuperKey {

	public static void main(String[] args) {
		SciCalcu sc=new SciCalcu();
	}
}
