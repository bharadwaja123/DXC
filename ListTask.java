//import java.awt.print.Book;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Vector;

public class ListTask {

	public static void main(String[] args) {
		
		Vector<Integer> marks=new Vector<>();
		marks.add(20);
		marks.add(30);
		marks.add(40);
		System.out.println(marks);
		System.out.println();
		
		HashSet<Books> book=new HashSet<>();
		Books b1=new Books(1,"hamlet", "Shakespeare");
		Books b2=new Books(2,"treasure Island","robert");
		Books b3=new Books(3,"Half girl friend","chetan bagat");
		Books b4=new Books(4,"naked face","sydney sheldon");
		Books b5=new Books(5,"i too had a love story","Ravinder singh");
		
		book.add(b1);
		book.add(b2);
		book.add(b3);
		book.add(b4);
		book.add(b5);
		
		for(Books b:book)
		{
		b.disp();
		}
		
		
		
		Books bb1=new Books(101,"hamlet", "Shakespeare");
		Books bb2=new Books(201,"treasure Island","robert");
		Books bb3=new Books(301,"Half girl friend","chetan bagat");
		Books bb4=new Books(401,"naked face","sydney sheldon");
		Books bb5=new Books(501,"i too had a love story","Ravinder singh");
		
		HashMap<Integer,Books> boo=new HashMap<>();
		boo.put(bb1.getIsbn(),bb1);
		boo.put(bb2.getIsbn(),bb2);
		boo.put(bb3.getIsbn(),bb3);
		boo.put(bb4.getIsbn(),bb4);
		boo.put(bb5.getIsbn(),bb5);
		
		Books hell=boo.get(201);
		System.out.println(hell);
	}

}
