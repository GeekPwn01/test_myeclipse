/**
 * 经验分享： 
1、分隔符为“.”(无输出),“|”(不能得到正确结果)转义字符时,“*”,
“+”时出错抛出异常,都必须在前面加必须得加"\\",如split(\\|); 
2、如果用"\"作为分隔,就得写成这样：String.split("\\\\"),
因为在Java中是用"\\"来表示"\"的,字符串得写成这样：
String Str="a\\b\\c"; 
转义字符,必须得加"\\"; 
3、如果在一个字符串中有多个分隔符,可以用"|"作为连字符
,比如：String str="Java string-split#test",
可以用Str.split(" |-|#")把每个字符串分开; 
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
		String s1[]=(s.nextLine()).split("\\.");//注意这个，写成split(".")是不对的
		
		
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
