package pack1;
import java.util.Scanner;
public class rotatearraytoleft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i= 0 ; i<n ; i++) {
			arr[i] = sc.nextInt();
		}
		int temp = arr[0];
		for(int i =1 ; i<n ; i++) {
			arr[i-1] = arr[i];
		}
		arr[n-1] = temp;
		for(int i =0 ; i<n ; i++) {
			System.out.println(arr[i]);	
		}
		

	}

}
