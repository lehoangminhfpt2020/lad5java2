package java2.lad5.baitap1;

import java.sql.*;
import java.util.Scanner;
import java.sql.DriverManager;

public class baitap1 {public static void main(String[] args)
{
    try (
            Connection conn  = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root", "");
            Statement stmt = conn.createStatement();
    )
    {

        String SQLdel = "delete from books where id>8000";
        System.out.println("the SQL statement is: " +SQLdel + "\n");
        int countDelete = stmt.executeUpdate(SQLdel);
        System.out.println(countDelete + "records deleted.\n");

        String SQLIn = "insert into books values "
                + "(8001, 'Java Core', 'Dang Kim Thi', 15.55, 55),"
                + "(8002, 'Java Advanced', 'James Gosling', 25.55, 55)";
        System.out.println("the SQL statement is: " + SQLIn + "\n");
        int countInserted = stmt.executeUpdate(SQLIn);
        System.out.println(countInserted + "records insert.\n");

        SQLIn = "insert into books(id,title,author) values(2001,'Java JDBC MySQL','ThiDK')";
        System.out.println("the SQL statement is: " + SQLIn + "\n");
        countInserted = stmt.executeUpdate(SQLIn);
        System.out.println(countInserted + "record inserted. \n");

        System.out.println("Enter bookID you want to delete: ");
        Scanner input = new Scanner(System.in);
        int id = input.nextInt();
        SQLdel = "delete from books where id ="+id;
        System.out.println("The SQL statement is " + SQLdel);
        countDelete = stmt.executeUpdate(SQLdel);
        System.out.println(countDelete + " row(s) effected");

        System.out.println(" Enter Book Id: ");
        id = input.nextInt();
        System.out.println("Enter Title: ");
        input.nextLine();
        String title = input.nextLine();
        System.out.println("Enter Author: ");
        String author = input.nextLine();
        System.out.println("Enter Price: ");
        double price = input.nextDouble();
        System.out.println("Enter qty: ");
        int qty = input.nextInt();
        SQLIn = "Insert into books values"+ "("+ id +","+ title +","+ author +","+ price +","+qty+")";
        System.out.println("The SQL statemnet is "+SQLIn);
        countInserted= stmt.executeUpdate(SQLIn);
        System.out.println(countInserted+" book added");

    }catch (SQLException ex){
        ex.printStackTrace();
    }
}
}
