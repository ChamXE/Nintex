/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nintex;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author XuanEr
 */
public class Q6 {
	
	public static void main(String[] args) {
		
		HashMap<Character, Integer> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		String L1 = sc.nextLine();
		String L2 = sc.nextLine();
		for(int i=0; i<L1.length(); i++){
			if(map.get(L1.charAt(i)) == null){
				map.put(L1.charAt(i), 1);
			}
			else {
				int curValue = map.get(L1.charAt(i));
				curValue++;
				map.replace(L1.charAt(i), curValue);
			}
		}
		int count = 0;
		for(int i=0; i<L2.length(); i++){
			if(map.get(L2.charAt(i)) != null && map.get(L2.charAt(i)) != 0){
				count++;
				int curValue = map.get(L2.charAt(i));
				curValue--;
				map.replace(L2.charAt(i), curValue);
			}
		}
		System.out.println(count);
	}
}
