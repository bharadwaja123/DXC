
public class Employee {
private int empId;
private int empAge;
private String empName;
private String empAddress;
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public int getEmpAge() {
	return empAge;
}
public void setEmpAge(int empAge) {
	this.empAge = empAge;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getEmpAddress() {
	return empAddress;
}
public void setEmpAddress(String empAddress) {
	this.empAddress = empAddress;
}
public Employee(int empId, int empAge, String empName, String empAddress) {
	super();
	this.empId = empId;
	this.empAge = empAge;
	this.empName = empName;
	this.empAddress = empAddress;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empAge=" + empAge + ", empName=" + empName + ", empAddress=" + empAddress
			+ "]";
}
public Employee() {
	// TODO Auto-generated constructor stub
}
}
