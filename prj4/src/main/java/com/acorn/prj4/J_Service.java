package com.acorn.prj4;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class J_Service {
	@Autowired
	J_DAO dao;

	public ArrayList<J_Store> select() {

		ArrayList<J_Store> list = dao.select();
		return list;

	}

	public void insert(J_Store store) {

		try {
			dao.insert(store);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void delete(String store) {

		try {
			dao.delete(store);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public J_Store updataselect(String s) {

		J_Store list = dao.updataselect(s);
		return list;

	}

	public void updata(J_Store s) {

		dao.updata(s);

	}

}
