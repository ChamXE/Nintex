/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nintex;

import java.util.Arrays;

/**
 *
 * @author XuanEr
 */
public class Q2 {
	
	public static void main(String[] args) {
		
		int[] nintex = {16, 12, 10, 11, 15};
		Q2 q2 = new Q2();
		nintex = q2.sort(nintex);
		System.out.println("Sorted nintex[]: " + Arrays.toString(nintex));
		double median = 0;
		if(nintex.length % 2 == 0){
			int num1 = nintex[(nintex.length/2)-1];
			int num2 = nintex[nintex.length/2];
			median = (num1+num2)/2.0;
		}
		else {
			median = nintex[nintex.length/2];
		}
		System.out.println("Median: " + median);
		System.out.println("Sum largest: " + (nintex[nintex.length-1] + nintex[nintex.length-2]));
		System.out.println("Sum smallest: " + (nintex[0] + nintex[1]));
	}
	
	int[] sort(int[] arr){
		int gap = arr.length/2;
		while(gap>=1){
			int i = 0;
			while(i+gap < arr.length){
				if(arr[i] > arr[i+gap]){
					int temp = arr[i];
					arr[i] = arr[i+gap];
					arr[i+gap] = temp;
					int curIndex = i;
					while(curIndex-gap >= 0){
						if(arr[curIndex-gap] > arr[curIndex]){
							temp =  arr[curIndex-gap];
							arr[curIndex-gap] = arr[curIndex];
							arr[curIndex] = temp;
						}
						curIndex -= gap;
					}
				}
				i++;
			}
			gap /= 2;
		}
		return arr;
	}
}
