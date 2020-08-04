//name  : NUR SHABIRAH BINTI BACO
//no matric : BI19110037
//project title : CLUB REGISTERATION FORM 

package testregistration;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class RegisForm implements ActionListener
{
    JFrame frame = new JFrame("Club Registeration Form");
    Container con = frame.getContentPane();
    JLabel lhead,lname,lemail,lcourse,lgender,lclub;
    JTextField tname,temail, tcourse, tclub;
    JRadioButton r1,r2;
    ButtonGroup gender = new ButtonGroup();
    JCheckBox term;
    JButton submit,reset;
    JTextArea display;
    
    RegisForm()
    {
        frame.setBounds(150,90,750,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        con.setLayout(null);
        con.setBackground(Color.YELLOW);
        
        Font f = new Font("Times New Roman", Font.BOLD,20);
        lhead = new JLabel ("Registration Club Form");
        lhead.setBounds(250,5,400,35);
        lhead.setFont(f);
        con.add(lhead);
        
        lname = new JLabel ("Name");
        lname.setBounds(50,50,60,30);
        con.add(lname);
        
        lemail = new JLabel ("Email");
        lemail.setBounds(50,150,60,30);
        con.add(lemail);
        
        lgender = new JLabel ("Gender");
        lgender.setBounds(50,100,60,30);
        con.add(lgender);
        
        lcourse = new JLabel ("Course");
        lcourse.setBounds(50,200,60,30);
        con.add(lcourse);
        
        lclub = new JLabel ("Club");
        lclub.setBounds(50,250,60,30);
        con.add(lclub);
        
        tname = new JTextField();
        tname.setBounds(130,53,180,20);
        con.add(tname);
        
        r1= new JRadioButton("Male");
        r1.setBounds(130,100,60,30);
        r1.setBackground(Color.YELLOW);
        con.add(r1);
        
        r2= new JRadioButton("Female");
        r2.setBounds(230,100,80,30);
        r2.setBackground(Color.YELLOW);
        con.add(r2);
        
        gender.add(r1);
        gender.add(r2);
        
        temail = new JTextField();
        temail.setBounds(130,150,180,20);
        con.add(temail);
        
        tcourse = new JTextField();
        tcourse.setBounds(130,200,180,20);
        con.add(tcourse);
        
        tclub = new JTextField();
        tclub.setBounds(130,250,180,20);
        con.add(tclub);
        
        term = new JCheckBox("I accept term and condition");
        term.setBounds(70,300,250,25);
        term.setBackground(Color.yellow);
        con.add(term);
        
        submit = new JButton ("SUBMIT");
        submit.setBounds(100,350,80,25);
        con.add(submit);
        
        reset = new JButton ("RESET");
        reset.setBounds(200,350,80,25);
        con.add(reset);
        
        Color cc = new Color(170,170,170);
        Font ff = new Font ("Times New Roman", Font.BOLD,15);
        display = new JTextArea();
        display.setBounds(400,50,300,350);
        con.add(display);
        display.setFont(ff);
        display.setBackground(cc);
        display.setForeground(Color.WHITE);
        display.setEditable(false);
        
        submit.addActionListener(this);
        reset.addActionListener(this);
        
    }
    public void actionPerformed(ActionEvent e)
    {
      String ch = e.getActionCommand();
      if(ch == "SUBMIT")
      {
        if(term.isSelected())
        {
          String name = tname.getText();
          String email = temail.getText();
          String course = tcourse.getText();
          String club = tclub.getText();
          String gen = "Male";
          if(r2.isSelected())
          {
              gen = "Female";
          }
          
          display.setText("\n\nName: "+name+"\nGender: "+gen+"\nEmail: "+email+"\nCourse: "+course+"\nClub: "+club+"\n");
        }
        else
        {
           display.setText ("Please Agree Our Terms and Conditions");
        }
      }
      else
      {
          tname.setText(null);
          temail.setText(null);
          tcourse.setText(null);
          tclub.setText(null);
          display.setText(null);
          
          gender.clearSelection();
          term.setSelected(false);
      }
    }        
}

class TESTREGISTRATION {

    
    public static void main(String[] args) {
        RegisForm r = new RegisForm();
    }
    
}
