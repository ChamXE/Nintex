/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nintex;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author XuanEr
 */
public class Q3 {
	
	public static void main(String[] args) {
		
		HashMap<Integer, Boolean> map = new HashMap<>();
		int[] nintex = {1, 2, 3, 4, 5,8,6,7};
		int K = 9;
		ArrayList<Integer> num1 = new ArrayList<>();		
		ArrayList<Integer> num2 = new ArrayList<>();		
		for(int i=0; i<nintex.length; i++){
			map.put(nintex[i], false);
		}
		for(int i=0; i<nintex.length; i++){
			int complement = K - nintex[i];
			if(map.get(complement) != null){
				if(map.get(complement) == false){
					map.replace(nintex[i], true);
					map.replace(complement, true);
					num1.add(nintex[i]);
					num2.add(complement);
				}
			}
		}
		System.out.print("Only (");
		for(int i=0; i<num1.size(); i++){
			if(i == num1.size()-1){
				System.out.print(num1.get(i) + ", " + num2.get(i) + ")");
				break;
			}
			System.out.print(num1.get(i) + ", " + num2.get(i) + "), (");
		}
		System.out.print(" have the sum equal to " + K + "\n");
	}
}
