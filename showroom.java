import java.util.List;

public class showroom {
	private String Showroomname;
	 private int address;
	 List<cars> car;
	public String getShowroomname() {
		return Showroomname;
	}
	public void setShowroomname(String showroomname) {
		Showroomname = showroomname;
	}
	public int getAddress() {
		return address;
	}
	public void setAddress(int address) {
		this.address = address;
	}
	public  List<cars> getCar() {
		return car;
	}
	public void setCar(List<cars> car) {
		this.car = car;
	}
	public showroom(String showroomname, int address, List<cars> car) {
		super();
		Showroomname = showroomname;
		this.address = address;
		this.car = car;
	}
	@Override
	public String toString() {
		return "showroom [Showroomname=" + Showroomname + ", address=" + address + ", car=" + car + "]";
	}
	 
}
