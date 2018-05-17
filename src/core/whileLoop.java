package core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class whileLoop {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("this is the simple example of while loop");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the no you want");
		int a=Integer.parseInt(br.readLine());
		int i=1;
		
		while(i<=10){
			int res=i*a;
			System.out.println(res);
			i++;
		}

	}

}
