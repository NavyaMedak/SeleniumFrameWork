package Automation;

class p{
	String s = "Parent Variable";
	
}

class C extends p{
	String s="Child Variable";
	public  void m1() {
		System.out.println(s);
		System.out.println(this.s);	//this keyword is used to call current class object
		System.out.println(super.s); // super keyword is used to call parent call object
	}
}

public class Test {

	public static void main(String[] args) {
	C c = new C();
	c.m1();

	}

}
