import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;
class atm3 extends JFrame implements ActionListener
{
    public static final String System = null;
   static int Amount;
   static  int num1;
    JFrame frame;
    JLabel label,label2,label3,label4;
    JButton but1 ,but2,but3,but4,but5,but6,but7,but8;
   static JTextField text;
    static   int num;

   static String str,str2;

    public atm3()
    {
        this.setTitle("Withdraw Page");
        Font f=new Font(Font.SERIF,Font.PLAIN,30);
        Font f1=new Font(Font.MONOSPACED,Font.PLAIN,40);
        label=new JLabel();
     frame =new JFrame();
     but1=new JButton();
     but2=new JButton();
     but3=new JButton();
     but4=new JButton();
     but5=new JButton();
     but6=new JButton();
     but7=new JButton();
     but8=new JButton();
     text=new JTextField();
     text.setBounds(300,390,340,34);
    text.setFont(f1);
    text.setHorizontalAlignment(JTextField.CENTER);
     this.add(text);

   label3=new JLabel();

     label2=new JLabel();
     label2.setText("Choose Your Amount");
     label2.setForeground(Color.black);
    label2.setBounds(360,-159,299,399);
     label2.setFont(f);
     
    this.add(label2);
     this.getContentPane().setBackground(Color.WHITE);
     Container c = this.getContentPane();
     label.setIcon(new ImageIcon("with2.jpg"));
      label.setBounds(294,-290,909,999);
    
      c.add(label);
      but1.setText("<= Back");
      but1.setBounds(400,593,153,49);
      but1.setBackground(Color.darkGray);
      but1.setForeground(Color.orange);
      this.add(but1);
      but1.addActionListener(this);
    //   button 2
but2.setText("50");
but2.setBounds(69,200,110,50);
but2.setForeground(Color.decode("#c9e291"));
but2.setBackground(Color.decode("#466e2f"));
but2.addActionListener(this);
but2.setFont(f);
this.add(but2);
// button3
    but3.setText("100");
    but3.setBounds(69,350,110,50);
    but3.setFont(f);
    but3.setForeground(Color.decode("#c9e291"));
but3.setBackground(Color.decode("#466e2f"));
but3.addActionListener(this);
    this.add(but3);

// button4
but4.setText("200");
    but4.setBounds(69,500,110,50);
    but4.setForeground(Color.decode("#c9e291"));
but4.setBackground(Color.decode("#466e2f"));
but4.setFont(f);
but4.addActionListener(this);
    this.add(but4);

// button5
but5.setText("500");
    but5.setBounds(769,200,110,50);
    but5.setForeground(Color.decode("#c9e291"));
but5.setBackground(Color.decode("#466e2f"));
but5.setFont(f);
but5.addActionListener(this);
    this.add(but5);


    // button6
but6.setText("2000");
but6.setBounds(769,350,110,50);
but6.setForeground(Color.decode("#c9e291"));
but6.setBackground(Color.decode("#466e2f"));
but6.setFont(f);
but6.addActionListener(this);
this.add(but6);

// button7
but7.setText("custom");
but7.setForeground(Color.decode("#c9e291"));
but7.setBackground(Color.decode("#466e2f"));

but7.setFont(f);
    but7.setBounds(769,500,120,55);
    this.add(but7);
    but7.addActionListener(this);

// button8
but8.setText("Withdraw");
but8.setForeground(Color.decode("#c9e291"));
but8.setBackground(Color.decode("#466e2f"));
but8.setFont(f);
but8.setBounds(300,490,340,40);
this.add(but8);
but8.addActionListener(this);





     this.setLayout(null);
     this.setBounds(0,0,1000,700);
    
     this.setVisible(true);

     
    }


    public void actionPerformed(ActionEvent e) {

      int num2=3;
        if(e.getSource()==but7)
        {
            text.setText("");
            text.setBackground(Color.decode("#c9e291"));
            JOptionPane.showMessageDialog(frame, "Reaming Change Will Consider To Tax","NOTIC",JOptionPane.INFORMATION_MESSAGE);
        }
        if(e.getSource()==but8)
        {



//           databse

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                Connection connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/java", "root", ""
                );

                Statement statement = connection.createStatement();




//            ResultSet resultSet = statement.executeQuery("select * from mysql");
//            while (resultSet.next()) {
//                java.lang.System.out.println(resultSet.getString(1) + " " + resultSet.getString(2));
//
//
//            }
                ResultSet resultSet = statement.executeQuery("select * from mysql2 where id=1");
                while(resultSet.next())
                {
                    Amount=(resultSet.getInt(1));
                }

                str=text.getText();
                num=Integer.parseInt(str);
                num1=Amount-num;
                str2=Integer.toString(num1);
                statement.execute("update mysql2 set amount="+num1+" where id=1;");
                java.lang.System.out.println("succesfully updated");
                connection.close();
            } catch (Exception es) {
                java.lang.System.out.println(es);
            }


//            database end

            JOptionPane.showMessageDialog(frame,"Please Collect Your Amount","BALANCE",JOptionPane.INFORMATION_MESSAGE);
            text.setText("");   
        }
        if(e.getSource()==but2)
        {
          
            text.setText("50");
        }
        if(e.getSource()==but3)
        {
            text.setText("100");
        
        }
        if(e.getSource()==but4)
        {
            text.setText("200");
        }
        if(e.getSource()==but5)
        {
            text.setText("500");
        }
        if(e.getSource()==but6)
        {
            text.setText("2000");
        }
     if(e.getSource()==but1)
     {
           this.toBack();
            setVisible(false);
            new atm2().toFront();
//            new atm2().setState(java.awt.Frame.NORMAL);
            this.dispose();
     }
    }
    public static void main(String[] args) {
        atm3 demo=new atm3();





    }
}   