/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nintex;

/**
 *
 * @author XuanEr
 */
public class Q5 {
	
	public static void main(String[] args) {
		
		int count = 0;
		for(int i=2; count<8888; i++){
			if(i == 2){
				count++;
			}
			else {
				if(i % 2 != 0){
					boolean isPrime = true;
					for(int j=2; j<=Math.sqrt(i); j++){
						if(i % j == 0){
							isPrime = false;
							break;
						}
					}
					if(isPrime){
						count++;
					}
				}
			}
			if(count == 8888){
				System.out.println(i);
				break;
			}
		}
	}
}
