/**
 * �˷�bug��0*num    -num*num   -num*-num
 * 
 * http://blog.csdn.net/lichong_87/article/details/6860329
 */

package com.test;

import java.io.*;

public class BigdataMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multi ml=new Multi();
		ml.print(ml.multi(ml.s1,ml.s2));

	}

}



class Multi
{
	
	String s1;
	String s2;
	
	int result[];
	int lena;
	int lenb;
	
	//�жϷ���
	char sign='+';
	
	//len��Ŀ���Ǽ�¼result�����ұ�֤����֮�Ͳ������
	//result��������Ϊlen=lena+lenb
	int len;
	
	public Multi()
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
	
	public String multi(String s1,String s2)
	{
		//�жϷ���
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
				
//				sign=signb;//����û������һ��˼·����
				sign='-';
			}
			s2=s2.substring(1);
		}
		
		char c1[]=new StringBuffer(s1).reverse().toString().toCharArray();
		char c2[]=new StringBuffer(s2).reverse().toString().toCharArray();
		
		
		lena=c1.length;
		lenb=c2.length;
		
		//���result���鳤��
		len=lena+lenb ;
		
		result=new int[len];
		
		
		
		//ѭ����˲��ӵ�result,a*b
		
		
		for (int i=0;i<lenb;i++)
		{
			for(int j=0;j<lena;j++)
			{
				result[j+i]+=(c1[j]-'0')*(c2[i]-'0');
			}
			
			
		}
		
		//��ɽ�λҪ��
		for(int i=0;i<len;i++)
		{
			if(result[i]>=10)
			{
				result[i+1]+=result[i]/10;
				result[i]=result[i]%10;
			}
		}
		
		//ȥ��ǰ��0�����������
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
		if(sign=='-')
		{
			System.out.print(sign);
			System.out.println(s);	
		}else {
		    System.out.println(s);
		}
				
		
	}
	
}
