abstract  class BankAccount{
   abstract void deposit();
   abstract void withdrawal();
}
class Sounte {

}
public class Exam {
    public static void main(String[] args) {
        System.out.println("hi");
    }
}


dbconfig.jsp
<%@ page import="java.sql.*" %>
<%
    String dbURL = "jdbc:mysql://localhost:3306/StudentDB";
    String dbUser = "root"; // change if needed
    String dbPass = "password"; // change if needed
    Connection conn = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");  
        conn = DriverManager.getConnection(dbURL, dbUser, dbPass);
    } catch (Exception e) {
        out.println("Database connection error: " + e.getMessage());
    }
%>

addStudent.jsp
jsp
Copy
Edit
<%@ include file="dbconfig.jsp" %>
<%
    String name = request.getParameter("name");
    String email = request.getParameter("email");
    String course = request.getParameter("course");

    try {
        String sql = "INSERT INTO students (name, email, course) VALUES (?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, name);
        stmt.setString(2, email);
        stmt.setString(3, course);
        stmt.executeUpdate();
        response.sendRedirect("viewStudents.jsp");
    } catch (Exception e) {
        out.println("Error adding student: " + e.getMessage());
    }
%>
🧾 View Students – viewStudents.jsp
jsp
Copy
Edit
<%@ page import="java.sql.*" %>
<%@ include file="dbconfig.jsp" %>
<html>
<head><title>View Students</title></head>
<body>
    <h2>Student List</h2>
    <table border="1">
        <tr>
            <th>ID</th><th>Name</th><th>Email</th><th>Course</th><th>Action</th>
        </tr>
<%
    try {
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM students");

        while (rs.next()) {
%>
        <tr>
            <td><%= rs.getInt("id") %></td>
            <td><%= rs.getString("name") %></td>
            <td><%= rs.getString("email") %></td>
            <td><%= rs.getString("course") %></td>
            <td><a href="deleteStudent.jsp?id=<%= rs.getInt("id") %>">Delete</a></td>
        </tr>
<%
        }
    } catch (Exception e) {
        out.println("Error fetching students: " + e.getMessage());
    }
%>
    </table>
    <br>
    <a href="addForm.jsp">Add New Student</a>
</body>
</html>
🗑 Delete Student – deleteStudent.jsp
jsp
Copy
Edit
<%@ include file="dbconfig.jsp" %>
<%
    String id = request.getParameter("id");
    try {
        String sql = "DELETE FROM students WHERE id=?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, Integer.parseInt(id));
        stmt.executeUpdate();
        response.sendRedirect("viewStudents.jsp");
    } catch (Exception e) {
        out.println("Error deleting student: " + e.getMessage());
    }
%>
🧾 Add Student Form – addForm.jsp
jsp
Copy
Edit
<html>
<head><title>Add Student</title></head>
<body>
    <h2>Add Student</h2>
    <form action="addStudent.jsp" method="post">
        Name: <input type="text" name="name" required><br><br>
        Email: <input type="email" name="email" required><br><br>
        Course: <input type="text" name="course" required><br><br>
        <input type="submit" value="Add Student">
    </form>
    <br>
    <a href="viewStudents.jsp">View Students</a>
</body>
</html>
