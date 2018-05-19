package core;
class demo{
	public demo(){
		System.out.println("this is the base class");
	}
}
public class InheritanceExample extends demo{
	public InheritanceExample(){
		System.out.println("this is the child class");
	}

	public static void main(String[] args) {
		// This is the simple example of inheritance
		
		
		InheritanceExample i=new InheritanceExample();

	}

}
