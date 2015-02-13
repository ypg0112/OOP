package com.personal.db.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


class CustomerDAOImpl implements CustomerDAO {

	private static final String GET_QUERY = "SELECT * FROM CUSTOMER WHERE ID=?";
	
	@Override
	public int createCustomer(CustomerDB customer) {
		return 0;
	}

	@Override
	public CustomerDB getCustomer(int customerId) {
		
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement stmt = null;
		CustomerDB.Builder cusBuilder = CustomerDB.builder();
		try {
			con = DatabaseUtils.getConnection();
			stmt = con.prepareStatement(GET_QUERY);
			stmt.setInt(1, customerId);

			rs = stmt.executeQuery();
	
			while(rs.next()){
			cusBuilder.withId(rs.getInt("ID"))
				.withFirstName(rs.getString("FIRST_NAME"))
				.withLastName(rs.getString("LAST_NAME"))
				.withEmail(rs.getString("EMAIL"))
				.withPhone(rs.getString("PHONE"));
			}
			
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if(stmt !=null ) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if(con !=null ) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return cusBuilder.build();
	}

	@Override
	public int deleteCustomer(int customerId) {
		return 0;
	}

	@Override
	public int updateCustomer(CustomerDB customer) {
		return 0;
	}

}
