import java.awt.Color;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;

import javax.print.AttributeException;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.border.*;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.*;

class atm2 extends JFrame implements ActionListener
{
   
    JButton but,but1,but2,but3,but4,but5,but6;
    JLabel label;
    atm2()
    {
    JFrame frame=new JFrame();
    Font f=new Font(Font.SERIF,Font.BOLD,40);
    label=new JLabel();
    but=new JButton();
    but1=new JButton();
    but2=new JButton();
    but3=new JButton();
    but4=new JButton();
    but5=new JButton();
    but6=new JButton();


    
    this.setBounds(0,0,899,700);
    this.setLayout(null);



    // Top label
    label.setText("Select Transaction");
    label.setBounds(288,33,399,33);
    label.setFont(f);
    label.setForeground(Color.red);
    this.add(label);
    but.setBounds(353,550,192,53);
    but.setText("BACK");
    this.add(but);
    but.addActionListener(this);
    but.setBackground(Color.decode("#9900ff"));
    but.setForeground(Color.WHITE);
   


   this.getContentPane().setBackground(Color.decode("#0c84bc"));

    but1.setBounds(23,129,270,58);
    but1.setText("Withdraw");
    but1.setBackground(Color.BLACK);
   
    but1.setForeground(Color.GREEN);
    but1.addActionListener(this);
    this.add(but1);

    // BUTTON 2
    but2.setBounds(23,273,270,58);
    but2.setText("Deposite");
    but2.setBackground(Color.BLACK);
    but2.setForeground(Color.GREEN);
    this.add(but2);

    // BUTTON 3

    but3.setBounds(23,433,270,58);
    but3.setText("Bank Balance");
    but3.setBackground(Color.BLACK);
    but3.setForeground(Color.GREEN);
    but3.addActionListener(this);
    this.add(but3);


    // BUTTON 4

    but4.setBounds(523,433,270,58);
    but4.setText("PIN Change");
    but4.setBackground(Color.BLACK);
    but4.setForeground(Color.GREEN);
    this.add(but4);
    this.setVisible(true);
// Button 5
but5.setBounds(523,273,270,58);
but5.setText("Mobile Top");
but5.setBackground(Color.BLACK);
but5.setForeground(Color.GREEN);
this.add(but5);

// Button 6

but6.setBounds(523,129,270,58);
but6.setText("Payments");
but6.setBackground(Color.BLACK);
but6.setForeground(Color.GREEN);
this.add(but6);


this.setVisible(true);

    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==but)
        {
            this.dispose();
            this.toBack();
            setVisible(false);
            new atm().toFront();
//            new atm().setState(java.awt.Frame.NORMAL);
        }
        if(e.getSource()==but3)
        {
            this.dispose();
            atm4 next4=new atm4();
            next4.setVisible(true);
            next4.toFront();
        }
        if(e.getSource()==but1)
        {
            this.dispose();
         atm3 next3= new atm3();
        
        
         
         next3.setVisible(true);
       
         next3.toFront();
        

        
         
          
        }
    }


    public static void main(String[] args) {
        atm2 demo=new atm2();


    }
}