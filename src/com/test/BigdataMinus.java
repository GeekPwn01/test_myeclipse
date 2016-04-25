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
	
	//�жϷ���
	char sign='+';
	
	//len��Ŀ���Ǽ�¼result�����ұ�֤����֮�Ͳ������
	//result��������Ϊlen+1
	int len;
	
	public Minus()
	{
		//����һ�������Կո�Ͽ���Ϊ��������,���ַ���s1,s2
		
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
		
		//��������鳤������Ǹ�
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
		
		//���������ĳ�����鳤�ȣ�����0��������һ�������,
		//���c1��(��sign= +)����c1-c2;����c2-c1
		
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
		
		//��ɽ�λҪ��
		for(int i=0;i<len;i++)
		{
			if(result[i]<0)
			{
				result[i]=result[i]+10;
				result[i+1]-=1;
			}
		}
		
		//ȥ��ǰ��0�����������
		StringBuffer sb1=new StringBuffer();
		boolean flag =true;
		for(int i=len-1;i>=0;i--)
		{
			if(flag && result[i]==0)
			{
				continue;//��������ѭ���������´�ѭ������break����
			}else {
				flag=false;
			}
			sb1.append(result[i]);
		}
		
		//bug ���������û��ֵ�����������
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
