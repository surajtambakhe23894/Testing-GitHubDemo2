
public class Git_Demo2 {
public void m1()
{
System.out.println("m1 method");	
}
public void m2() {
	System.out.println("m2 method");
	m1();
}
	
	public void m3() {
	System.out.println("m3--- method");
	m2();
	
}
	public static void main(String[] args) {
		System.out.println("main method");
		Git_Demo2 g=new Git_Demo2();
		g.m3();
	}
}
