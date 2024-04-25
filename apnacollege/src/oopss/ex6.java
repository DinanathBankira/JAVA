package oopss;
class persion{
	
	private String name;
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		this.name=newName;
	}
}
	public class ex6 {
	public static void main(String[] args) {
		persion p=new persion();
		p.setName("Dinanath");
		System.out.println(p.getName());
	}
}
