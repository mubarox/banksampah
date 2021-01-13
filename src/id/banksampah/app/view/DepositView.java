/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.banksampah.app.view;

import java.util.List;
import id.banksampah.app.model.Customer;
import id.banksampah.app.service.TrashListService;
import id.banksampah.app.Deposit;
import id.banksampah.app.core.ImpCustomer;
import id.banksampah.app.model.TrashList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class DepositView extends JFrame implements ImpCustomer {

    private JLabel labelDaftar = new JLabel("Daftar Sampah");
    private JLabel labelJumlah = new JLabel("Jumlah dalam satuan KG: ");
    private JLabel labelJenis = new JLabel("Jenis: ");
    private JTextField textJumlah = new JTextField(20);
    private JTextField textJenis = new JTextField(20);
    private JButton setoran = new JButton("Setor");
    private JTable tabel1 = new JTable();
    private JScrollPane sp = new JScrollPane(tabel1);
    
    protected String jenis, harga;
    
    
    public DepositView() {
        super("Form Setor");
        testing();
        initView();
        
    }

    public void testing() {
        // tabel
        TrashListService TrashListService = new TrashListService();
        List<TrashList> trashList = TrashListService.getAll();;
        
        DefaultTableModel model = new DefaultTableModel();
        Object[] columns = new Object[3];
        columns[0] = "Id sampah";
        columns[1] = "jenis";
        columns[2] = "Harga";

        model.setColumnIdentifiers(columns);

        for (TrashList trash : trashList) {
            Object[] data = new Object[3];
            data[0] = trash.getCode();
            data[1] = trash.getType();
            data[2] = trash.getPrice();

            model.addRow(data);
        }
    }

    private void initView() {
        JPanel newPanel = new JPanel(new GridBagLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);

        constraints.gridx = 0;
        constraints.gridy = 0;
        newPanel.add(labelDaftar, constraints);

        
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.anchor = GridBagConstraints.CENTER;
        newPanel.add(sp, constraints);
        
        
        constraints.gridx = 0;
        constraints.gridy = 2;
        newPanel.add(labelJumlah, constraints);

        constraints.gridx = 1;
        newPanel.add(textJumlah, constraints);

        constraints.gridx = 0;
        constraints.gridy = 3;
        newPanel.add(labelJenis, constraints);

        constraints.gridx = 1;
        newPanel.add(textJenis, constraints);

        constraints.gridx = 0;
        constraints.gridy = 5;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        newPanel.add(setoran, constraints);

        newPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Setoran Nasabah"));

        add(newPanel);

        pack();
        setLocationRelativeTo(null);

    }

    private class calculator implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int a,b,c;
                a =Integer.parseInt(textJumlah.getText()) ;
                b =Integer.parseInt(textJenis.getText());
                c = a*b;
            } catch (Exception e) {
            }
        }
    }

    @Override
    public boolean Payment() {
        return false;

    }

}
