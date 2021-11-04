package jdbc.vo;
/*
 * Customer의 정보를 가지고 있는 VO클래스
 * 필드, Setter/getter/toString()
 */
public class Customer {
	private int num;
	private String name;
	private String addr;
	public Customer(int num, String name, String addr) {
		super();
		this.num = num;
		this.name = name;
		this.addr = addr;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Customer [num=" + num + ", name=" + name + ", addr=" + addr + "]";
	}


}
