package com.acorn.prj4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class J_DAO {
	@Autowired
	DataSource ds;

	public ArrayList<J_Store> select() {
		String sql = "select * from store_tbl";
		ArrayList<J_Store> list = new ArrayList<>();
		try {
			Connection con = ds.getConnection();
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				String storename = rs.getString(1);
				String address = rs.getString(2);
				String name = rs.getString(3);
				String tel = rs.getString(4);
				String bnum = rs.getString(5);

				J_Store s = new J_Store(storename, address, name, tel, bnum);
				list.add(s);
			}
			//
			rs.close();
			pst.close();
			con.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;

	}

	public void insert(J_Store store) throws SQLException {

		String sql = "insert into STORE_TBL values(?, ?, ?, ?, ?)";

		try {
			Connection con = ds.getConnection();
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, store.getStorename());
			pst.setString(2, store.getAddress());
			pst.setString(3, store.getName());
			pst.setString(4, store.getTel());
			pst.setString(5, store.getBnum());

			pst.executeUpdate();

		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();

			throw e;
		}

	}
	public void delete(J_Store store) throws SQLException {

		String sql = "DELETE FROM store_tbl  WHERE storename = ?";

		try {
			Connection con = ds.getConnection();
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, store.getStorename());

			pst.executeUpdate();

		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();

			throw e;
		}

	}
}
