package backjoon;
import java.util.Scanner;

public class 2438baek_star1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int i;
		int j;
		
		for(i=0; i<N; i++) {
			for(j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
