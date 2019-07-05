package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Dept;
import entity.User;
import uilt.JDBCuilt;

public class Dao {
	
	//查询所有部门
	public static List<Dept> selectAll(){
		Connection conn = JDBCuilt.getConn();
		String sql = "select * from tb_dept";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if(rs != null) {
				List<Dept> depts = new ArrayList<Dept>();
				while(rs.next()) {
					int id = rs.getInt("id");
					String Name = rs.getString("deptName");
					String Remake = rs.getString("deptRemake");
					String price = rs.getString("price");
					Dept dept = new Dept(id,Name,Remake,price);
					depts.add(dept);
					
				}
				return depts;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCuilt.CloseConn(conn);
		}
		
		return null;
		
	}
	
	
	public static Dept selectid(int id) {
		Connection conn = JDBCuilt.getConn();
		String sql = "select * from tb_dept where id=?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps = conn.prepareStatement(sql);
			ps.setInt(1,id);
			
			ResultSet rs = ps.executeQuery();
			if(rs!=null && rs.next()) {
				String deptName = rs.getString("deptName");
				String deptRemake = rs.getString("deptRemake");
				String price = rs.getString("price");
				Dept dept = new Dept(id,deptName,deptRemake,price);
				return dept;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCuilt.CloseConn(conn);
		}
		return null;
		
	}
	
	//添加部门
	public static void addDept(Dept dept) {
		Connection conn = JDBCuilt.getConn();
		String sql="insert into tb_dept(deptName,deptRemake,price) values(?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, dept.getDeptName());
			ps.setString(2, dept.getDeptRemake());
			ps.setString(3, dept.getPrice());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCuilt.CloseConn(conn);
		}
	}
	
	//删除部门
	public static void delDept(int id) {
		Connection conn = JDBCuilt.getConn();
		String sql = "delete from tb_dept where id=?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCuilt.CloseConn(conn);
		}
		
	}
	//修改部门
	public static void updateDept(int id,String deptName,String deptRemake,String price) {
		Connection conn = JDBCuilt.getConn();
		String sql = "update tb_dept set deptName=?,deptRemake=?,price=? where id=?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, deptName);
			ps.setString(2, deptRemake);
			ps.setString(3, price);
			ps.setInt(4, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCuilt.CloseConn(conn);
		}
	}
	
	//添加用户--注册
	public static void addUser(User user) {
		Connection conn = JDBCuilt.getConn();
		String sql = "insert into tb_use(username,password,email,tel) values(?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps = conn.prepareStatement(sql);
			ps.setString(1,user.getUsername());
			ps.setString(2, user.getPassword());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getTel());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			JDBCuilt.CloseConn(conn);
		}
		
	}
	
	//查询用户-登录
	public static User selectByName(String username) {
		Connection conn = JDBCuilt.getConn();
		String sql = "select * from tb_use where username=?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			
			ResultSet rs = ps.executeQuery();
			if(rs!=null && rs.next()) {
				String password = rs.getString("password");
				String email = rs.getString("email");
				String tel = rs.getString("tel");
				User user = new User(username,password,email,tel);
				return user;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCuilt.CloseConn(conn);
		}
		return null;
		
	}
	
	
	
}
