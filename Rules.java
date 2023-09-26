import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame implements ActionListener {
    String name;
    JButton start,back;

    Rules(String name){
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Welcome "+name+" to Simple Minds");
        heading.setBounds(50,20,700,30);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,28));
        heading.setForeground(new Color(30,144,254));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20,90,700,350);
        rules.setFont(new Font("Tahoma",Font.PLAIN,16));
        rules.setText(
            "<html>"+
                    "1. you have 10 question and each question has four option." + "<br><br>" +
                    "2. Each question has 15 seconds" + "<br><br>" +
                    "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                    "4. Here lifeline option can be provided but it can use only one time." + "<br><br>" +
                    "5. There is no back option after each question" + "<br><br>" +
                    "6. Each question contain 10 marks. "+
                    "<html>"
        );
        add(rules);

        start = new JButton("Start");
        start.setBounds(400,500,100,30);
        start.setBackground(new Color(30,144,254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);

        back = new JButton("Back");
        back.setBounds(250,500,100,30);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);



        setSize(800,650);
        setLocation(350,100);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == start){
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
    public static void main(String[] args) {
        new Rules("User");
    }
}
