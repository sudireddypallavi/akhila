package jdbc.services;

import java.sql.*;
import javax.sql.*;
import jdbc.dao.DBUtil;

public class Crudoperations {
	static Connection con;
	static PreparedStatement pst;
	
	static {
		con=DBUtil.getConnection();
		if(con!=null)
		{
			System.out.println("connection is success");
		}
	}
	
	//created the table now we have to add the values to table
	public static int addStudent(int sid,String sname)
	{
		int n=0;
		try {
			pst = con.prepareStatement("INSERT INTO student VALUES(?,?)");
			pst.setInt(1, sid);
			pst.setString(2, sname);
			pst.executeUpdate();
		}catch(Exception e)
		{
			
		}
		return n;
	}

    // UPDATE operation
    public static int updateStudent(int sid, String newName) {
        int n = 0;
        try {
            pst = con.prepareStatement("UPDATE student SET sname=? WHERE sid=?");
            pst.setString(1, newName);
            pst.setInt(2, sid);
            n = pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return n;
    }

    // DELETE operation 
    public static int deleteStudent(int sid) {
        int n = 0;
        try {
            pst = con.prepareStatement("DELETE FROM student WHERE sid=?");
            pst.setInt(1, sid);
            n = pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return n;
    }
	//Select operation
	public static int selectStudent(int sid) {
		int n=0;
		try {
			pst = con.prepareStatement("SELECT sid, sname FROM students WHERE sid = ?");
			pst.setInt(1, sid);
			
			pst.executeUpdate();
		}catch(Exception e) {
			
		}
		return n;
	}
}

    
	
