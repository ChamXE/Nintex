/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nintex;

import java.math.BigInteger;

/**
 *
 * @author XuanEr
 */
public class Q7 {
	
	public static void main(String[] args) {
		
		BigInteger factorial = new BigInteger("1");
		for(int i=333; i>=2; i--){
			factorial = factorial.multiply(BigInteger.valueOf(i));
		}
		int sum = 0;
		String multiply = factorial.toString();
		for(int i=0; i<multiply.length(); i++){
			sum += Integer.parseInt(String.valueOf(multiply.charAt(i)));
		}
		System.out.println(sum);
	}
}
