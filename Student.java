import java.io.Serializable;

public class Student implements Serializable{
private String name;
private  int rollNo;
private String address;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Student(String name, int rollNo, String address) {
	super();
	this.name = name;
	this.rollNo = rollNo;
	this.address = address;
}
@Override
public String toString() {
	return "Student [name=" + name + ", rollNo=" + rollNo + ", address=" + address + "]";
}
public Student() {
	// TODO Auto-generated constructor stub
}
}
