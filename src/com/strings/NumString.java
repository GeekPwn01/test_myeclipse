/**
 * 统计一行字符串出现的数字，字母等的个数
 * 注意输出是换行输出，共输出四行
 */

package com.strings;

import java.util.Scanner;

public class NumString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Count cc=new Count();
		int a[]=cc.tongJi(cc.s);
		for(int i=0;i<3;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println(a[3]);

	}

}


class Count
{
	String s;
	public Count()
	{
		//输入一行字符串
		Scanner s1=new Scanner(System.in);
		s=s1.nextLine();
	}
	
	public int[] tongJi(String s)
	{
		char c[]=s.toCharArray();
		int num[]=new int[128];
		int a[]=new int[4];
		
		for(int i=0;i<c.length;i++)
		{
			num[c[i]-0]+=1;
		}
		//统计英文字符
		for(int i=(int)('a');i<=(int)('z');i++)
		{
			a[0]+=num[i];
		}
		
		for(int i=(int)('A');i<=(int)('Z');i++)
		{
			a[0]+=num[i];
		}
		
		//统计空格
		
		a[1]+=num[(int)(' ')];
		
		//统计数字
		for(int i=(int)('0');i<=(int)('9');i++)
		{
			a[2]+=num[i];
		}
		
		//统计其他
		a[3]=c.length-a[0]-a[1]-a[2];
		
		return a;
	}
	
}