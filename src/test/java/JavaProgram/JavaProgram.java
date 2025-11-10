package JavaProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JavaProgram {

	

	public static void StringRev() {
		
		String str="subhash dnyanoba hogale";
		
		String rev="";
		
		for(int i=str.length()-1; i>=0; i--) {
			
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}
	
	public static void onlyMidleStringrev() {
		String str="subhash dnyanoba hogale";
		
		String s = str.substring(0,7);
		String s1=new StringBuffer(str.substring(8,16)).reverse().toString();
		String s2=str.substring(17,23);
		System.out.println(s+" "+s1+" "+s2);
	}
	
	public static void Stringpattern() {
		
		String str="subhash";
		
		for(int i=1; i<=str.length(); i++) {
			System.out.println(str.substring(0,i));
		}
	}
	public static void Stringpattern1() {
		
		
		for(int i=1; i<=4; i++) 
		{
			System.out.print(1);
			
			for(int j=2; j<=i; j++) {
				
				for(int k=1; k<=j; k++) {
				System.out.print(j);
				}
			}
			System.out.println();
		}
		}
	
	public static void KeyValue() {
		String str="Name=Subhash|email=subhashhogale5@gmail.com|phone=123456";
		
		String[] str1 = str.split("\\|");
		for (String s : str1) {
			
			String[] str2 = s.split("=");
			if(str2.length==2) {
				String keys = str2[0];
				String value = str2[1];
				
				System.out.println("Kye= "+keys +" And "+" Value="+value);
			}
		}
	}
	public static void DuplicateString() {
		String str="subhash,subhash,dnyanoba,hogale";
		String[] str1 = str.split(" ");
		
		Map<String,Integer>map=new HashMap<>();
		
		for (String s : str1) {
			Integer oldval = map.get(s);
			if(oldval==null) {
				oldval=0;
			}
			map.put(s, oldval+1);
		}
		
		Set<String> uni = map.keySet();
		
		for (String s2 : uni) {
			if(map.get(s2)>1) {
				System.out.println(s2+":"+map.get(s2));
			}
		}
	}
	public static void onlyfirst() {
		String str="subhash dnyanoba hogale";
		
		String[] v = str.split(" ");
		
		for (String s : v) {
			
			char c = s.charAt(0);
			
			if(c=='s' || c=='d') {
				System.out.print(c+" ");
			}
			else {
				System.out.println(s);
			}
		}
	}
	
public static void main(String[] args) {
//	StringRev();
//	onlyMidleStringrev();
//	Stringpattern();
	Stringpattern1();
//	KeyValue();
//	DuplicateString() ;
//	onlyfirst() ;
	}
}
