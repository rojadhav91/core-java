package core;

public class staticVarible {
int id;
String name;
static String clg="MIT";
public void display(){
	System.out.println("id=="+id+"\n"+"name=="+name+"\n"+"college=="+clg);
}

	public static void main(String[] args) {
		// this is the example of static varible
		
		staticVarible s=new staticVarible();
		s.id=101;
		s.name="rohit jadhav";
		s.display();
		
		
		

	}

}
