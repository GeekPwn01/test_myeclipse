package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class YiWei {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Remove rr1=new Remove();
		rr1.conut(rr1.num);
		rr1.print();

	}

}

class Remove
{
	int a[]=new int[10];
	int b[]=new int[10];
	int sum1=0;
	int sum2=0;
	String s[];
	int num;
	public Remove()
	{
		InputStreamReader isr1=null;
		BufferedReader br1=null;
		try {
			isr1=new InputStreamReader(System.in);
			br1=new BufferedReader(isr1);
			
			String ss=br1.readLine();
			s=ss.split(" ");
			
			for(int i=0;i<10;i++)
			{
				a[i]=Integer.parseInt(s[i]);
				b[i]=Integer.parseInt(s[i]);
				
			}
			
			ss=br1.readLine();
			
			num=Integer.parseInt(ss);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void conut(int num)
	{
		if(num<0)         //这一步是严重缺少调试和多种情况考虑的结果
		{
			num=num%10+10;
		}else {
			num=num%10;
		}
		
		
		for(int i=0;i<num;i++)
		{
			a[i]=b[10-num+i];
			sum1+=a[i];
		}
		
		for(int i=num;i<10;i++)
		{
			a[i]=b[i-num];
			sum2+=a[i];
		}
	}
	
	public void print()
	{
		for(int i=0;i<9;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println(a[9]);
		System.out.print(sum1+" ");
		System.out.println(sum2);
	}
	
}