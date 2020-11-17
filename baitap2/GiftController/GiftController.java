package java2.lad5.baitap2.GiftController;

import com.mysql.cj.protocol.Resultset;
import java2.lad5.baitap2.GiftModel.Gift;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GiftController {
    private static final String URL = "jdbc:mysql://localhost:3306/giftshop";
    private static final String User = "root";
    private static final String Pass = "";
    List<Gift> gifts = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public void selectGift() {
        try (
                Connection conn = DriverManager.getConnection(URL, User, Pass);
                Statement stmt = conn.createStatement();
        ) {
            System.out.println("\n\t\tVIEW ALL GIFT\n");
            System.out.println("---------------------------------------");
            String sqlSelect = "SELECT * FROM gift";
            ResultSet rset = stmt.executeQuery(sqlSelect);
            ResultSetMetaData rsMd = rset.getMetaData();

            int col = rsMd.getColumnCount();

            for (int i = 1; i <= col; i++) {
                System.out.printf("%-20s", rsMd.getColumnName(i));
            }
            System.out.println();
            while (rset.next()) {
                for (int i = 1; i <= col; ++i) {
                    System.out.printf("%-20s", rset.getString(i));
                }
                System.out.println();
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
    public void insertGift() {
        try (
                Connection conn = DriverManager.getConnection(URL, User, Pass);
                Statement stmt = conn.createStatement();
        ) {
            System.out.println("\n ADD A NEW GIFT \n");
            System.out.println("Enter Gift ID: ");
            int id = input.nextInt();
            input.nextLine();
            System.out.println("Enter Gift Name: ");
            String name = input.nextLine();
            System.out.println("Enter Price: ");
            float price = input.nextFloat();
            System.out.println("How many you have: ");
            int qty = input.nextInt();
            String in = "insert into gift values( " + id + "," + name + "," + price + "," + qty +")";
            stmt.executeUpdate(in);


        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
    public void deleteGift() {
        try (
                Connection conn = DriverManager.getConnection(URL, User, Pass);
                Statement stmt = conn.createStatement();
        ){
            System.out.println("\nDELETE GIFT\n");
            System.out.println("Enter Gift ID: ");
            int id = input.nextInt();
            String sqlDelete = "DELETE FROM gift WHERE gift.GID ="+id;
            stmt.executeUpdate(sqlDelete);
            System.out.println("Gift deleted.");
        }
        catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
