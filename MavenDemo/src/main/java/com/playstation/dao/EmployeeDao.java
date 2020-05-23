package com.playstation.dao;

import com.playstation.web.model.*;
import java.sql.*;

public class EmployeeDao {

	public Employee GetEmployee(int empId) throws ClassNotFoundException {

		String url = "jdbc:mysql://localhost:3306/mydb?useSSL=false";
		String username = "root";
		String password = "Aloe@123";
		String preparedQuery = "select * from tblemployee where emp_id=?";

		Employee empInfo = new Employee();

		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement selStatment = con.prepareStatement(preparedQuery);
			selStatment.setString(1, (String.valueOf(empId)));
			System.out.println("result is" + selStatment);
			ResultSet result = selStatment.executeQuery();
			if (result.next()) {
				empInfo.setEmpId(result.getInt("emp_id"));
				empInfo.setAge(result.getInt("emp_age"));
				empInfo.setEmpName(result.getString("emp_name"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return empInfo;

	}

}
