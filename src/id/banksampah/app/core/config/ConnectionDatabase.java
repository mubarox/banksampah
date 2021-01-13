/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.banksampah.app.core.config;

/**
 *
 * @author user
 */
import id.banksampah.app.core.config.ConfigurationDatabase;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class ConnectionDatabase extends ConfigurationDatabase {
 
   static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; //membuat koneksi
    //static final String DB_URL = "jdbc:mysql://localhost/banksampah";

    static Connection conn; // deklarasi koneksi
    static Statement stmt; // eksekusi query
    static ResultSet rs; // menampilkan hasil query

    public Connection connection; // deklarasi koneksi

    public Connection getConnection() {
        return connection;
    }

    public boolean status = false; // mengecek apakah koneksi suskses
    public String errorMessage = null; // isi dari pesan eror

    public ConnectionDatabase() {
        this.createConnection(); // fungsi untuk membuat koneksi
    }

    public Connection createConnection() {
        try {
            // register driver yang akan dipakai 
            Class.forName(JDBC_DRIVER); //memanggil driver
            this.connection = DriverManager.getConnection(this.getJdbcDatabaseUrl()); //memanggil fungsi jdbcdatabaseurl pada class configdatabase
            this.status = true;
        } catch (Exception e) { //pesan error saat driver tidak berhasil diapnggil
            this.status = false;
            this.errorMessage = e.getMessage();
            System.out.println(e);
        }
        return this.connection;
    }

    public void close() { // fungsi untuk menutup koneksi dengan database server
        try {
            this.connection.close();
        } catch (Exception e) { // pesan error saat penutupan koneksi gagal
            System.out.println(e.getMessage());
        }
    }
}
