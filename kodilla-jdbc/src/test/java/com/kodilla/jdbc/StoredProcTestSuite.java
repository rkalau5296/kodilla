package com.kodilla.jdbc;

import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static org.junit.Assert.assertEquals;

public class StoredProcTestSuite {
    @Test
    public void testUpdateVipLevels() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE READERS SET VIP_LEVEL=\"Not set\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);

        //When
        String sqlProcedureCall = "CALL UpdateVipLevels()";
        statement.execute(sqlProcedureCall);

        //Then
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM READERS WHERE VIP_LEVEL=\"Not set\"";
        ResultSet rs = statement.executeQuery(sqlCheckTable);
        int howMany = -1;
        if(rs.next()) {
            howMany = rs.getInt("HOW_MANY");
        }
        assertEquals(0, howMany);
    }

    @Test
    public void testUpdateBestsellersFalse()throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE BOOKS SET BESTSELLER =null";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);

        //When
        String sqlProcedureCall = "CALL UpdateBestsellers()";
        statement.execute(sqlProcedureCall);

        //Then
        String sqlCheckTableFalse = "SELECT COUNT(*) AS HOW_MANY FROM BOOKS WHERE BESTSELLER=false";
        ResultSet rs = statement.executeQuery(sqlCheckTableFalse);
        int howManyFalse = -1;
        if(rs.next()) {
            howManyFalse = rs.getInt("HOW_MANY");
        }
        assertEquals(4, howManyFalse);

    }
    @Test
    public void testUpdateBestsellersTrue() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE BOOKS SET BESTSELLER =null";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);

        //When
        String sqlProcedureCall = "CALL UpdateBestsellers()";
        statement.execute(sqlProcedureCall);
        String sqlCheckTableTrue = "SELECT COUNT(*) AS HOW_MANY FROM BOOKS WHERE BESTSELLER=true";
        ResultSet rs = statement.executeQuery(sqlCheckTableTrue);
        int howManyTrue = -1;
        if(rs.next()) {
            howManyTrue = rs.getInt("HOW_MANY");
        }
        assertEquals(1, howManyTrue);
    }
}
