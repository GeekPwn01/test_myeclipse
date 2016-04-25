//bug 全空格
package com.strings;

import java.util.ArrayList;
import java.util.Scanner;


public class LastWord  {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LastWord mm=new LastWord();
		
                //输入字符串，并以空格隔开
		Scanner s1=new Scanner(System.in);
		String ss[]=s1.nextLine().split(" ");
		if(ss.length!=0)
		{
			System.out.println(ss[ss.length-1].length());
		}else
		{
			System.out.println(0);
		}
			
		

	}

}
//
//public class LastWord {
//
//	String string;
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		LastWord mm=new LastWord();
//		
//        
//		System.out.println(mm.Word(mm.string));
//
//	}
//	
//	
//	public  LastWord()
//	{
//		//输入字符串，并以空格隔开
//		Scanner s1=new Scanner(System.in);
//		
//		string=s1.nextLine();
//		
//	}
//	
//	public static int Word(String s)
//	{
//		String ss[]=s.split(" ");
//		
//		return ss[ss.length-1].length();
//	}
//
//}



//public class Main {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Test2 ts=new Test2();
//        
//		ts.print(ts.Word(ts.string));
//
//	}
//
//}
//
//class Test2
//{
//	String string;
//	public Test2()
//	{
//		//输入字符串，并以空格隔开
//		Scanner s1=new Scanner(System.in);
//		
//		string=s1.nextLine();
//		
//	}
//	
//	public String Word(String s)
//	{
//		String ss[]=s.split(" ");
//		
//		return ss[ss.length-1];
//	}
//	
//	public void print(String s)
//	{
//		System.out.println(s);
//	}
//}
