package com.strings;

import java.util.*;

public class Hechang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Find f1=new Find();
		int a=f1.minNum(f1.a,f1.num);
		System.out.println(a);

	}

}


class Find
{
	//�������飬�ֱ�洢��ߣ���������ұ���
	int a[];
	int b[];
	int c[];
	
	int num;
	public Find()
	{
		//����N�Ͷ�Ӧ���
		Scanner s1=new Scanner(System.in);
		String ss=s1.nextLine();
		num=Integer.parseInt(ss);
		//��ʹ������ǰ��һ��Ҫ���峤�ȣ������Խ��
		String s2[]=s1.nextLine().split(" ");
		a=new int[num];
		b=new int[num];
		c=new int[num];
		
		for(int i=0;i<num;i++)
		{	
			a[i]=Integer.parseInt(s2[i]);
		}
	}
	
	
	public int minNum(int a[],int num)
	{
		//�������������С��������
		for(int i=0;i<num;i++)
		{
			b[i]=1;
			for(int j=0;j<i;j++)
			{
				if(a[i]>a[j] && b[i]<b[j]+1)
				{
					b[i]+=1;
				}
			}
		}
		
		for(int i=num-1;i>=0;i--)
		{
			c[i]=1;
			for( int j=num-1;j>i;j--)
			{
				if(a[i]>a[j] && c[i]<c[j]+1)
				{
					c[i]+=1;
				}
			}
		}
		
		int temp=b[0]+c[0];
		for(int i=1;i<num;i++)
		{
			if(temp<b[i]+c[i])
			{
				temp=b[i]+c[i];
			}
		}
		
		return num-temp+1;
		
	}
	
}