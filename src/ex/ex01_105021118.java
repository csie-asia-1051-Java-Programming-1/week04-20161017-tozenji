﻿package ex;
/*
 * Topic: 寫一個程式讓使多個正整數(包含0)直到使用者輸入-1 時停止，同時要顯示這些數字 總合 及 平均。
 * Date: 2016/10/17
 * Author: 105021118 鄭曉玫
 */
import java.util.*;
public class ex01_105021118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
	  
		
		int a=0;
		int sum=0;
		int i=0;
		while(a!=1){
			
											    
		    sum=sum+a;
		    a=scn.nextInt();
			i++;
		}
		i--;
		System.out.println("總計"+ sum +"\t平均是"+((float)sum/i) );
		
	   
		
	}

}
