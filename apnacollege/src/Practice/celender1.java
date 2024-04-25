package Practice;
class celender2{
	private int height;
	private int redius;
	
	
	public celender2(int height, int redius) {
		this.height = height;
		this.redius = redius;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getRedius() {
		return redius;
	}
	public void setRedius(int redius) {
		this.redius = redius;
	}
	void show() {
		System.out.println("Hight = "+height);
		System.out.println("Redius = "+redius);
	}
	public double serfaceArea() {
		return 2*Math.PI*redius*height+2*Math.PI*redius*redius;
	}
	public double Volume() {
		return Math.PI*redius*redius*height;
	}
	
}
public class celender1 {
	public static void main(String[] args) {
		celender2 d=new celender2(12,9);
		celender2 d1=new celender2(12,10);
//		d.setHeight(12);
//		d.setRedius(9);
		d.show();
		System.out.println("Cylender Serface area is "+d.serfaceArea());
		System.out.println("Cylender Volum  is "+d.Volume());
		System.out.println("Cylender Serface area is===="+d1.serfaceArea());
		System.out.println("Cylender Volum  is ===="+d1.Volume());
	}
}
