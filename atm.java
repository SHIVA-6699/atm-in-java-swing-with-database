import java.awt.Container;
import java.awt.Cursor;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Color;

import javax.swing.*;

class atm extends JFrame implements ActionListener
{
    JFrame fame;
    JButton btn;
   
    atm()
    {
        JLabel label2 = new JLabel();
        Font f1=new Font(Font.SERIF, Font.PLAIN,  30);
      fame=new JFrame();
        Label label=new Label();
        btn =new JButton();
         fame.setTitle("ATM");   
        this.setLayout(null);
        this.setBounds(0,0,600,700);
        this.getContentPane().setBackground(Color.gray);
     
       label.setText("CENTURION ATM");
       label.setForeground(Color.WHITE);
      
       label.setFont(f1);
       label.setBounds(170,29,399,90);
       
      this.add(label);

    Container c = this.getContentPane();
    //   image
    // ImageIcon icon=new ImageIcon("math2.jpg");
    label2.setIcon(new ImageIcon("bank2.jpg"));
    
    label2.setBounds(100, 130,399,300);
        c.add(label2);
    btn.setText("INSERT");
    btn.setBounds(240,459,100,50);
    btn.setBackground(Color.ORANGE);
  
    btn.setForeground(Color.red);
    btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
 this.add(btn);

btn.addActionListener(this);


      this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btn)
        {
          
            this.dispose();

     
            this.toBack();
           
            atm2 newframe=new atm2();
          
            newframe.setVisible(true);
            newframe.toFront();
        }
    }
    public static void main(String[] args) {
        atm demo =new atm();
    }
}