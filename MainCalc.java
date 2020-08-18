class Calcula{
int x=10;
public Calcula(int x) {
System.out.println("p const");
}
public Calcula() {
System.out.println("p const args");
}
}
class SciCalcula extends Calcula{
int x=50;
public SciCalcula() {
super(10);
}
void abc(){
System.out.println("val of x = "+super.x);
}
}
public class MainCalc {
public static void main(String[] args) {
SciCalcula sc=new SciCalcula();

sc.abc();
}

}