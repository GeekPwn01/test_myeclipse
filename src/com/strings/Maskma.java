/**
 * ������� 
1���ָ���Ϊ��.��(�����),��|��(���ܵõ���ȷ���)ת���ַ�ʱ,��*��,
��+��ʱ�����׳��쳣,��������ǰ��ӱ���ü�"\\",��split(\\|); 
2�������"\"��Ϊ�ָ�,�͵�д��������String.split("\\\\"),
��Ϊ��Java������"\\"����ʾ"\"��,�ַ�����д��������
String Str="a\\b\\c"; 
ת���ַ�,����ü�"\\"; 
3�������һ���ַ������ж���ָ���,������"|"��Ϊ���ַ�
,���磺String str="Java string-split#test",
������Str.split(" |-|#")��ÿ���ַ����ֿ�; 
 */

package com.strings;


import java.util.*;



public class Maskma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Judge d1=new Judge();
		System.out.println(d1.isSame(d1.ip1, d1.ip2, d1.mask));

	}

}


//class Judge
//{
//	int ip1[];
//	int ip2[];
//	int mask[];
//	int flag=0;
//	
//	public Judge()
//	{
//		InputStreamReader isr1=null;
//		BufferedReader br1=null;
//		
//		isr1=new InputStreamReader(System.in);
//		br1=new BufferedReader(isr1);
//		
//		String s1=
//		
//		mask=new int[s1.length];
//		
//		for(int i=0;i<s1.length;i++)
//		{System.out.println(22222);
//			mask[i]=Integer.parseInt(s1[i]);
//			
//			if(mask[i]<0 || mask[i]>255)
//			{
//				
//				flag=1;
//			}
//			
//		}
//		
//		String s2[]=s.nextLine().split(".");
//		ip1=new int[s2.length];
//		for(int i=0;i<s2.length;i++)
//		{
//			ip1[i]=Integer.parseInt(s2[i]);
//			if(ip1[i]<0 || ip1[i]>255)
//			{
//				
//				flag=1;
//			}
//			
//		}
//        String s3[]=s.nextLine().split(".");
//		
//		ip2=new int[s3.length];
//		for(int i=0;i<s3.length;i++)
//		{
//			ip2[i]=Integer.parseInt(s3[i]);
//			if(ip2[i]<0 || ip2[i]>255)
//			{
//				
//				flag=1;
//			}
//			
//		}
//		s.close();
//	}
//	
//	public int isSame(int ip1[],int ip2[],int mask[])
//	{
//		int temp1[]=new int[4];
//		int temp2[]=new int[4];
//		
//		if(flag==1)
//		{
//			return 1;
//		}
//		
//		for(int i=0;i<4;i++)
//		{
//		    temp1[i]=ip1[i] & mask[i]; 	
//		    temp2[i]=ip2[i] & mask[i]; 
//		    if(temp1[i] !=temp2[i])
//		    {
//		    	return 2;
//		    }
//		}
//		return 0;
//		
//		
//	}
//	
//}



class Judge
{
	int ip1[];
	int ip2[];
	int mask[];
	int flag=0;
	
	public Judge()
	{
		Scanner s=new Scanner(System.in);
		String s1[]=(s.nextLine()).split("\\.");//ע�������д��split(".")�ǲ��Ե�
		
		
		mask=new int[s1.length];
		
		for(int i=0;i<s1.length;i++)
		{
			mask[i]=Integer.parseInt(s1[i]);
			
			if(mask[i]<0 || mask[i]>255)
			{
				
				flag=1;
			}
			
		}
		
		String s2[]=s.nextLine().split("\\.");
		ip1=new int[s2.length];
		for(int i=0;i<s2.length;i++)
		{
			ip1[i]=Integer.parseInt(s2[i]);
			if(ip1[i]<0 || ip1[i]>255)
			{
				
				flag=1;
			}
			
		}
        String s3[]=s.nextLine().split("\\.");
		
		ip2=new int[s3.length];
		for(int i=0;i<s3.length;i++)
		{
			ip2[i]=Integer.parseInt(s3[i]);
			if(ip2[i]<0 || ip2[i]>255)
			{
				
				flag=1;
			}
			
		}
		s.close();
	}
	
	public int isSame(int ip1[],int ip2[],int mask[])
	{
		int temp1[]=new int[4];
		int temp2[]=new int[4];
		
		if(flag==1)
		{
			return 1;
		}
		
		for(int i=0;i<4;i++)
		{
		    temp1[i]=ip1[i] & mask[i]; 	
		    temp2[i]=ip2[i] & mask[i]; 
		    if(temp1[i] !=temp2[i])
		    {
		    	return 2;
		    }
		}
		return 0;
		
		
	}
	
}
