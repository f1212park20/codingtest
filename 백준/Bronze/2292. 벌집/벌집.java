import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
		
		int num_pileup=1;
		int cnt=1;
		while(n> num_pileup) {
			num_pileup+=6*cnt;
			cnt+=1;
					
		}
		System.out.println(cnt);
        
		
		
	}
}