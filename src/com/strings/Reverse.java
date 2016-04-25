package com.strings;

import java.io.*;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 ts=new Test1();
		
		ts.ReWord(ts.string);
		
		ts.print(ts.ReWord(ts.string));
		

	}

}

//自己的思路
class Test1
{
	String string;
	public Test1()
	{
		InputStreamReader is1=null;
		BufferedReader br1=null;
		try {
			
			is1=new InputStreamReader(System.in);
			br1=new BufferedReader(is1);
			
			string =br1.readLine();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public String ReWord(String s)
	{
		char s1[]=s.toCharArray();
		
		ReSort(s1, 0, s1.length-1);
		
		String ss=new String(s1);
		return ss;
				
	}
	
	public void ReSort(char c[],int s,int f)
	{
		char temp;
		while(s<=f)
		{
			temp=c[s];
			c[s]=c[f];
			c[f]=temp;
			s++;
			f--;
		}
	}
	
	public void print(String s)
	{
		System.out.print(s);
	}
	
}



////使用函数库
//class Test1
//{
//	String string;
//	public Test1()
//	{
//		InputStreamReader is1=null;
//		BufferedReader br1=null;
//		try {
//			
//			is1=new InputStreamReader(System.in);
//			br1=new BufferedReader(is1);
//			
//			string =br1.readLine();
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//	}
//	
//	public String ReWord(String s)
//	{
//		String s1=new StringBuffer(s).reverse().toString();
//		
//		return s1;
//				
//	}
//	
//	public void print(String s)
//	{
//		System.out.print(s);
//	}
//	
//}