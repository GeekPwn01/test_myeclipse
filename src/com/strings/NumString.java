/**
 * ͳ��һ���ַ������ֵ����֣���ĸ�ȵĸ���
 * ע������ǻ�����������������
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
		//����һ���ַ���
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
		//ͳ��Ӣ���ַ�
		for(int i=(int)('a');i<=(int)('z');i++)
		{
			a[0]+=num[i];
		}
		
		for(int i=(int)('A');i<=(int)('Z');i++)
		{
			a[0]+=num[i];
		}
		
		//ͳ�ƿո�
		
		a[1]+=num[(int)(' ')];
		
		//ͳ������
		for(int i=(int)('0');i<=(int)('9');i++)
		{
			a[2]+=num[i];
		}
		
		//ͳ������
		a[3]=c.length-a[0]-a[1]-a[2];
		
		return a;
	}
	
}