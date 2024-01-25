import java.util.*;
 
 
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str=sc.next().trim();
		String[] arr= {"c=","c-","dz=","d-","lj","nj","s=","z="};
	    int result=0;
	    
	    int count=0;
	    for(int i=0;i<arr.length;i++) {
	    	if(str.contains(arr[i])) {
	    		str=str.replaceAll(arr[i], " ");
	    		
	    	}
	    }
	    System.out.println(str.length());
      }  
 }
