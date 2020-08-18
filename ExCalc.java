
class Calc
{
public void ab(){
	System.out.println("calculator");
}
    Calc(int x) {
	System.out.println(x);
	System.out.println("parent");
}
}
class SciCalc extends Calc
{
	public SciCalc()
	{
		super(20);
		System.out.println("child const");
	}
public void abc(){
		System.out.println("scientific calc");
}
}
public class ExCalc {
	public static void main(String[] args) {
      SciCalc sc=new SciCalc();
      sc.ab();
      sc.abc();
	}

}
