package ex;
/*
 * Topic: 寫一個程式讓使用者輸入兩個正整數 n 與 m，然後顯示n x m 的乘法表，顯示完後問使用者是否繼續(Y/n) ，Y 可以重新輸入 n 則結束程式。
 * Date: 2016/10/17
 * Author: 105021118 鄭曉玫
 */
import java.util.*;
public class ex02_105021118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int m,n;
		char i=0;
		
		
		while(true){
			n=scn.nextInt();
			m=scn.nextInt();
			System.out.println(m*n);
			System.out.println("是否繼續(Y/n):");
			
			i=scn.next().charAt(0);
			if(i=='f'||i=='F'){
				break;
			}
			
		}
		
			
		
		
		
		
		 
	}

}
