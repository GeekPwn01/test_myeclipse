/**
 * 乘法bug；0*num    -num*num   -num*-num
 * 
 * http://blog.csdn.net/lichong_87/article/details/6860329
 */

package com.test;

import java.io.*;

public class BigdataMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multi ml=new Multi();
		ml.print(ml.multi(ml.s1,ml.s2));

	}

}



class Multi
{
	
	String s1;
	String s2;
	
	int result[];
	int lena;
	int lenb;
	
	//判断符号
	char sign='+';
	
	//len的目的是记录result，并且保证两数之和不溢出，
	//result【】长度为len=lena+lenb
	int len;
	
	public Multi()
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
	
	public String multi(String s1,String s2)
	{
		//判断符号
		char signa=s1.charAt(0);
		char signb=s2.charAt(0);
		
		if(signa=='-' || signa=='+')
		{
			sign=signa;
			s1=s1.substring(1);
		}
		
		if(signb=='-' || signb=='+')
		{
			if(signb==sign)
			{
				sign='+';

			}else {
				
//				sign=signb;//明显没有下面一句思路清晰
				sign='-';
			}
			s2=s2.substring(1);
		}
		
		char c1[]=new StringBuffer(s1).reverse().toString().toCharArray();
		char c2[]=new StringBuffer(s2).reverse().toString().toCharArray();
		
		
		lena=c1.length;
		lenb=c2.length;
		
		//获得result数组长度
		len=lena+lenb ;
		
		result=new int[len];
		
		
		
		//循环相乘并加到result,a*b
		
		
		for (int i=0;i<lenb;i++)
		{
			for(int j=0;j<lena;j++)
			{
				result[j+i]+=(c1[j]-'0')*(c2[i]-'0');
			}
			
			
		}
		
		//完成进位要求
		for(int i=0;i<len;i++)
		{
			if(result[i]>=10)
			{
				result[i+1]+=result[i]/10;
				result[i]=result[i]%10;
			}
		}
		
		//去除前置0，并逆序输出
		StringBuffer sb1=new StringBuffer();
		boolean flag =true;
		for(int i=len-1;i>=0;i--)
		{
			if(flag && result[i]==0)
			{
				if(i==0)
				{
					sb1.append(i);
				}
				
				continue;//结束本次循环，进入下次循环，与break区别
			}else {
				
				flag=false;
			}
			
			sb1.append(result[i]);
			
			
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
