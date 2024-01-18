import java.util.*;


public class Main {
      
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
		int a=sc.nextInt();
		
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int j =0;j<arr.length;j++) {
			if(arr[j]<a) {
				System.out.print(arr[j]+" ");
			}
		}
        
    }
}