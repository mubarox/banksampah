/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.banksampah.app.service;

import id.banksampah.app.core.config.ConnectionDatabase;
import id.banksampah.app.core.config.Service;
import id.banksampah.app.model.TrashList;
import java.sql.Array;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class TrashListService extends ConnectionDatabase{
    
    private boolean status;
    private String errorMessage;
    
    public List<TrashList> getAll() {

        List<TrashList> list = new ArrayList<>();
        try {
//            this.createConnection();
            PreparedStatement stmt = this.connection.prepareStatement("SELECT * FROM sampah"); //queery yang akan dieksekusi

            ResultSet result = stmt.executeQuery();
            
            while (result.next()) {
                TrashList trash = new TrashList();
                trash.setCode(result.getString("id_sampah"));
                trash.setType(result.getString("jenis"));
                trash.setPrice(result.getInt("harga"));

                list.add(trash);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.status = false;
            this.errorMessage = e.getMessage();
        }

        return list;
    }

   
}
