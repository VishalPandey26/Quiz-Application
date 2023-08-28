import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Quiz extends JFrame implements ActionListener {

    String questions[][] = new String[10][5];
    String answers[][]  = new String[10][2];
    JButton cancel;
    JButton submit;
    String name;

    Quiz(String name){
    this.name = name;
    setBounds(50,0,1440,850);
    getContentPane().setBackground(Color.WHITE);
    setLayout(null);

    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("quiz.jpg"));
    JLabel image = new JLabel(i1);
    image.setBounds(0, 0, 1440, 392);
    add(image);

    JLabel qno=  new JLabel("1");
    qno.setBounds(100, 450, 50, 30);
    qno.setFont(new Font("Tahoma",Font.PLAIN,24));
    add(qno);

    JLabel question=  new JLabel("this is a question");
    question.setBounds(150, 450, 900, 30);
    question.setFont(new Font("Tahoma",Font.PLAIN,24));
    add(question);

    questions[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        questions[0][1] = "JVM";
        questions[0][2] = "JDB";
        questions[0][3] = "JDK";
        questions[0][4] = "JRE";

        questions[1][0] = "What is the return type of the hashCode() method in the Object class?";
        questions[1][1] = "int";
        questions[1][2] = "Object";
        questions[1][3] = "long";
        questions[1][4] = "void";

        questions[2][0] = "Which package contains the Random class?";
        questions[2][1] = "java.util package";
        questions[2][2] = "java.lang package";
        questions[2][3] = "java.awt package";
        questions[2][4] = "java.io package";

        questions[3][0] = "An interface with no fields or methods is known as?";
        questions[3][1] = "Runnable Interface";
        questions[3][2] = "Abstract Interface";
        questions[3][3] = "Marker Interface";
        questions[3][4] = "CharSequence Interface";

        questions[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        questions[4][1] = "Stack";
        questions[4][2] = "String memory";
        questions[4][3] = "Random storage space";
        questions[4][4] = "Heap memory";

        questions[5][0] = "Which of the following is a marker interface?";
        questions[5][1] = "Runnable interface";
        questions[5][2] = "Remote interface";
        questions[5][3] = "Readable interface";
        questions[5][4] = "Result interface";

        questions[6][0] = "Which keyword is used for accessing the features of a package?";
        questions[6][1] = "import";
        questions[6][2] = "package";
        questions[6][3] = "extends";
        questions[6][4] = "export";

        questions[7][0] = "In java, jar stands for?";
        questions[7][1] = "Java Archive Runner";
        questions[7][2] = "Java Archive";
        questions[7][3] = "Java Application Resource";
        questions[7][4] = "Java Application Runner";

        questions[8][0] = "Which of the following is a mutable class in java?";
        questions[8][1] = "java.lang.StringBuilder";
        questions[8][2] = "java.lang.Short";
        questions[8][3] = "java.lang.Byte";
        questions[8][4] = "java.lang.String";

        questions[9][0] = "Which of the following option leads to the portability and security of Java?";
        questions[9][1] = "Bytecode is executed by JVM";
        questions[9][2] = "The applet makes the Java code secure and portable";
        questions[9][3] = "Use of exception handling";
        questions[9][4] = "Dynamic binding between objects";

/* Find below the Answers Array of the above Questions*/
        
        answers[0][1] = "JDB";
        answers[1][1] = "int";
        answers[2][1] = "java.util package";
        answers[3][1] = "Marker Interface";
        answers[4][1] = "Heap memory";
        answers[5][1] = "Remote interface";
        answers[6][1] = "import";
        answers[7][1] = "Java Archive";
        answers[8][1] = "java.lang.StringBuilder";
        answers[9][1] = "Bytecode is executed by JVM";

     
        JRadioButton option1 = new JRadioButton("Option1 ");
        option1.setBounds(170,520, 700, 30);
        setBackground(Color.white);
        add(option1);

        JRadioButton option2 = new JRadioButton("Option2 ");
        option2.setBounds(170,560, 700, 30);
        setBackground(Color.white);
        add(option2);

        JRadioButton option3 = new JRadioButton("Option3 ");
        option3.setBounds(170,600, 700, 30);
        setBackground(Color.white);
        add(option3);

        JRadioButton option4 = new JRadioButton("Option4");
        option4.setBounds(170,640, 700, 30);
        setBackground(Color.white);
        add(option4);

        ButtonGroup groupoptions = new ButtonGroup();   // so that we can make multiple chioce question 
        groupoptions.add(option1);
        groupoptions.add(option2);
        groupoptions.add(option3);
        groupoptions.add(option4);

        cancel= new JButton("CANCEL");
        cancel.setBounds(1100, 550, 200, 40);
        cancel.setFont(new Font("Tahoma", Font.PLAIN,22));
        cancel.setBackground(Color.blue);
        cancel.setForeground(Color.white);
        cancel.addActionListener(this);
        add(cancel);

        
        submit = new JButton("SUBMIT");
        submit.setBounds(1100, 630, 200, 40);
        submit.setFont(new Font("Tahoma", Font.PLAIN,22));
        submit.setBackground(Color.blue);
        submit.setForeground(Color.white);
        //submit.setEnabled(false);
        submit.addActionListener(this);
        add(submit);
        

       setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == cancel){
             dispose();
        } 
        else if(ae.getSource() == submit) {
            new Thankyou();
        }
    }

    public static void main(String[] args) {
        new Quiz("User");
    }
    
}
