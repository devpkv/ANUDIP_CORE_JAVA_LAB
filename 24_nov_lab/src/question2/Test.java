package question2;

public class Test {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.display();
		
		Child c = new Child();
		c.display();
		
		Child p1 = new Child();
		p1.display("Super class Sting");

	}

}
