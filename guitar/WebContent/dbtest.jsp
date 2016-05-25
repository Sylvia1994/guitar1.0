<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
   
    %>
    <%@ page import="java.sql.*" %>
    <%@ page import="org.sqlite.JDBC" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

String b=null;
		Class.forName("org.sqlite.JDBC");
		Connection conn=DriverManager.getConnection("jdbc:sqlite://D:/test1.db");
		Statement stat= conn.createStatement();
		
	
		String sql="select * from tbl1 where salary='800'";
		ResultSet rs=stat.executeQuery(sql);
		
		while(rs.next()){
			
			b=rs.getString("name");
			 
		
		}
       out.println(b);
				
		







 %>
</body>
</html>