package adventofcode;

import java.util.Scanner;
import java.util.Arrays;

public class highEntropyPassPhrases {

	public static String[] listCode = new String[800];
	public static int line = 0;
	public static int num = 0;
	public static int sumTotalPass = 0;

	public static void main(String[] args) {
        System.out.println("请输入密码！");
        Scanner s = new Scanner(System.in);   
		while(s.hasNextLine()){
			String a = s.nextLine();
			if(a.equals("end"))
				break;

			listCode[num] = a;
			num++;
        }//while
        for(int k =0 ; k< listCode.length ; k++){
        	System.out.println(listCode[k]);
        }
        for(int m = 0; m < listCode.length; m++){
        	if(listCode[m] != null){
        		findMot(listCode[m]);
        	}
        }
        System.out.print(sumTotalPass);
        
	}
	
	public static void findMot(String str){
		String[] divideS = new String[20];
		divideS = str.split(" ");
		for(int i=0;i<divideS.length-1;i++){
		    //System.out.println(divideS[i].toString());
		    for(int j = i+1; j<divideS.length;j++){
		    	if(divideS[i].equals(divideS[j]))
		    		return;
		    	if(divideS[i].length()==divideS[j].length()){
		    		char[] a;
		    		char[] b;
		    		a = divideS[i].toCharArray();
		    		Arrays.sort(a);
		    		b = divideS[j].toCharArray();
		    		Arrays.sort(b);
		    		int mark =0;
		    		while(mark < a.length){
		    			if(a[mark]!=b[mark]){
		    				break;
		    			}
		    			else{
		    				mark++;
		    			}
		    			if(mark == a.length)
		    				return;
		    		}//
		    	}
		    }
		}
		sumTotalPass++;
	}
	
}


