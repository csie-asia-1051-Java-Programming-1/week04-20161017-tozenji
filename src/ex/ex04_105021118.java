﻿package ex;
/*
 * Topic: 讓使用者輸入 一個正整數 n 及一個字元符號，然後顯示出下列圖形 (例 n = 4,字元符號= @)
    @@@@
    @@@  
    @@  
    @
 * Date: 2016/10/17
 * Author: 105021118 鄭曉玫
 */
import java.util.*;
public class ex04_105021118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int i, j; 
		int size=scn.nextInt();
		 for (i = 1; i <= size; i++) { 
		        for (j = 1; j <= i; j--) { 
		         System.out.print("*");
		        }
		        System.out.print("\n");
		        }
		
		
	
	}

}
