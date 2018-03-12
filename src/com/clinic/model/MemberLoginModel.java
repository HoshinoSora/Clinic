package com.clinic.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.clinic.model.entities.MemberEntity;
import com.clinic.model.entities.MemberEntity.Role;

public class MemberLoginModel {

	private Connection gettingConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/clinicDB?user=root&password=admin");
		return conn;
	}

	public MemberEntity find(String loginName, String loginPass) {
		String sql = "select * from member where name=? and password=?";
		try {
			Connection conn = gettingConnection();
			PreparedStatement pStatement = conn.prepareStatement(sql);
			pStatement.setString(1, loginName);
			pStatement.setString(2, loginPass);
			ResultSet rSet = pStatement.executeQuery();

			while (rSet.next()) {
				return getMember(rSet);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	private MemberEntity getMember(ResultSet rSet) throws SQLException {
		MemberEntity member = new MemberEntity();
		member.setId(rSet.getString("memberId"));
		member.setName(rSet.getString("memberName"));
		member.setIdentityCard(rSet.getString("idCard"));
		member.setRole(Role.valueOf(rSet.getString("role")));
		member.setGender(rSet.getString("gender"));
		member.setDateOfBirth(rSet.getString("dateOfBirth"));
		member.setAddress(rSet.getString("memberAddress"));
		member.setPhoneNumber(rSet.getString("memberPhone"));
		member.setEmail(rSet.getString("memberEmail"));
		member.setPassword(rSet.getString("password"));

		return member;
	}

}
