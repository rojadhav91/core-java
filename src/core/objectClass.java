package core;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class objectClass {
	int a;
	String name;

	public static void main(String[] args) {
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		objectClass o=new objectClass();
		o.a=10;
		o.name="rohit";
		System.out.println("id=="+o.a+"name=="+o.name);
		
	}

}
