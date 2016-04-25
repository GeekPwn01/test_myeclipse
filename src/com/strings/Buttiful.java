package com.strings;

import java.util.*;

public class Buttiful {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum s1=new Sum();
		int a[]=s1.minNum(s1.s);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
//		char a='a';
//		char b='A';
//	     System.out.println(a-0);
//	     System.out.println(b-0);

	}

}


class Sum
{
	int a[];
	String s[];
	Scanner s1;
	int n;
	public Sum()
	{
		
		s1=new Scanner(System.in);
		String ss=s1.nextLine();
		n=Integer.parseInt(ss);
		//再使用数组前，一定要定义长度，否则会越界
		s=new String[n];
		
		s=s1.nextLine().split(" ");
		
		
		
		a=new int[n];
	}
	
	
	public int[] minNum(String s[])
	{
		int b[]=new int[128];
		int b1[]=new int[26];
		
		for(int i=0;i<n;i++)
		{
			
			char c[]=s[i].toCharArray();
			
			
			//利用Assii码统计字符出现次数
			for(int j=0;j<c.length;j++)
			{
				b[c[j]-0]+=1;
			}
			
			for(int k=0;k<26;k++)
			{
				b1[k]=b[64+k]+b[96+k];
				b[64+k]=0;
				b[96+k]=0;
			}
//			for(int j=0;j<c.length;j++)
//			{
//				int flag=0;
//				for(int k=j+1;k<c.length+1;k++)
//				{
//					if(c[j]!='0')
//					{
//						b[j]=1;
//						if(k==c.length)
//						{
//							break;
//						}else {
//							if(c[k]==c[j] ||c[k]==c[j]+32 ||c[k]==c[j]-32)
//							{
//								flag+=1;
//								
//								c[k]='0';
//							}
//						}
//						
//					}
//					
//				}
//				if(flag!=0)
//				{
//					b[j]+=flag;
//					flag=0;
//				}
//			}
			int temp;
			for(int m=0;m<b1.length;m++)
			{
				for(int j=b1.length-1;j>m;j--)
				{
					if(b1[j]>b1[j-1])
					{
						temp=b1[j];
						b1[j]=b1[j-1];
						b1[j-1]=temp;
					}
				}
			}
//			
			for(int m=0;m<b1.length;m++)
			{
				a[i]+=b1[m]*(26-m);
				b1[m]=0;
			}
			
//			
		}
		
		
		return a;
	}
	
}