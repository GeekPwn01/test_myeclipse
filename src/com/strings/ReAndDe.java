/**
 * �ַ����ӽ�����
 * PS:��Ϊ���⣬�����ϸ����ĸ�ʽд������ֻҪ��ʵ����ȷ���������������
 * ��
 */

package com.strings;



import java.util.Scanner;

public class ReAndDe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RealityImpli rr1=new RealityImpli();
		
		rr1.Encrypt(rr1.aucPssword, rr1.aucResult);
		rr1.unEncrypt(rr1.result,rr1.password );

	}

}


class RealityImpli
{
	char aucPssword[]=new char[100];
	char aucResult[]=new char[100];
	char password[]=new char[100];
	char result[]=new char[100];
	public RealityImpli()
	{
		Scanner sc1=new Scanner(System.in);
		char d[] =sc1.nextLine().toCharArray();
		for(int i=0;i<d.length;i++)
		{
			aucPssword[i]=d[i];
		}
		
		aucPssword[d.length]='\0';
		char d1[]=sc1.nextLine().toCharArray();
		
		for(int i=0;i<d1.length;i++)
		{
			result[i]=d1[i];
		}
		result[d.length]='\0';
				
	}
	public void Encrypt(char aucPssword[],char aucResult[])
	{
		int i=0;
		int cout=0;
		while(aucPssword[i]!='\0')
		{
			cout++;
			if(aucPssword[i]>='a' && aucPssword[i]<='z')
			{
				if(aucPssword[i]=='z')
				{
					aucResult[i]='A';
				}else {
					
					aucResult[i]=(char)(aucPssword[i]-31);
				}
			}else if(aucPssword[i]>='A' && aucPssword[i]<='Z')
			
			{
				
				if(aucPssword[i]=='Z')
				{
					aucResult[i]='a';
				}else {
					
					aucResult[i]=(char)(aucPssword[i]+33);
				}
			}else if(aucPssword[i]>='0' && aucPssword[i]<='9')
				
			{
				if(aucPssword[i]=='9')
				{
					aucResult[i]='0';
				}else {
					
					aucResult[i]=(char)(aucPssword[i]+1);
				}
			}else {
				
				aucResult[i]=aucPssword[i];
			}
			i++;
			
		}
		
		aucResult[cout]='\0';
		
		for(int j=0;j<cout;j++)
		{
			System.out.print(aucResult[j]);
		}
		System.out.println();
	}
	
	public int unEncrypt(char result[],char password[])
	{
//		int p[];
		int i=0;
		int cout=0;
		while(result[i]!='\0')
		{
			cout++;
			if(result[i]>='a' && result[i]<='z')
			{
				if(result[i]=='a')
				{
					result[i]='Z';
				}else {
					
					password[i]=(char)(result[i]-33);
				}
			}else if(result[i]>='A' && result[i]<='Z')
			
			{
				
				if(result[i]=='A')
				{
					password[i]='z';
				}else {
					
					password[i]=(char)(result[i]+31);
				}
			}else if(result[i]>='0' && result[i]<='9')
				
			{
				if(result[i]=='0')
				{
					password[i]='9';
				}else {
					
					password[i]=(char)(result[i]-1);
				}
			}else {
				password[i]=result[i];
			}
			i++;
		}
		
		password[cout]='\0';
//		p=new int[cout+1];
		for(int j=0;j<cout;j++)
		{
			System.out.print(password[j]);
//			p[j]=(int)password[j];
		}
		System.out.println();
		return 1;
	}
	
	
}



//view plaincopy to clipboardprint?
//import java.util.Scanner;  
//  
///* 
// * ��Ŀ���� 
//1����������ַ������мӽ��ܣ�������� 
//2���ܷ���Ϊ�� 
//��������Ӣ����ĸʱ���ø�Ӣ����ĸ�ĺ�һ����ĸ�滻��ͬʱ��ĸ�任��Сд,����ĸaʱ���滻ΪB����ĸZʱ���滻Ϊa�� 
//������������ʱ��Ѹ����ּ�1����0�滻1��1�滻2��9�滻0�� 
//�����ַ������仯�� 
//3�����ܷ���Ϊ���ܵ�����̡� 
//�ӿ������� 
//    ʵ�ֽӿڣ�ÿ���ӿ�ʵ��1������������ 
//void Encrypt (char aucPassword[], char aucResult[])���ڸú�����ʵ���ַ������ܲ���� 
//˵���� 
//1���ַ�����\0��β�� 
//2���ַ����100���ַ��� 
//int unEncrypt (char result[], char password[])���ڸú�����ʵ���ַ������ܲ���� 
//˵���� 
//1���ַ�����\0��β�� 
//    2���ַ����100���ַ��� 
// * */  
//public class Main {  
//  
//    public static void main(String[] args) {  
//        Scanner sc = new Scanner(System.in);  
//        String s1 = sc.nextLine();  
//        String s2 = sc.nextLine();  
//        sc.close();  
//        System.out.println(encrypt(s1));  
//        System.out.println(decrypt(s2));  
//    }  
//  
//    private static String decrypt(String s2) {  
//        char[] c = s2.toCharArray();  
//        for(int i=0;i<c.length;i++){  
//            if(c[i]>64 && c[i]<91)  
//                c[i]=(char)(c[i]+31);  
//            else if(c[i]>96 && c[i]<123)  
//                c[i]=(char)(c[i]-33);  
//            else if(c[i]>47 && c[i]<58)  
//                c[i]=(char)(48+(c[i]-39)%10);  
//            else;  
//        }  
//        return new String(c);  
//    }  
//  
//    private static String encrypt(String s1) {  
//        char[] c = s1.toCharArray();  
//        for(int i=0;i<c.length;i++){  
//            if(c[i]>64 && c[i]<91)  
//                c[i]=(char)(c[i]+33);  
//            else if(c[i]>96 && c[i]<123)  
//                c[i]=(char)(c[i]-31);  
//            else if(c[i]>47 && c[i]<58)  
//                c[i]=(char)(48+(c[i]-47)%10);  
//            else;  
//        }  
//        return new String(c);  
//    }  
//  
//}  