package adventofcode;

public class SpiralMemoryPartTwo {
	
	public static int[][] matrice = new int[999][999];
	public static int Row = 0;
	public static int Col = 0;
	
	public static int calNum(int a, int row, int col){
		matrice[row][col]=matrice[row-1][col-1]+matrice[row-1][col]+matrice[row-1][col+1]+matrice[row][col-1]+matrice[row][col+1]+matrice[row+1][col-1]+matrice[row+1][col]+matrice[row+1][col+1];
		if(matrice[row][col] > a ){
			return matrice[row][col];
		}
		if(matrice[row][col-1] != 0 && matrice[row-1][col] ==0||matrice[row+1][col] != 0 && matrice[row][col-1] !=0){//shang
			return calNum( a, row -1, col);
		}
		if(matrice[row+1][col] != 0 && matrice[row][col-1] ==0||matrice[row][col+1] != 0 && matrice[row+1][col] !=0){//zuo
			return calNum( a, row, col-1);
		}
		if(matrice[row][col+1] != 0 && matrice[row+1][col] ==0||matrice[row][col+1] != 0 && matrice[row-1][col] !=0){//xia
			return calNum( a, row +1, col);
		}
		if(matrice[row-1][col] != 0 && matrice[row][col+1] ==0||matrice[row-1][col] != 0 && matrice[row][col-1] !=0){//you
			return calNum( a, row , col+1);
		}		
		 return 0;
	}
	
	
	public static void main(String[] args) {
		matrice[500][500] = 1;

		System.out.println(calNum(265149,500,501));
	}

}
