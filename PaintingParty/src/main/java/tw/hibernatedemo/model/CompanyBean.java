package tw.hibernatedemo.model;

public class CompanyBean {
	
	// 屬性名稱跟 Table 欄位名稱可以不同
	
	private int companyId;
	
	private String companyName;
	

	public CompanyBean() {
	}
	
	public CompanyBean(int companyId, String companyName) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
	}


	public int getCompanyId() {
		return companyId;
	}


	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	

}
