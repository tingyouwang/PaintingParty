package tw.hibernatedemo.service;

import java.util.List;

import org.hibernate.Session;

import tw.hibernatedemo.model.CompanyBean;
import tw.hibernatedemo.model.CompanyDAO;

public class CompanyService implements CompanyServiceInterface {

	private CompanyDAO comDAO;

	public CompanyService(Session session) {
		this.comDAO = new CompanyDAO(session);
	}

	@Override
	public CompanyBean select(int comId) {
		CompanyBean comBean = comDAO.select(comId);
		return comBean;
	}

	@Override
	public List<CompanyBean> selectAll() {
		List<CompanyBean> theComs = comDAO.selectAll();
		return theComs;
	}

	@Override
	public CompanyBean insert(CompanyBean comBean) {
		CompanyBean oneCompany = comDAO.insert(comBean);
		return oneCompany;
	}

	@Override
	public CompanyBean updateOne(int comId, String comName) {
		CompanyBean oneCom = comDAO.updateOne(comId, comName);
		return oneCom;
	}

	@Override
	public boolean delete(int comId) {
		boolean boo = comDAO.deleteOne(comId);
		return boo;
	}

}
