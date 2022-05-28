/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nintex;

import java.util.Scanner;

/**
 *
 * @author XuanEr
 */
public class Q1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert size of matrix: ");
		int n = sc.nextInt();
		int[][] matrix = new int[n][n];
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				matrix[i][j] = sc.nextInt();
			}
		}
		int frontDiag = 0, backDiag = 0;
		for(int i=0; i<n; i++){
			frontDiag += matrix[i][i];
			backDiag += matrix[i][matrix.length-i-1];
		}
		System.out.println(frontDiag * backDiag);
	}
}