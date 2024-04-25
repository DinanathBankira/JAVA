package Practice;
class Celender{
	private int height;
	private int radius;
	
	public void setterh(int h) {
		// TODO Auto-generated method stub
		height=h;
	}
	public int getterh() {
		// TODO Auto-generated method stub
		return height;
	}
	public void setterr(int r) {
		// TODO Auto-generated method stub
		radius=r;
	}
	public int getterr() {
		// TODO Auto-generated method stub
		return radius;
	}
	public void show() {
		System.out.println("The Height of Celender is ="+height);
		System.out.println("The Redius of Celender is ="+radius);
	}
}
public class Chapter9 {
	public static void main(String[] args) {
		Celender x=new Celender();
		x.setterh(12);
		x.setterr(5);
//		x.show();
		x.getterh();
	}
}
