
public class Books {
 int isbn;
 String title;
 String author;
 
	public int getIsbn() {
	return isbn;
}

public void setIsbn(int isbn) {
	this.isbn = isbn;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

public Books(int isbn, String title, String author) {
	super();
	this.isbn = isbn;
	this.title = title;
	this.author = author;
}

public void disp()
{
	System.out.println(isbn+" "+title+" "+author);
}

@Override
public String toString() {
	return "Books [isbn=" + isbn + ", title=" + title + ", author=" + author + "]";
}





}
