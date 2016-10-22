package hw;

import java.util.Scanner;

public class hw03_105021118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);		
		int a=0;
		char k=0;
		
		while(a!=999){
			a=scn.nextInt();
		
			int count = 0;
			String str ="a=scn.nextInt()";
			for(int i=0;i<str.length();i++){
				if (str.charAt(i)>0){
					count++;					
				}
			}
				
				
				
				for(int i=0;i<str.length();i++){
					if (str.charAt(i)<0){
						count++;					
					}
				}
					
					
				
					for(int i=0;i<str.length();i++){
					if (str.charAt(i)==0){
							count++;					
						}
					}
						System.out.println("Count="+count);
						
						System.out.println("¬O§_Ä~Äò(Y/n):");
						k=scn.next().charAt(0);
						if(k=='f'||k=='F'){
							break;
						}
			}
		}
		
		
		

	}
			
		
 
		
		
