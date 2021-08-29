package tw.teamUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Util01 {

	public static void main(String[] args) {
//		測試區
	}
	
	
	public String fileNameUtil( String originalFileName ) { 
		//把檔名給加上日期，例如aaa.jpg => 1202008200912aaa.jpg
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
    	String nowTimeing = formatter.format( LocalDateTime.now() ).toString();
    	String export = nowTimeing + originalFileName;
    	
		return export;
	}
	
	
	public void insertImgInfoToDB (  String product_name , String product_path , String painter_message ) { 
		//當客戶端上傳檔案，伺服端把檔案讀進伺服端硬碟時，同步把圖片的存放位置寫到資料庫
		//因為HIBERNATE的HQL語句無法實現INSERT，所以這邊我們還是用JDBC去做
		//***這邊記得要循一下，看有哪些要改，訂單ID還沒有寫進來，應該要在外部自動，然後引進來
		
		String url = "jdbc:sqlserver://localhost:1433;databaseName=paintingparty";
		
		String user = "sa";
		String password = "as";
		
		String sql = "insert into product (product_name , product_path , painter_message) values (?,?,?) ";
		
		try(Connection conn = DriverManager.getConnection(url, user, password);) {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, product_name );
			pstmt.setString(2, product_path );
			pstmt.setString(3, painter_message );
			pstmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
