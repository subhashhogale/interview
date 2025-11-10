package JavaProgram;

import java.util.ArrayList;
import java.util.List;

public class StringAll {

	
	
	public static void StringRev() {
		
		String str="subhash dnyanoba hogale";
		
		String rev="";
		
		for(int i=str.length()-1; i>=0; i--) {
			rev=rev+str.charAt(i);
		}
		
		System.out.println(rev);
	}
	public static void StringRevWithArray() {
		
		String str="subhash dnyanoba hogale";
		
		char[] v = str.toCharArray();
		
		String rev="";
		
		
		for(int i=v.length-1; i>=0; i--) {
			
			rev=rev+v[i];
		}
		
		System.out.println(rev);
		
	}
public static void StringRevWithStrinBuffre() {
		
		String str="subhash dnyanoba hogale";
		
		String v = new StringBuffer(str).reverse().toString();
		System.out.println(v);
		
		
}
public static void StringRevWithSplit() {
	
	String str="subhash dnyanoba hogale";
	//           0       1        2
	
	
	String[] v = str.split("");
	
	String rev="";
	
	
	System.out.println(v.length-1);
	
	for(int i=v.length-1; i>=0; i--) {
		
		rev=rev+v[i];
	}
	
	System.out.println(rev);
	
	
	
}
public static void Arrays() {
	
	
	int [] a= {1,2,3,4,5};
	
	int sum=0;
	
	for (int e : a) {
		
		sum+=e;
	}
	
	System.out.println(sum);
}

public static void pattern() {
	
	String str="subhash";
	for(int i=1; i<=str.length(); i++) {
		System.out.println(str.substring(0,i));
	}
}
public static void numberPattern() {
	int num=7;
	
	for(int i=1; i<=num; i++) {
		for(int j=1; j<=i; j++) {
			System.out.print(i);
		}
		System.out.println();
	}
}
public static void num() {
	int rows = 5;
	for (int i = 1; i <= rows; i++) {        // outer loop = rows
	    for (int k = 1; k <= i; k++) {       // middle loop = numbers 1..i
	        for (int j = 1; j <= k; j++) {   // inner loop = repeat k, k times
	            System.out.print(k);
	        }
	    }
	    System.out.println();
	}
}

	public static void main(String[] args) {
//		StringRev() ;
//		StringRevWithArray();
//		StringRevWithStrinBuffre();
//		StringRevWithSplit();
//		Arrays() ;
//		pattern();
//		numberPattern() ;
		num();
	}

}
