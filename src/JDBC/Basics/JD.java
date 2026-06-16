package JDBC.Basics;

import java.sql.*;

public class JD {
    private static final String url="jdbc:mysql://localhost:3306/SMS2";
    private static final String user="root";
    private static final String password="A1s2h3a4@";

    public static void main(String[] args)throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection(url,user,password);
        Statement st=con.createStatement();
        //selecting or retriving values//
       /* String query="select * from Students";
       ResultSet rs= st.executeQuery(query);
       while(rs.next()){
           int id=rs.getInt("id");
           String name=rs.getString("name");
           String email=rs.getString("email");
           int marks=rs.getInt("marks");


           System.out.println(id);
           System.out.println(name);
           System.out.println(email);
           System.out.println(marks);
       }*/
        //inserting values//
        String query=String.format("insert into Students(id,name,email,marks) values(%d,'%s','%s',%d)",2,"asha","r",98);
        int myRes =st.executeUpdate(query);
        if(myRes>0){
            System.out.println("success");
        }
        else{
            System.out.println("fail");
        }


    }
}
