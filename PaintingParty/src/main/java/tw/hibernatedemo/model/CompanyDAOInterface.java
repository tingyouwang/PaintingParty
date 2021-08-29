package tw.hibernatedemo.model;

import java.util.List;

public interface CompanyDAOInterface {
	public CompanyBean insert(CompanyBean comBean);
	public CompanyBean select(int comId);
	public List<CompanyBean> selectAll();
	public CompanyBean updateOne(int comId, String comName);
	public boolean deleteOne(int comId);
}
