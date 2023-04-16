
import java.awt.Taskbar.State;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Console;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.awt.Font;


import javax.swing.*;
public class atm4 extends JFrame implements ActionListener
{
   
    JFrame frame4;
    JButton btn,but1;
   static JLabel label1;
  public  static int am;


    atm4()
    {
        Font f=new Font(Font.MONOSPACED,Font.BOLD,30);
     label1=new JLabel();
     btn=new JButton();
     but1=new JButton();
     this.setTitle(".                                                         BALANCE CHECKING PAGE ");
      frame4=new JFrame();
      label1.setText("Check Your Bank Balance="+am);
      label1.setBounds(50,50,500,100);
      label1.setFont(f);
      this.add(label1);

//     button 1
        btn.setText("check Balance");
        btn.setBounds(229,300,139,50);
        this.add(btn);
        btn.addActionListener(this);


// button 2

but1.setText("<= Back");
but1.setBounds(229,550,130,50);
this.add(but1);
but1.addActionListener(this);




      this.setLayout(null);
      this.setBounds(0,0,600,700);
      this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btn) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/java", "root", ""
                );
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("select * from mysql2 where id=1;");
               while(resultSet.next())
               {
                   label1.setText((Integer.toString(resultSet.getInt(1)))+"₹ Your Balance");
                   label1.setBounds(99,70,599,50);
                   JOptionPane.showConfirmDialog(frame4,"Your Balance is correct","Confromation",JOptionPane.YES_NO_CANCEL_OPTION);


               }

                connection.close();

            } catch (Exception es) {
                System.out.println(es);
            }
        }
        if(e.getSource()==but1)
        {
            this.dispose();
            setVisible(false);
            new atm2().toFront();
//            new atm2().setState(java.awt.Frame.NORMAL);
            this.dispose();
        }
    }
    public static void main(String[] a)
    {
        atm4 demo=new atm4();
    }
}

