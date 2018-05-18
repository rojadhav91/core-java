package core;

public class constructorExample {
	public constructorExample(){
		System.out.println("this is the default constructor");
	}

	public constructorExample(int a,int b){
		System.out.println("this is the example of parameterise constructor");
		int res=a+b;
		System.out.println("result=="+res);
		
	}
	public static void main(String[] args) {
		// This is the simple example of constructor
		
		constructorExample c=new constructorExample(),c1=new constructorExample(10,5);

	}

}
