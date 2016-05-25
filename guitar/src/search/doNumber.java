package search;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;


import org.apache.jasper.tagplugins.jstl.core.Out;
import org.sqlite.JDBC;

/**
 * Servlet implementation class doNumber
 */
@WebServlet("/doNumber")
public class doNumber extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public doNumber() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");

		String serialNumber=request.getParameter("number");
		String a =null;
		String b=null;
		String c =null;
		String d=null;
		String e=null;
		String f=null;
				try {
					Class.forName("org.sqlite.JDBC");
					
				    }
				catch (ClassNotFoundException e1)
				       {
					// TODO Auto-generated catch block
					e1.printStackTrace();
						
				       } 
				
				Connection conn;
				try {
					conn = DriverManager.getConnection("jdbc:sqlite://D:/test1.db");
					Statement stat= conn.createStatement();
					String sql="select * from tbl2 where serialNumber='"+serialNumber+"'";
					ResultSet rs;
					rs= stat.executeQuery(sql);
					while(rs.next()){
						a=rs.getString("price");
						b=rs.getString("builder");
						c=rs.getString("model");
						d=rs.getString("type");
						e=rs.getString("backwood");
						f=rs.getString("topwood");
				                    }
				}
					catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					}
	     System.out.println("<html>");
		       
		       PrintWriter out = response.getWriter();
		       out.println(a);
		       out.println(b);
		       out.println(c);
		       out.println(d);
		       out.println(e);
		       out.println(f);
		       
	}
}
	

