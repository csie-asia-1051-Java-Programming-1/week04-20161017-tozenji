package hw;
import java.util.Scanner;
public class hw01_105021118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int [ ]f = new int[n+1];
		f[0]=0; 
		f[1]=1;
		for(int i=2; i<f.length;i++){
			f[i]=f[i-1]+f[i-2];
			System.out.print(f[i]+"\t");
		}
	
	}

}
