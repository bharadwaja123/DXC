import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerDemo {

	public static void main(String[] args) {
		try {
			Student student=new Student("Bobby",6,"Los Vegas");
			FileOutputStream fot=new FileOutputStream("student.ser");
			ObjectOutputStream oos=new ObjectOutputStream(fot);
			oos.writeObject(student);
			System.out.println("Done bro!!!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
