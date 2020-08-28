import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ScRead {

	public static void main(String[] args) {
		try {
			FileReader f=new FileReader("abx.txt");
			BufferedReader br=new BufferedReader(f);
			while(br.readLine()!=null)
			{
				System.out.println(br.readLine());
			}
		}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
