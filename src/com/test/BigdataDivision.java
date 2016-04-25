/**
 * http://blog.csdn.net/sinat_26888717/article/details/48299529
 */

package com.test;

import java.io.*;

public class BigdataDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Division dv=new Division();
		dv.divisions(dv.s1, dv.s2);

	}

}


class Division
{
	
	String s1;
	String s2;
	String s="0";
	
	int result1[];
	int result2[];
	
	int lena;
	int lenb;
	
	//判断符号
	char sign='+';
	
	//len1的目的是记录商，len1等于|lena-lenb|
	//len2记录余数，len2等于位数最少的那个
	int len1;
	int len2;
	
	public Division()
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
	
	public void divisions(String s1,String s2)
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
		
		
		len1=Math.abs(lena-lenb) ;
		len2=lena>lenb ? lena:lenb;
		
		result1=new int[len1];
		result2=new int[len2];
		
		int temp[]=new int[lena+1];
		//除法核心
		if(lena<lenb)
		{
			
			System.out.println("商等于"+0);
			if(signa=='-')
			{
				System.out.println("余数等于"+"-"+s1);
			}else {
				System.out.println("余数等于"+s1);
			}
			
			
		}else {
			
			//找到一个很近的试凑范围
			result1[len1-1]=((c1[lena-1]-'0')*10+c1[len1-2])/(c2[lenb-1]-'0'+1);
			
			int flag=0;
			int p=c1.length-1;
			int num=0;
			int num1=0;
			while(flag==0)
			{
				s=pluss(s2, s);
				num++;
				if(num%10==0)
				{
					num1++;
				}
				result1[num1]+=1;
				char c4[]=new StringBuffer(s).reverse().toString().toCharArray();
				
				while(c4[p]>=c1[p] && c1.length==c4.length)
				{
					flag=1;
				}
			}
		}	
		
	}
	
	
	
	public String multi(String s1,String s2)
	{
		
		char c1[]=new StringBuffer(s1).reverse().toString().toCharArray();
		char c2[]=new StringBuffer(s2).reverse().toString().toCharArray();
		
		
		lena=c1.length;
		lenb=c2.length;
		
		//获得result数组长度
		int len=lena+lenb ;
		
		int result[]=new int[len];
		
		
		
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
	
	
	public String pluss(String s1,String s2)
	{
		char c1[]=new StringBuffer(s1).reverse().toString().toCharArray();
		char c2[]=new StringBuffer(s2).reverse().toString().toCharArray();
		
		lena=c1.length;
		lenb=c2.length;
		
		//获得两数组长度最长的那个
		int len=lena>lenb ? lena:lenb;
		
		int result[]=new int[len+1];
		
		//如果超过了某个数组长度，就用0代替与另一个数相加
		
		int a;
		int b;
		for (int i=0;i<len+1;i++)
		{
			a=i<=(lena-1) ? (int)(c1[i]-'0') : 0;
			b=i<=(lenb-1) ? (int)(c2[i]-'0') : 0;
			
			result[i]=a+b;
		}
		
		//完成进位要求
		for(int i=0;i<len+1;i++)
		{
			if(result[i]>=10)
			{
				result[i]=result[i]%10;
				result[i+1]+=1;
			}
		}
		
		//去除前置0，并逆序输出
		StringBuffer sb1=new StringBuffer();
		boolean flag =true;
		for(int i=len;i>=0;i--)
		{
			if(flag && result[i]==0)
			{
				continue;//结束本次循环，进入下次循环，与break区别
			}else {
				flag=false;
			}
			sb1.append(result[i]);
		}
		
		return sb1.toString();
		
	}
	
	
	public String minuss(String s1,String s2)
	{
		char c1[]=new StringBuffer(s1).reverse().toString().toCharArray();
		char c2[]=new StringBuffer(s2).reverse().toString().toCharArray();
		
		lena=c1.length;
		lenb=c2.length;
		
		//获得两数组长度最长的那个
		int len=lena>lenb ? lena:lenb;
		
		int result[]=new int[len];
		
		
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
	
	
}
