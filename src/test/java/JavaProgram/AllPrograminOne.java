package JavaProgram;

import java.util.Arrays;

public class AllPrograminOne {

	
	public static void PushizingZro() {
		
		int a[]= {1,2,0,3,4,0,5,0,6,7};
		
		int count=0;
		for(int i=0; i<a.length; i++) {
			
			if(a[i]!=0) {
				a[count]=a[i];
				count++;
			}
		}
		
		for(int i=count;i<a.length;i++ ) {
			
			a[i]=0;
		}
		
		for (int i : a) {
			System.out.println(i);
		}
	}
	
	public static void findhighestNumber() {
		
		int a[]= {1,2,36,9,87,5,6};
		Arrays.sort(a);
		System.out.println(a[a.length-1]);
	}
public static void findhighestNumber1() {
		
		int a[]= {1,2,36,9,87,5,6};
	
		int temp=0;
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length-1; j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		System.out.println(a[a.length-1]);
	}
     public static void uppertoLower() {
	
	String str="subhash HOGALE";
	
	char c ;
	String s="";
	
	for(int i=0; i<str.length(); i++) {
		
		 c = str.charAt(i);
		
		if(c>=65 && c<=90) {
			
			s+=(char)(c+32);
		}
		
		else if(c>=97 &&c<=122) {
			s+=(char)(c-32);
		}
		else {
			s+=c;
		}
		
	}
	
	System.out.println(s);
}
     
     public static void occurances() {
    	 int a[]= {1,2,1,2,1,2,3,65,47,89,};
    	 
    	 int count=0;
    	 
//    	for(int i=0; i<a.length; i++) {
//    		
//    		if(a[i]==2) {
//    			count++;
//    		}
//    	}
    	 
    	 for (int i : a) {
			
    		 
    		 if(i==1) {
    			 count++;
    		 }
		}
    	 
    	 
    	 System.out.println(count);
     }
     
     public static void pallindrom() {
    	 
    	int a=123212;
    	
    	String str = Integer.toString(a);
    	
    	String rev="";
    	
    	for(int i=str.length()-1;i>=0; i--) {
    		
    		
    		rev=rev+str.charAt(i);
    	}
    	
    	int b = Integer.parseInt(rev);
    	
    	if(a==b) {
    		System.out.println("this is pallindrom number");
    	}
    	else {
    		System.out.println("not pallindrom number");
    	}
     
     }
     
     public static void amstrongNumber() {
    	 
    	 int a=152;
    	 
    	 int rem=0;
    	 int sum=0;
    	for(int i=a; i>0; i=i/10) {
    		rem=i%10;
    		
    		sum=sum+rem*rem*rem;

    		}
    	
    	if(sum==a) {
    		System.out.println("armstron number");
    	}
    	
    	else {
    		System.out.println("not armstrong number");
    	}
     }
     
     public static void factorial() {
    	 int a=5;
    	 
    	 int fact=1;
    	 
    	 for(int i=a; i>0; i--) {
    		fact= i*fact;
    	 }
    	 System.out.println(fact);
     }
     
     public static void anegram() {
    	 String str="subg";
    	 String str1="bus";
    	char[] a = str.toCharArray();
    	char[] a1 = str1.toCharArray();
    	
    	Arrays.sort(a);
    	Arrays.sort(a1);
    	
    	boolean result = Arrays.equals(a, a1);
    	
    	if(result==true) {
    		System.out.println("anegram ");
    	}
    	else {
    		System.out.println("not angram");
    	}
    	
    	 
     }
     
     public static void FabinnociSeries() {
    	 
    	 int a=0,b=0,i=0,k=1;
    	while(i<10) {
    		
    		a=b;
    		b=k;
    		k=a+b;
    		System.out.println(a);
    		i++;
    	}
     }
     public static void ConANdvowels() {
    	 
    	 String str="subhash dnyanoba hogale";
    	 String con="";
    	 String vol="";
    	 int c=0;
    	 int v=0;
    	 
    	 for(int i=0; i<str.length(); i++) {
    		 
    		 if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
    			 
    			 vol=vol+str.charAt(i);
    			 v++;
    		 }
    		// else if(str.charAt(i)!=' ')
    		 
    		 else if(str.charAt(i)>='a'&&str.charAt(i)<='z')
    		 {
    			 con=con+str.charAt(i);
    			 c++;
    		 }
    	 }
    	 
    	 System.out.println("vol: "+vol +"("+v+")");
    	 System.out.println("con: "+con +"("+c+")");
     }
     
     public static void countString() {
    	 String str="subhash dnyanoba hogale";
    	 
    	 String[] v = str.split(" ");
    	 
    	 for(int i=0; i<v.length; i++) {
    		 
    		 String str1 = v[i];
    		 
    		 int count=0;
    		 
    		 for(int j=0; j<str1.length(); j++) {
    			 count++;
    		 }
    		 System.out.println(str1+";"+count);
    	 }
    	 
     }
     
     public static void StringRev() {
    	 
    	 String str="subhash dnyanoba hogale";
    	 String[] v = str.split(" ");
    	 
    	 for(int i =0; i<v.length; i++) {
    		String str1 = v[i];
    		String rev="";
    		for(int j=str1.length()-1; j>=0; j--) {
    			rev=rev+str1.charAt(j);
    		}
    		System.out.print(rev+" ");
    	 }
     }
	public static void main(String[] args) {
	//	PushizingZro() ;
	//	findhighestNumber();
	//	findhighestNumber1() ;
	//	uppertoLower();
	//	occurances();
	//	pallindrom();
	//	amstrongNumber();
	//	factorial();
	//	anegram();
	//	FabinnociSeries();
	//	ConANdvowels();
	//	countString();
		StringRev();
	}

}
