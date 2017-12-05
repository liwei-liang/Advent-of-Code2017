package adventofcode;

import java.util.Scanner;

public class Captcha {

	public static int digitMax = 0;
	public static int listPossible=0;
	public static int[] digitLength = new int[10];
	
	public static void findList(char[] a){
	  while(digitMax <= a.length/2){
		digitMax ++;
		for(int i=0; i < digitMax; i++){
			if(a[i] != a[digitMax+i]){
				break;
			}
			else if( i == digitMax -1){
				 digitLength[listPossible] = digitMax;
				 listPossible ++;
				}
		}// for 

	  }
	}
		public static void claSum(char[] a){
			int listLength = a.length/2;
			for(int i=0; i < a.length/2; i++){
				if(a[i] == a[i+listLength]){
					digitMax +=a[i]-48;
				}
			}
			for(int i=a.length/2; i < a.length; i++){
				if(a[i] == a[i-listLength]){
					digitMax +=a[i]-48;
				}
			}
			
	}
	
	public static void main(String[] args) {
        System.out.println("请输入数字，按Enter键结束！");
        Scanner s=new Scanner(System.in);        
        String str=s.next();
        char[] c=str.toCharArray();
        System.out.println(c.length);
        claSum(c);
        char a = '1';
        char b ='2';
        System.out.println(digitMax);
       // System.out.println(b+b);
	}
	
}
