
public class Employee {
	
	private int id;
	private String name ;
	private String dept;
	private String status ="yes";
	private int salary;
	
	
	public Employee(int id, String name, String dept, String status, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.status = status;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", status=" + status + ", salary=" + salary
				+ "]";
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
