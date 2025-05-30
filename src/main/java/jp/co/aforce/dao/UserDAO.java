package jp.co.aforce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jp.co.aforce.beans.Users;

public class UserDAO extends DAO {
	public String getName(String member_id, String password) throws Exception {
		String fullName = null;

		Connection con = getConnection();

		PreparedStatement st;
		st = con.prepareStatement(
				"select last_name , first_name from users where member_id = ? and password = ?");

		st.setString(1, member_id);
		st.setString(2, password);

		ResultSet rs = st.executeQuery();

		if (rs.next()) {
			
			String last_name = rs.getString("last_name");
			String first_name = rs.getString("first_name");
			fullName = last_name + first_name;

		}

		st.close();
		con.close();

		return fullName;

	}

	public void insert(Users users) throws Exception {
		Connection con = getConnection();

		PreparedStatement st;
		st = con.prepareStatement(
				"insert into users values(?,?,?,?,?,?)");

		st.setString(1, users.getMember_id());
		st.setString(2, users.getPassword());
		st.setString(3, users.getLast_name());
		st.setString(4, users.getFirst_name());
		st.setString(5, users.getAddress());
		st.setString(6, users.getMail_address());

		st.executeUpdate();

	}
}
