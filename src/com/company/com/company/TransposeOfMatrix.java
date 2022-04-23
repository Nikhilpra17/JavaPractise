package com.company;

public class TransposeOfMatrix {
	public static void main(String[] args) {
		
		int [][] tablet = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12}
		};
		
		int [][] t = gettranspose(tablet);
		
		
	}
	
	public static int[][] transpose(int[][] table, int[][] array){
		
		int N1 = table.length;
		int M1 = table[0].length;
		
		int N2 = array.length;
		int M2 = array[0].length;
		
		if (M1 == N2) {	
		int[][] newTable= new int[N1][M2];
		for (int i = 0 ; i < M1; i++) {
			for (int k = 0; k <N2 ; k++) {
				newTable[i][k]=  table[i][k]*array[k][i]  ;
			}
		}
		
		return newTable;
	}

}
