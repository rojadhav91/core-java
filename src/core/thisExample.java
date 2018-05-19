package core;

public class thisExample {
int id;
String name;

public void details(int id,String name){
	this.id=id;
	this.name=name;
}
public void display(){
	System.out.println("id=="+id+"\n"+"name=="+name);
}
	public static void main(String[] args) {
		// this is the example of this keyword
		thisExample t=new thisExample();
		t.details(101,"rohit");
		t.display();

	}

}
