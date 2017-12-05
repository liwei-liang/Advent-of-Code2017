package adventofcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TwistyTrampolines {
	public static int steps = 0;
	public static int pos =0;
	public static ArrayList<Integer> list = new ArrayList<>();

	public static void main(String[] arg){
        System.out.println("请输入数字！");
        Scanner s=new Scanner(System.in);        
        while(s.hasNextInt()){
        	list.add(s.nextInt());
        }
        System.out.println(list.size());
        Iterator<Integer> iterator = list.iterator();
        System.out.println(calSteps(list));
        //while(iterator.hasNext()){
        	//System.out.print(iterator.next() + " ");
       // }
	}
	
	public static int calSteps(ArrayList<Integer> list){
		int length = list.size();
		while(pos < length){
			if(list.get(pos)>=3){
				list.set(pos, list.get(pos)-1);
				pos += list.get(pos) + 1;
			}else{
				list.set(pos, list.get(pos)+1);
				pos += list.get(pos) - 1;
			}
			steps++;
		}
	
		return steps;
	}
	
}
