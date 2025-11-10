package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
	
		String str="subhash dnyanoba hogale snagavi jevari ";
		
		String[] v = str.split(" ");
		
		int[]  index= {1,3,5};
		
		for(int i=0; i<v.length; i++) {
			
			for (int ind : index) {
				
				if(i+1==ind) {
					v[i]=new StringBuffer(v[i]).reverse().toString();
					break;
				}
			}
		}
		
		String result = String.join(" ", v);
		
        System.out.println(result);
		
	}

}
