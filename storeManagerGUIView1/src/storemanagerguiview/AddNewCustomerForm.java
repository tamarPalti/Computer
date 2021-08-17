/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storemanagerguiview;

import controller.Backend_DAO_List;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.PasswordField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import model.Customer;

/**
 *
 * @author student
 */
public class AddNewCustomerForm extends JFrame {

    private JLabel jLabelID;
    private JLabel jLabelName;
    private JLabel jLabelAddress;
    private JTextField jTextFieldID;
    private JTextField jTextFieldName;
    private JTextField jTextFieldAddress;
    private JButton jButtonOK;
    private JButton jButtonClear;

    public void clear() {
        jTextFieldID.setText("");
        jTextFieldName.setText("");
        jTextFieldAddress.setText("");
    }

    public void ok() {

        try {
            String s = jTextFieldID.getText();
            String s1 = jTextFieldName.getText();
            String s2 = jTextFieldAddress.getText();
            if (s.length()==0 || s1.length()==0 | s2.length()==0) {
                throw new Exception("חובה להכניס את כל הפרטים");
            }
            if (s.length() != 9) {
                throw new Exception("תז חייבת להכיל תשע ספרות");
            }
            Customer c = new Customer(Long.parseLong(jTextFieldID.getText()), jTextFieldName.getText(), jTextFieldAddress.getText());
            Backend_DAO_List.get_bdl_singelton().AddCustomer(c);
            JOptionPane.showMessageDialog(AddNewCustomerForm.this,"הלקוח נוסף בהצלחה","הודעה", JOptionPane.HEIGHT);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(AddNewCustomerForm.this, ex.getMessage(),"שגיאה", JOptionPane.HEIGHT);
        }
    }

    public AddNewCustomerForm() {
        jButtonOK = new JButton("OK");
        jButtonOK.addActionListener((e) -> ok());
        jButtonClear = new JButton("clear");
        jButtonClear.addActionListener((e) -> clear());
        jLabelID = new JLabel("ID:");
        jTextFieldID = new JPasswordField();
        jTextFieldID.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if(e.getKeyChar()>'9'||e.getKeyChar()<'0')
                   e.consume();
            }
        });
        jLabelID.setForeground(new java.awt.Color(255, 102, 255));
        jLabelID.setFont(new Font("Californian FB", 3, 24));
        jTextFieldID.setFont(new Font("Californian FB", 3, 24));
        jLabelName = new JLabel("Name:");
        jTextFieldName = new JTextField();
        jLabelName.setForeground(new java.awt.Color(255, 102, 255));
        jLabelName.setFont(new Font("Californian FB", 3, 24));
        jTextFieldName.setFont(new Font("Californian FB", 3, 24));
        jLabelAddress = new JLabel("Address:");
        jTextFieldAddress = new JTextField();
        jLabelAddress.setForeground(new java.awt.Color(255, 102, 255));
        jLabelAddress.setFont(new Font("Californian FB", 3, 24));
        jTextFieldAddress.setFont(new Font("Californian FB", 3, 24));
        this.add(jLabelID);
        this.add(jTextFieldID);
        this.add(jLabelName);
        this.add(jTextFieldName);
        this.add(jLabelAddress);
        this.add(jTextFieldAddress);
        this.add(jButtonOK);
        this.add(jButtonClear);
        //  this.setPreferredSize(new Dimension(400, 200));
        getContentPane().setLayout(new GridLayout(4, 2, 300, 70));
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.pack();
    }

}
