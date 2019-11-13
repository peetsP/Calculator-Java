package calculations;
import javax.swing.*;
import java.awt.event.*;
public class GroupWork1 extends JFrame
{
    String operator;
    double firstnumber;
    double secondnumber;
    double result;
    
    public GroupWork1()
    {
        JFrame jf = new JFrame("CALCULATOR");
        JTextField txt1 = new JTextField();
        
        JButton btn7 = new JButton("1");
        JButton btn8 = new JButton("2");
        JButton btn9 = new JButton("3");
        JButton btnplus = new JButton("+");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");
        JButton btnminus = new JButton("-");
        JButton btn1 = new JButton("7");
        JButton btn2 = new JButton("8");
        JButton btn3 = new JButton("9");
        JButton btndiv = new JButton("/");
        JButton btndot = new JButton(".");
        JButton btn0 = new JButton("0");
        JButton del = new JButton("Del");
        JButton btnmult = new JButton("*");
        
        JButton reset = new JButton("Reset");
        JButton close = new JButton("Close");
        
        JButton equals = new JButton("=");
        JTextField ans = new JTextField();
        
        jf.setVisible(true);
        jf.setSize(700, 800);
        jf.setLayout(null);
        
        txt1.setBounds(20, 50, 330, 50);
        jf.add(txt1);       
        btn1.setBounds(50, 120, 55, 50);
        jf.add(btn1);     
        btn2.setBounds(105, 120, 55, 50);
        jf.add(btn2);       
        btn3.setBounds(160, 120, 55, 50);     
        jf.add(btn3);
        btnplus.setBounds(250, 120, 55, 50);     
        jf.add(btnplus);
        
        btn4.setBounds(50, 170, 55, 50);
        jf.add(btn4);     
        btn5.setBounds(105, 170, 55, 50);
        jf.add(btn5);       
        btn6.setBounds(160, 170, 55, 50);     
        jf.add(btn6);
        btnminus.setBounds(250, 170, 55, 50);     
        jf.add(btnminus);
        
        btn7.setBounds(50, 220, 55, 50);
        jf.add(btn7);     
        btn8.setBounds(105, 220, 55, 50);
        jf.add(btn8);       
        btn9.setBounds(160, 220, 55, 50);     
        jf.add(btn9);
        btndiv.setBounds(250, 220, 55, 50);     
        jf.add(btndiv);
        
        btndot.setBounds(50, 270, 55, 50);
        jf.add(btndot);     
        btn0.setBounds(105, 270, 55, 50);
        jf.add(btn0);       
        del.setBounds(160, 270, 55, 50);
        jf.add(del);
        btnmult.setBounds(250, 270, 55, 50);
        jf.add(btnmult);
        
        reset.setBounds(20, 350, 70, 40);
        jf.add(reset);
        close.setBounds(90, 350, 70, 40);
        jf.add(close);
        equals.setBounds(160, 350, 70, 40);
        jf.add(equals);
        ans.setBounds(235, 350, 120, 40);
        jf.add(ans);
        
        btn1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String enternumber = txt1.getText() + btn1.getText();
                txt1.setText(enternumber);
            }
        });
        
        btn2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String enternumber = txt1.getText() + btn2.getText();
                txt1.setText(enternumber);
            }
        });
        
        btn3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String enternumber = txt1.getText() + btn3.getText();
                txt1.setText(enternumber);
            }
        });
        
        btn4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String enternumber = txt1.getText() + btn4.getText();
                txt1.setText(enternumber);
            }
        });
        
        btn5.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String enternumber = txt1.getText() + btn5.getText();
                txt1.setText(enternumber);
            }
        });
        
        btn6.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String enternumber = txt1.getText() + btn6.getText();
                txt1.setText(enternumber);
            }
        });
        
       
        btn7.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String enternumber = txt1.getText() + btn7.getText();
                txt1.setText(enternumber);
            }
        });
        
        btn8.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String enternumber = txt1.getText() + btn8.getText();
                txt1.setText(enternumber);
            }
        });
        
        btn9.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String enternumber = txt1.getText() + btn9.getText();
                txt1.setText(enternumber);
            }
        });
        
        btn0.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String enternumber = txt1.getText() + btn0.getText();
                txt1.setText(enternumber);
            }
        });
        
        btndot.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String enternumber = txt1.getText() + btndot.getText();
                txt1.setText(enternumber);
            }
        });
        
        btnplus.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
               firstnumber = Double.parseDouble(txt1.getText());
                txt1.setText("");
                operator = "+";
            }
        });
        
        btnminus.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                firstnumber = Double.parseDouble(txt1.getText());
                txt1.setText("");
                operator = "-";
            }
        });
        
        btndiv.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                firstnumber = Double.parseDouble(txt1.getText());
                txt1.setText("");
                operator = "/";
            }
        });
        
        btnmult.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                firstnumber = Double.parseDouble(txt1.getText());
                txt1.setText("");
                operator="*";
            }
        });
        
        reset.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                txt1.setText("");
                ans.setText("");
            }
        });
        
        
        del.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                
            }
        });
        
        close.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                jf.setVisible(false);
            }
        });
        
        
        equals.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String answer;
                secondnumber = Double.parseDouble(txt1.getText());
                
                if (operator == "+")
                {
                    result = firstnumber + secondnumber;
                    answer = String.format("%.0f", result);
                    ans.setText(answer);
                    txt1.setText(answer);
                }
                
                else if(operator == "-")
                {
                    result = firstnumber - secondnumber;
                    answer = String.format("%.0f", result);
                    ans.setText(answer);
                    txt1.setText(answer);
                }
                else if(operator == "/")
                {
                    result = firstnumber / secondnumber;
                    answer = String.format("%.0f", result);
                    ans.setText(answer);
                    txt1.setText(answer);
                }
                else if(operator == "*")
                {
                    result = firstnumber * secondnumber;
                    answer = String.format("%.0f", result);
                    ans.setText(answer);
                    txt1.setText(answer);
                }
            }
        });
        
    }
    
    public static void main(String[] args) {
        GroupWork1 gw = new GroupWork1();
    }
}
































