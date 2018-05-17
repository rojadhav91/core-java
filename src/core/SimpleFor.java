package core;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SimpleFor {

	public static void main(String[] args) throws Exception{
		//WPA to print any table
		System.out.println("this is the simple example of for loop");
		System.out.println("enter any no");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		for(int i=1;i<=10;i++){
			int res=a*i;
			System.out.println(res);
		}

	}

}
