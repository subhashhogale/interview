package JavaProgram;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

public class parallel {
	
	
	@Test
	public  void tc1() {
		
		long millis = System.currentTimeMillis();

        Date date = new Date(millis);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String time = sdf.format(date);
		System.out.println("this is 1 test case"+ Thread.currentThread().getId()+ ":"+time);
	}
	@Test
	public  void tc2() {
		long millis = System.currentTimeMillis();

        Date date = new Date(millis);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String time = sdf.format(date);
		System.out.println("this is 2 test case"+ Thread.currentThread().getId()+":"+ time);
	}
	@Test
	public  void tc3() {
		long millis = System.currentTimeMillis();

        Date date = new Date(millis);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String time = sdf.format(date);
		System.out.println("this is 3 test case"+ Thread.currentThread().getId()+":"+ time);
	}
	@Test
	public  void tc4() {
		long millis = System.currentTimeMillis();

        Date date = new Date(millis);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String time = sdf.format(date);
		System.out.println("this is 4 test case"+ Thread.currentThread().getId()+":"+ time );
	}
	@Test
	public  void tc5() {
		long millis = System.currentTimeMillis();

        Date date = new Date(millis);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String time = sdf.format(date);
		System.out.println("this is 5 test case"+ Thread.currentThread().getId()+ ":"+time);
	}
	@Test
	public  void tc6() {
		long millis = System.currentTimeMillis();

        Date date = new Date(millis);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String time = sdf.format(date);
		System.out.println("this is 6 test case"+ Thread.currentThread().getId()+":"+ time);
	}@Test
	public  void tc7() {
		long millis = System.currentTimeMillis();

        Date date = new Date(millis);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String time = sdf.format(date);
		System.out.println("this is 7 test case"+ Thread.currentThread().getId()+":"+ time );
	}@Test
	public  void tc8() {
		long millis = System.currentTimeMillis();

        Date date = new Date(millis);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String time = sdf.format(date);
		System.out.println("this is 8 test case"+ Thread.currentThread().getId()+ ":"+time );
	}@Test
	public  void tc9() {
		long millis = System.currentTimeMillis();

        Date date = new Date(millis);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String time = sdf.format(date);
		System.out.println("this is 9 test case"+ Thread.currentThread().getId()+ ":"+time );
	}


}
