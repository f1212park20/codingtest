import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr= {1, 1, 2, 2, 2, 8};
		
		int[] arr1=new int[6];
		
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
			System.out.println( arr[i] - arr1[i]);
		}
    }
}