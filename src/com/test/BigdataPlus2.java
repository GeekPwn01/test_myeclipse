package com.test;

import java.io.*;

public class BigdataPlus2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plus1 plus1=new Plus1();
		
		plus1.print(plus1.pluss(plus1.s1, plus1.s2));

	}

}


class Plus1
{
	
	String s1;
	String s2;
	
	int result[];
	int lena;
	int lenb;
	
	//len��Ŀ���Ǽ�¼result�����ұ�֤����֮�Ͳ������
	//result��������Ϊlen+1
	int len;
	
	public Plus1()
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
	
	public String pluss(String s1,String s2)
	{
		char c1[]=new StringBuffer(s1).reverse().toString().toCharArray();
		char c2[]=new StringBuffer(s2).reverse().toString().toCharArray();
		
		lena=c1.length;
		lenb=c2.length;
		
		//��������鳤������Ǹ�
		len=lena>lenb ? lena:lenb;
		
		result=new int[len+1];
		
		//���������ĳ�����鳤�ȣ�����0��������һ�������
		
		int a;
		int b;
		for (int i=0;i<len+1;i++)
		{
			a=i<=(lena-1) ? (int)(c1[i]-'0') : 0;
			b=i<=(lenb-1) ? (int)(c2[i]-'0') : 0;
			
			result[i]=a+b;
		}
		
		//��ɽ�λҪ��
		for(int i=0;i<len+1;i++)
		{
			if(result[i]>=10)
			{
				result[i]=result[i]%10;
				result[i+1]+=1;
			}
		}
		
		//ȥ��ǰ��0�����������
		StringBuffer sb1=new StringBuffer();
		boolean flag =true;
		for(int i=len;i>=0;i--)
		{
			if(flag && result[i]==0)
			{
				continue;//��������ѭ���������´�ѭ������break����
			}else {
				flag=false;
			}
			sb1.append(result[i]);
		}
		
		return sb1.toString();
		
	}
	
	
	public void print(String s)
	{
		System.out.println(s);		
		
	}
	
}
