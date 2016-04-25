package com.strings;

/**
 * 方法名，要用小写字母开头，类名要大写开头
 */

import java.util.Scanner;

public class Picture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sort s1=new Sort();
		String string=s1.bubble(s1.c);
		System.out.print(string);

	}

}

class Sort
{
	char c[]=new char[1024];
	public Sort()
	{
		//输入数据并分开
		Scanner s1=new Scanner(System.in);
		c=s1.nextLine().toCharArray();
		
	}
	
	public String bubble(char c[])
	{
		char temp;
		int flag=1;
		for(int i=0;i<c.length && flag==1;i++)
		{
			flag=0;
			for (int j=c.length-1;j>i;j--)
			{
				if(c[j-1]>c[j])
				{
					temp=c[j];
					c[j]=c[j-1];
					c[j-1]=temp;
					flag=1;
				}
			}
		}
		String string=new String(c);
		return string;
	}
	
}
