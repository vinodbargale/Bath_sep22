package WebdriverExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DB {
	public static void main(String[] args) throws Exception {
		
	String dburl="jdbc:oracle:thin:@localhost:1521:xe"	;
	String dbur="system";
	String dbpw="8412043143";
	
	
	
	Connection conn =DriverManager.getConnection(dburl,dbur,dbpw);
	Statement st=conn.createStatement();
	ResultSet rs=st.executeQuery("Select * from log" );
		
		while(rs.next()){
			String un=rs.getString(1);
			String pw=rs.getString(2);
			System.out.println(un);
			System.out.println(pw);
			
			System.setProperty("webdriver.chrome.driver","F:\\ChromeDriver\\chromedriver.exe" );
			WebDriver driver=new ChromeDriver();
			driver.navigate().to("http://183.82.103.245/nareshit/login.php");
			
			
			
			
			
			
		}
		
		
		
	}
	

}
