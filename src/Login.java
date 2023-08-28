import javax.swing.*; // imported JFrame class
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

   JButton rules,back;
    JTextField tfname;
    Login() {
        getContentPane().setBackground(Color.white);// changing the color of the frame. Method getContentPane() is used to take whole frame
        setLayout(null);// we are making our own layout

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 500);
        add(image);
        
        JLabel heading = new JLabel("SIMPLE  MINDS");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("Arial", Font.BOLD, 40));
        heading.setForeground(Color.BLUE);
        add(heading);

        JLabel name = new JLabel("Enter your Name");
        name.setBounds(810, 150, 300, 20);
        name.setFont(new Font("Arial", Font.BOLD, 18));
        name.setForeground(Color.BLUE);
        add(name);

         tfname=new JTextField();
        tfname.setBounds(737, 200, 300, 25);
        tfname.setFont(new Font("times new roman", Font.BOLD, 20));
        add(tfname);

        rules = new JButton("NEXT");
        rules.setBounds(735, 270, 120, 25);
        rules.setBackground(new Color(30, 144, 254));
        rules.setForeground(Color.white);
        rules.addActionListener(this);
        add(rules);

        back = new JButton("BACK");
        back.setBounds(915, 270, 120, 25);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);


        setSize(1200, 500);
        setLocation(200, 150);  // taking the screen to the middle
        setVisible(true);

    }

        public void actionPerformed(ActionEvent ae){
         if(ae.getSource()== rules){
             String name = tfname.getText();
             setVisible(false);
             new Rules(name);

         }
         else if (ae.getSource()== back) {
             setVisible(false);
             
         }
        }


    public static void main(String[] args) {


        new Login(); // making class object
    }
}
