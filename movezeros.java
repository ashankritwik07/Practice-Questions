package pack1;
 import java.util.Scanner;

public class movezeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int j = 0;
		
		int[] arr = new int[n];
		for(int i=0 ; i<n ; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				 j = i;
				 break;
			}
		}
		for(int i=j+1 ; i<n ; i++) {
			if(arr[i]!=0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		for(int i=0 ; i<n ; i++) {
			System.out.println(arr[i]);
		}
	}

}
