/*
 * 需要考虑各种情况
 * 即调各种bug
 */

package com.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BigdataPlus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Plus p1=new Plus();
		p1.pluss();
		p1.print();

	}

}


class Plus
{
	final int max=5;
	int a[]=new int[max];
	int b[]=new int[max];
	int numa;
	int numb;
	int p;
	int flag1=0;//标记总和是否超出数组范围
	public Plus()
	{
		//输入一行数，以空格断开分为两个大数，并给a,b两个数组
		//并且在这里完成大数给a,小数给b
		InputStreamReader isr1=null;
		BufferedReader br1=null;
		try {
			
			isr1=new InputStreamReader(System.in);
			br1=new BufferedReader(isr1);
			String ss=br1.readLine();
			String s[]=ss.split(" ");

            char c1[]=s[0].toCharArray();
            char c2[]=s[1].toCharArray();
            
            if(c1.length>c2.length)
            {
            	numa=c1.length;
            	numb=c2.length;
            	for(int i=0;i<numa;i++)
            	{
            		a[i]=c1[numa-1-i]-'0';
            	}
            	
            	for(int i=0;i<numb;i++)
            	{
            		b[i]=c2[numb-1-i]-'0';
            	}
            }else {
            	numb=c1.length;
            	numa=c2.length;
            	for(int i=0;i<numa;i++)
            	{
            		a[i]=c2[numa-1-i]-'0';
            	}
            	
            	for(int i=0;i<numb;i++)
            	{
            		b[i]=c1[numb-1-i]-'0';
            	}
            	
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void pluss()
	{
		
//		int temp[];在这里交换a,b是现实的，数组引用机制
//		if(numb>numa)
//		{
//			temp=a;
//			a=b;
//			b=temp;
//			
//		}
		int flag=0;//标记进位
		
		for(int i=0;i<=numa;i++)
		{
			if(i==max)
			{
				if(flag==1)
				{
					p=1;
					flag1=1;
					break;
				}
			}else {
				
				if(i>=numb)
				{
					
					if(flag==1)//判断是否进位
					{	
							a[i]=a[i]+1;
							flag=0;	
					}
					
					if(a[i]>=10)
					{
						a[i]=a[i]-10;
						flag=1;
					}
					
				}else {
					
					if(flag==1)//判断是否进位
					{
							a[i]=a[i]+1;
							flag=0;
					}
					
					a[i]=a[i]+b[i];
					
					if(a[i]>=10)
					{
						a[i]=a[i]-10;
						flag=1;
					}
				}
			}
			
			
			
			
		}
	}
	
	
	public void print()
	{
		if(flag1==1)
		{
			System.out.print(p);
		
			for (int i=max-1;i>=0;i--)
			{
				System.out.print(a[i]);
			}
		}else {
			
			if(a[numa]>0)
			{
				System.out.print(a[numa]);
			}
			
			for (int i=numa-1;i>=0;i--)
			{
				System.out.print(a[i]);
			}
			
		}
			
		
		
		
	}
	
}
