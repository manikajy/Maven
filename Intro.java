import org.testng.annotations.*;

public class Intro {

	@BeforeTest
	public void setUp (){
	    System.out.println("Before Main Test");	
	}
	
	@Test (dataProvider = "dataReader1")
	public void mainTest1(String vName, String vEmail, String vPswd){
		System.out.println("Login");
		System.out.println("Name " + vName);
		System.out.println("vEmail " + vEmail);
		System.out.println("vPswd " + vPswd);
	}
	
	@Test (dataProvider = "dataReader2")
	public void mainTest2(String vName, String vEmail){
		System.out.println("Account Update");
		System.out.println("Name " + vName);
		System.out.println("vEmail " + vEmail);
	}
	
	@Test (dataProvider = "dataReader3")
	public void mainTest3(String vAmount, String vName){
		System.out.println("Money Transfer");	
		System.out.println("Name " + vAmount);
		System.out.println("Name " + vName);
		
	}
	
	//CAN RUN TESTS AGAINST SPECIFIC DATA
	@DataProvider 
	public Object [][] dataReader1(){
		Object[][] myData = new Object [2][3];
		myData [0][0] = "MANIKA";
		myData [0][1] = "drmanikajy@gmail.com";
		myData [0][2] = "PASSWORD1";
		
		myData [1][0] = "MANIKA YADAV";
		myData [1][1] = "drmanikajy@gmail.com";
		myData [1][2] = "PASSWORD2";
		
		return myData;
     }
	@DataProvider
	public Object [][] dataReader2(){
		Object[][] myData = new Object [2][2];
		myData [0][0] = "MANIKAJEET";
		myData [0][1] = "MANIKAJEET@GMAIL.COM";
		
		myData [1][0] = "GAGANJEET";
		myData [1][1] = "MANIKAJEET@GMAIL.COM";
		
		return myData;
     }
	@DataProvider
	public Object [][] dataReader3(){
		Object[][] myData = new Object [2][2];
		myData [0][0] = "$5000";
		myData [0][1] = "GAGAN";
		
		myData [1][0] = "$10,000";
		myData [1][1] = "MANIKA";
		
		return myData;
     }
	
	
	@AfterTest
	public void atEnd (){
		System.out.println("After Main Test");
		
	}
	
	public void mainTest4(){
		System.out.println("At Main Test4");	
	}
}
