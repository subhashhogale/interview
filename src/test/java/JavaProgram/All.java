package JavaProgram;

import java.util.Arrays;

public class All {

	public static void sum() {
		int a = 12345;

		int b = 0;

		for (int i = a; i > 0; i--) {

			b += a % 10;
			a = a / 10;
		}
		System.out.println(b);
	}

	public static void AllIntvalue() {

		String str = "subhash17389";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {

			if (Character.isDigit(str.charAt(i))) {

				sum = sum + Character.getNumericValue(str.charAt(i));
			}
		}
		System.out.println(sum);
	}

	public static void extractSpcAndNum() {
		String str = "subhash17389!@#$";
		String number = str.replaceAll("[^0-9]", "");
		String ch = str.replaceAll("[^a-z]", "");
		String sp = str.replaceAll("[^\\W]", "");
		System.out.println(number);
		System.out.println(ch);
		System.out.println(sp);

	}

	public static void countString() {

		String str = "subhash Dnyanoba hogale";
		String[] v = str.split(" ");

		for (int i = 0; i < v.length; i++) {
			String str1 = v[i];
			int count = 0;
			for (int j = 0; j < str1.length(); j++) {
				count++;
			}
			System.out.println(str1 + ";" + count);
		}
	}

	public static void countString1() {

		String str = "subhash Dnyanoba hogale";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println(count);
	}

	public static void occurance() {
		int [] a= {1,2,3,2,5,4,2};
		
		int count=0;
		for(int i=0; i<a.length; i++) {
			if(a[i]==2) {
				count++;
			}
		}
		System.out.println(count);
	}
	public static void occurance1() {
		int [] a= {1,2,3,2,5,4,2};
		int count=0;
		for (int i : a) {
			if(i==2) {
				count++;
			}
		}
		System.out.println(count);
		
		
	}
	
	
	public static void subString() {
		
		String str="subhash";
		String v = str.substring(4,7);
		System.out.println(v);
	}
public static void subString1() {
		
		String str="subhash dnyanoba hogale";
		
		 String bf = new StringBuffer(str.substring(8,16)).reverse().toString();
		 
		String one = str.substring(0,7);
		String th = str.substring(17,23);
		
		System.out.println(one+" "+bf+" "+th);
	
}
	
public static void SubString2() {
	String str="subhash";
	
	for(int i=0; i<str.length(); i++) {
		for(int j=i; j<str.length(); j++) {
			System.out.println(str.substring(i, j+1));
		}
	}
}
	
	public static void anngrma() {
		
		String str="sub1";
		String str1="bus";
		
		char[] v = str.toCharArray();
		char[] v1 = str1.toCharArray();
		
		Arrays.sort(v1);
		Arrays.sort(v);
		
		boolean result = Arrays.equals(v, v1);
		
		if (result==true) {
			
			System.out.println("anngram");
		} else {
System.out.println("not anngram");
		}

	}
	public static void ArmStrong() {
		int a=152;
		int sum=0;
		int rem=0;
		for(int i=a; i>0; i=i/10) {
			
			rem=i%10;
			sum=sum+rem*rem*rem;
		}
		if (a==sum) {
			System.out.println("armstrong numner");
		} else {
			System.out.println("not armstrong numner");
		}
	}
	public static void factorial() {
		
		int a=5;
		
		int fact=1;
		
		
		for(int i=a; i>0; i--) {
			
			fact=i*fact;
		}
		System.out.println(fact);
	}
	public static void fabbinocciSeri() {
		int a=0, b=1, i=0, k=1;
		
		while (10>i) {
			
			a=b; b=k;
			k=a+b;
			System.out.println(a);
			i++;
			
		}
	}
	
	public static void sortarrays() {
		   int [] a={1,5,6,2,3,8,9};
	        Arrays.sort(a);
	    
	        
	        System.out.println(a[a.length-1]);
	}
	
	public static void main(String[] args) {

		// sum();
//	AllIntvalue() ;
//	extractSpcAndNum();
//		countString();
//		countString1();
//		occurance() ;
//		occurance1();
//		subString();
//		subString1();
//		SubString2();
//		anngrma();
//		ArmStrong();
//		factorial();
		fabbinocciSeri();
	}
}
