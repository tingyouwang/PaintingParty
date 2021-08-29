package tw.teamUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Util01 {

	public static void main(String[] args) {
//		���հ�
	}
	
	
	public String fileNameUtil( String originalFileName ) { 
		//���ɦW���[�W����A�Ҧpaaa.jpg => 1202008200912aaa.jpg
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
    	String nowTimeing = formatter.format( LocalDateTime.now() ).toString();
    	String export = nowTimeing + originalFileName;
    	
		return export;
	}
	
	
	public void insertImgInfoToDB (  String product_name , String product_path , String painter_message ) { 
		//��Ȥ�ݤW���ɮסA���A�ݧ��ɮ�Ū�i���A�ݵw�ЮɡA�P�B��Ϥ����s���m�g���Ʈw
		//�]��HIBERNATE��HQL�y�y�L�k��{INSERT�A�ҥH�o��ڭ��٬O��JDBC�h��
		//***�o��O�o�n�`�@�U�A�ݦ����ǭn��A�q��ID�٨S���g�i�ӡA���ӭn�b�~���۰ʡA�M��޶i��
		
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
