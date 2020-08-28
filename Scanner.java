import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Scanner {
public static void main(String[] args) {

InputStreamReader i=new InputStreamReader(System.in);

try {
	BufferedReader b=new BufferedReader(i);
	String d=b.readLine();
	System.out.println(d);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
}
