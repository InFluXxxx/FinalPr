package com.example.finalpr.MYSQL;

import com.example.finalpr.Availabilities.Estate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import static com.example.finalpr.HelloApplication.documentRegistrationSystem;

public class BankCards {

    static public boolean insertBankCard(String cardNumber, LocalDate expirationDate, String CVV2, String ownerID, String accountNumber){

        String sqlCMD = String.format("INSERT INTO bankcards (cardNumber, CVV2, ownerID, accountNumber, expirationDate) VALUES ('%s', '%s', '%s', '%s', '"+expirationDate+"')",cardNumber, CVV2, ownerID, accountNumber);
        return MySQL.executeSQL(sqlCMD);

    }

    static public boolean updateBankCard(String cardNumber, LocalDate expirationDate, String CVV2, String ownerID, String accountNumber){

        String sqlCMD = String.format("UPDATE bankcards SET ownerID='%s', cardNumber='%s', CVV2='%s', expirationDate='"+expirationDate+"' WHERE accountNumber='%s'",ownerID,cardNumber,CVV2,accountNumber);
        return MySQL.executeSQL(sqlCMD);
    }

}
