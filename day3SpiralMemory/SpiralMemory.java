package adventofcode;

public class SpiralMemory {

	public static int posRow = 0;
	public static int posCol = 0;
	public static int[] i={posRow,posCol,0,0};
	
	public static int[] calPos(int a){
		double nf = Math.sqrt(a);
		int n = (int)Math.ceil(nf);
		if(n%2 ==0){
			n +=1;
		}
		
		if(Math.floor((a - (n-2)*(n-2)) / (n-1)) == 0){
			posCol = n;
			posRow = n-((a - (n-2)*(n-2))%(n-1));
		}
		if(Math.floor((a - (n-2)*(n-2)) / (n-1)) == 1){
			posCol = n-(a - (n-2)*(n-2)) % (n-1);
			posRow = 1;
		}
		if(Math.floor((a - (n-2)*(n-2)) / (n-1)) == 2){
			posCol = 1;
			posRow = (a - (n-2)*(n-2)) % (n-1) + 1;
		}
		if(Math.floor((a - (n-2)*(n-2)) / (n-1)) == 3){
			posCol = (a - (n-2)*(n-2)) % (n-1) + 1;
			posRow = n;
		}
		if(Math.floor((a - (n-2)*(n-2)) / (n-1)) == 4){
			posCol = n;
			posRow = n;
		}
		i[0] = posRow;
		i[1] = posCol;
		i[2] = n;
		i[3] = Math.abs((n+1)/2 - posRow) + Math.abs((n+1)/2 -posCol);
		return i;
	}
	public static void main(String[] args) {
		calPos(265149);
		System.out.println(i[0]);
		System.out.println(i[1]);
		System.out.println(i[2]);
		System.out.println(i[3]);
	}

}
