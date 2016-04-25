package com.test;

import java.io.*;


public class BigdataMinus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Minus mn=new Minus();
		mn.print(mn.minuss(mn.s1, mn.s2));

	}

}



class Minus
{
	
	String s1;
	String s2;
	
	int result[];
	int lena;
	int lenb;
	
	//判断符号
	char sign='+';
	
	//len的目的是记录result，并且保证两数之和不溢出，
	//result【】长度为len+1
	int len;
	
	public Minus()
	{
		//输入一行数，以空格断开分为两个大数,给字符串s1,s2
		
		InputStreamReader isr1=null;
		BufferedReader br1=null;
		try {
			
			isr1=new InputStreamReader(System.in);
			br1=new BufferedReader(isr1);
			String ss=br1.readLine();
			String s[]=ss.split(" ");
            
			s1=s[0];
			s2=s[1];
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public String minuss(String s1,String s2)
	{
		char c1[]=new StringBuffer(s1).reverse().toString().toCharArray();
		char c2[]=new StringBuffer(s2).reverse().toString().toCharArray();
		
		lena=c1.length;
		lenb=c2.length;
		
		//获得两数组长度最长的那个
		len=lena>lenb ? lena:lenb;
		
		result=new int[len];
		
		
		if(lena<lenb)
		{
			sign='-';
		}else if(lena==lenb)
		{
			int i=lena-1;
			while(c1[i]==c2[i] && i>0)
			{
				i--;
			}
			if(c1[i]<c2[i])
			{
				sign='-';
			}
		}
		
		//如果超过了某个数组长度，就用0代替与另一个数相减,
		//如果c1大(即sign= +)，就c1-c2;否则c2-c1
		
		int a;
		int b;
		for (int i=0;i<len;i++)
		{
			a=i<=(lena-1) ? (int)(c1[i]-'0') : 0;
			b=i<=(lenb-1) ? (int)(c2[i]-'0') : 0;
			
			if(sign=='+')
			{
				result[i]=a-b;
			}else {
				
				result[i]=b-a;
			}
			
		}
		
		//完成进位要求
		for(int i=0;i<len;i++)
		{
			if(result[i]<0)
			{
				result[i]=result[i]+10;
				result[i+1]-=1;
			}
		}
		
		//去除前置0，并逆序输出
		StringBuffer sb1=new StringBuffer();
		boolean flag =true;
		for(int i=len-1;i>=0;i--)
		{
			if(flag && result[i]==0)
			{
				continue;//结束本次循环，进入下次循环，与break区别
			}else {
				flag=false;
			}
			sb1.append(result[i]);
		}
		
		//bug 如果集合中没有值，即两数相等
		if(sb1.toString().equals(""));
		{
			sb1.append(0);
		}
		
		return sb1.toString();
		
	}
	
	
	public void print(String s)
	{
		if(sign=='-')
		{
			System.out.print(sign);
			System.out.println(s);	
		}else {
		    System.out.println(s);
		}
				
		
	}
	
}
