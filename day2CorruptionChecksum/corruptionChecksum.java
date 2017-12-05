package adventofcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class corruptionChecksum {

	public static final int rowNum = 16;
	public static final int colNum = 16;
	public static ArrayList<Integer> list = new ArrayList<>();
	public static int min = 0;
	public static int max = 0;
	public static int checksum = 0;
	public static int dividedValue= 0;
	
	public static void main(String[] args) {
        System.out.println("请输入数字，按Enter键结束！");
        Scanner s=new Scanner(System.in);        
        while(s.hasNextInt()){
        	list.add(s.nextInt());
        }
        //Iterator<Integer> it1 = list.iterator();  
        //while(it1.hasNext()){  
         //   System.out.println(it1.next());  
       // }  
        System.out.println(list.size());  
        System.out.println(calChecksum(list));  
        System.out.println(finDivisableValue(list));  
	}
	
	public static int calChecksum(ArrayList<Integer> a){
		for(int i = 0; i<rowNum; i++){
			min = 5000;
			max = 0;
			for(int j=0; j<colNum; j++){
				if(a.get(colNum * i+j) < min){
					min = a.get(colNum*i+j);
				}
				if(a.get(colNum * i + j) > max){
					max = a.get(colNum*i+j);
				}
			}//for j
			checksum += max - min;
		}
		
		return checksum;
	}
	
	public static int finDivisableValue(ArrayList<Integer> a){
		int mark = 0;
		for(int i = 0; i<rowNum; i++){
			mark = 0;
			for(int j=0; j<colNum ; j++){
				if(mark ==1){
					break;
				}
				for(int k = 0; k < colNum; k++){
					if(a.get(colNum * i+j) % a.get(colNum * i +k) == 0 && j != k){
						dividedValue += a.get(colNum * i+j)/a.get(colNum * i +k) ;
						mark = 1;
						break;
					}

				}
			}


		}
		
		return dividedValue;
	}

}
