package JavaProgram;

import java.util.HashMap;
import java.util.Map;

public class Prog {

	public static void duplicateChar() {
		String str="subhash";
		
		char[] v = str.toCharArray();
		Map<Character,Integer>map=new HashMap<>();
		
		for (char c : v) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for(Map.Entry<Character, Integer>entry:map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+"--"+entry.getValue()+" "+"times");
			}
		}
		
	}
	public static void keyValue() {
		String str="name=subhash|phone=12345|emai=subhash123@gmail.com";
		
		String[] v = str.split("\\|");
		
		for (String e : v) {
			String[] v1 = e.split("=");
			if(v1.length==2) {
				String key = v1[0];
				String value = v1[1];
				System.out.println("Key="+key+" value="+value);
			}
		}	
	}
	public static void duplicateString() {
		String str="subhash subhash dnyanoba hogale";
		String[] v = str.split(" ");
		Map<String,Integer>map=new HashMap<>();
		
		for (String s : v) {
			map.put(s, map.getOrDefault(s, 0)+1);		
		}	
		for(Map.Entry<String, Integer>entry:map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+"--"+entry.getValue()+"  times");
			}
		}
	}
	public static void upperToLower() {
		String str="sUBHASH dNYANOBA hOGALE";
		char c;
		String s ="";
		
		for(int i=0; i<str.length(); i++) {
			c=str.charAt(i);
			
			if(c>=65 && c<=90) {
				s+=(char)(c+32);
			}
			else if(c>=97 && c<=122) {
				s+=(char)(c-32);
			}
			else {
				s+=c;
			}
		}
		System.out.println(s);
	}
	public static void FirstChar() {
		String str="subhash dnyanoba hogale";
		String[] v = str.split(" ");
		
		for (String s : v) {
			
			char v1 = s.charAt(0);
			if(v1=='s'||v1=='d') {
				System.out.print(v1+" ");
			}
			else {
				System.out.println(s);
			}
		}		
	}
	public static void fabinnociSeries() {
		int a=0,b=0,i=0,k=1;
		while(i<10) {
			a=b;
			b=k;
			k=a+b;
			i++;
			System.out.println(a);
		}
	}
	public static void pushingZero() {
		int[] a= {1,0,2,0,3,0,4,5,6,7};
		int count=0;
		for(int i=0; i<a.length; i++) {
			
			if(a[i]!=0) {
				a[count]=a[i];
				count++;
			}
		}
		
		for(int i=count; i<a.length; i++) {
			a[i]=0;
		}
		
		for (int i : a) {
			System.out.println(i);
		}
	}
	public static void substring() {
		String str="subhash";
		for(int i=0; i<str.length(); i++) {
			
			for(int j=i+1; j<=str.length(); j++) {
				System.out.println(str.substring(i, j));
			}
		}
	}
	public static void perticularReverseString() {
		String str="subhash dnyanoba hogale";
		
		
		 String v1 = new StringBuffer(str.substring(8, 16)).reverse().toString();
		  String v = str.substring(0, 7);
		  String v2 = str.substring(17, 23);
		  
		  System.out.println(v+" "+v1+" "+v2);
		
	}
	public static void main(String[] args) {
//		duplicateChar();
//		keyValue() ;
//		duplicateString();
//		upperToLower();
//		FirstChar() ;
//		fabinnociSeries();
//		pushingZero();
//		substring();
		perticularReverseString();
		}

}
