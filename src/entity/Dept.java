package entity;

public class Dept {
	private int id;
	private String deptName;
	private String deptRemake;
	private String price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptRemake() {
		return deptRemake;
	}
	public void setDeptRemake(String deptRemake) {
		this.deptRemake = deptRemake;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Dept() {
		
		// TODO Auto-generated constructor stub
	}
	public Dept(int id, String deptName, String deptRemake, String price) {
		super();
		this.id = id;
		this.deptName = deptName;
		this.deptRemake = deptRemake;
		this.price = price;
	}
	public Dept(String deptName, String deptRemake, String price) {
		super();
		this.deptName = deptName;
		this.deptRemake = deptRemake;
		this.price = price;
	}
	

	
	
}
