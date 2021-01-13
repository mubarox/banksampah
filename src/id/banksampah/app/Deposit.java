/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.banksampah.app;
import id.banksampah.app.model.Customer;
import id.banksampah.app.model.TrashList;
import id.banksampah.app.service.TrashListService;
import id.banksampah.app.view.DepositView;
import java.util.List;
import java.util.Scanner;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author user
 */
public class Deposit {
     public static void main(String[] args) {
        // TODO code application logic here

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        SwingUtilities.invokeLater(new Runnable() { //untuk menjalankan kode dan  memungkinkan Anda memodifikasi GUI dari utas lain.
            @Override
            public void run() {
                new DepositView().setVisible(true);
            }
        });
     }

}