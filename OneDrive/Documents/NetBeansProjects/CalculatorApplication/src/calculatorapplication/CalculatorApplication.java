package calculatorapplication;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author oumayma
 */
public class CalculatorApplication implements ActionListener {
   
    double num1=0,num2=0,num3=0,result=0;
    int calculation;
    
   
    
    JFrame frame=new JFrame("Calculator"); 
    JLabel label = new JLabel();
    JTextField textField= new JTextField();
    JRadioButton onRadioButton=new JRadioButton("On");
    JRadioButton offRadioButton=new JRadioButton("Off");
    JButton buttonZero=new JButton ("0");
    JButton buttonOne=new JButton ("1");
    JButton buttonTwo=new JButton ("2");
    JButton buttonThree=new JButton ("3");
    JButton buttonFour=new JButton ("4");
    JButton buttonFive=new JButton ("5");
    JButton buttonSix=new JButton ("6");
    JButton buttonSeven=new JButton ("7");
    JButton buttonEight=new JButton ("8");
    JButton buttonNine=new JButton ("9");
    JButton buttonDot=new JButton (".");
    JButton buttonDel=new JButton ("DEL");
    JButton buttonClear=new JButton ("C");
    JButton buttonEqual=new JButton ("=");
    JButton buttonPlus=new JButton ("+");
    JButton buttonMinus=new JButton ("-");
    JButton buttonMul=new JButton ("X");
    JButton buttonDiv=new JButton ("/");
    JButton buttonSquare=new JButton ("x\u00B2");
    JButton buttonSqrt=new JButton ("\u221A");
    JButton buttonReciprocal=new JButton ("1/x");
   
    CalculatorApplication(){
          prepareGui();
          addcomponents();
          addActionEvent();
     }
     public void prepareGui(){
      frame.setSize(400,580);
      frame.getContentPane().setLayout(null);
      frame.getContentPane().setBackground(Color.black);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
     }
     public void addcomponents(){
         label.setBounds(250, 0, 50, 50);
         label.setForeground(Color.pink);
         frame.add(label);
         textField.setBounds(15,40,330,40);
          textField.setFont(new Font("Arial",Font.BOLD,20));
          textField.setEditable(false);
          textField.setHorizontalAlignment(SwingConstants.RIGHT);
          frame.add(textField);
          
          onRadioButton.setBounds(10,100,70,50);
          onRadioButton.setSelected(false);
          onRadioButton.setFont(new Font("Arial",Font.BOLD,14));
          onRadioButton.setBackground(Color.black);
          onRadioButton.setForeground(Color.pink);
          onRadioButton.setFocusable(false);
          frame.add(onRadioButton);
                  
          offRadioButton.setBounds(10,130,70,50);
          offRadioButton.setSelected(false);
          offRadioButton.setFont(new Font("Arial",Font.BOLD,14));
          offRadioButton.setBackground(Color.black);
          offRadioButton.setForeground(Color.pink);
          offRadioButton.setFocusable(false);
          frame.add(offRadioButton);
          
          ButtonGroup buttonGroup = new ButtonGroup();
          buttonGroup.add(onRadioButton);
          buttonGroup.add(offRadioButton);
          
           buttonDel.setBounds(280,120,70,50);
           buttonDel.setFont(new Font("Arial",Font.BOLD,16));
           buttonDel.setBackground(Color.yellow);
           frame.add(buttonDel);
           
           buttonClear.setBounds(186,120,70,50);
           buttonClear.setFont(new Font("Arial",Font.BOLD,20));
           buttonClear.setBackground(Color.yellow);
           frame.add(buttonClear);
           
          buttonSqrt.setBounds(100,190,70,50);
          buttonSqrt.setFont(new Font("Arial",Font.BOLD,20));
          frame.add(buttonSqrt);
          
          buttonReciprocal.setBounds(10,190,70,50);
          buttonReciprocal.setFont(new Font("Arial",Font.BOLD,20));
          frame.add(buttonReciprocal);
          
          buttonSqrt.setBounds(100,190,70,50);
          buttonSqrt.setFont(new Font("Arial",Font.BOLD,20));
          frame.add(buttonSqrt);
          
          buttonSquare.setBounds(190,190,70,50);
          buttonSquare.setFont(new Font("Arial",Font.BOLD,20));
          frame.add(buttonSquare);
          
           buttonDiv.setBounds(280,190,70,50);
           buttonDiv.setFont(new Font("Arial",Font.BOLD,20));
           buttonDiv.setBackground(Color.pink);
           frame.add(buttonDiv);
         
          buttonSeven.setBounds(10,260,70,50);
          buttonSeven.setFont(new Font("Arial",Font.BOLD,20));
          frame.add(buttonSeven);
          
          buttonEight.setBounds(100,260,70,50);
          buttonEight.setFont(new Font("Arial",Font.BOLD,20));
          frame.add(buttonEight);
          
          buttonNine.setBounds(190,260,70,50);
          buttonNine.setFont(new Font("Arial",Font.BOLD,20));
          frame.add(buttonNine);
          
           buttonFour.setBounds(190,330,70,50);
           buttonFour.setFont(new Font("Arial",Font.BOLD,20));
           frame.add(buttonFour);
           
           buttonFive.setBounds(100,330,70,50);
           buttonFive.setFont(new Font("Arial",Font.BOLD,20));
           frame.add(buttonFive);
           
            buttonSix.setBounds(10,330,70,50);
            buttonSix.setFont(new Font("Arial",Font.BOLD,20));
            frame.add(buttonSix);
           
            buttonOne.setBounds(190,400,70,50);
            buttonOne.setFont(new Font("Arial",Font.BOLD,20));
            frame.add(buttonOne);
            
           
            buttonThree.setBounds(10,400,70,50);
            buttonThree.setFont(new Font("Arial",Font.BOLD,20));
            frame.add(buttonThree);
           
            buttonTwo.setBounds(100,400,70,50);
            buttonTwo.setFont(new Font("Arial",Font.BOLD,20));
            frame.add(buttonTwo);
            
            buttonZero.setBounds(10,470,160,50);
            buttonZero.setFont(new Font("Arial",Font.BOLD,20));
            frame.add(buttonZero);
            
              
            buttonDot.setBounds(190,470,70,50);
            buttonDot.setFont(new Font("Arial",Font.BOLD,20));
            frame.add(buttonDot);
            
            buttonPlus.setBounds(280,260,70,50);
            buttonPlus.setFont(new Font("Arial",Font.BOLD,20));
             buttonPlus.setBackground(Color.pink);
            frame.add(buttonPlus);
         
          
          buttonMinus.setBounds(280,330,70,50);
          buttonMinus.setFont(new Font("Arial",Font.BOLD,20));
          buttonMinus.setBackground(Color.pink);
          frame.add(buttonMinus);
           
            buttonMul.setBounds(280,400,70,50);
            buttonMul.setFont(new Font("Arial",Font.BOLD,20));
            buttonMul.setBackground(Color.pink);
            frame.add(buttonMul);
           
             buttonEqual.setBounds(280,470,70,50);
            buttonEqual.setFont(new Font("Arial",Font.BOLD,20));
            buttonEqual.setBackground(Color.pink);
            frame.add(buttonEqual);
     }
     public void addActionEvent(){
         onRadioButton.addActionListener(this);
         offRadioButton.addActionListener(this);
         buttonOne.addActionListener(this);
         buttonTwo.addActionListener(this);
         buttonThree.addActionListener(this);
         buttonFour.addActionListener(this);
         buttonFive.addActionListener(this);
         buttonSix.addActionListener(this);
         buttonSeven.addActionListener(this);
         buttonEight.addActionListener(this);
         buttonNine.addActionListener(this);
         buttonPlus.addActionListener(this);
         buttonMinus.addActionListener(this);
         buttonClear.addActionListener(this);
         buttonMul.addActionListener(this);
         buttonDel.addActionListener(this);
         buttonDiv.addActionListener(this);
         buttonReciprocal.addActionListener(this);
         buttonSqrt.addActionListener(this);
         buttonSquare.addActionListener(this);
         buttonDot.addActionListener(this);
         buttonEqual.addActionListener(this);

     }
     public static void main(String[] args) {
        CalculatorApplication calcul= new  CalculatorApplication();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      Object source = e.getSource();
      if(source== onRadioButton){
          enable();        
      }
      else if(source==offRadioButton){
          disable();
      }
      else if(source==buttonClear){
          label.setText("");
          textField.setText("");  
      }
      else if(source==buttonDel){
          int length = textField.getText().length();
          int number =length-1;
          if(length>0){
              StringBuilder back = new StringBuilder(textField.getText());
              back.deleteCharAt(number);
              textField.setText(back.toString());
          }
          if(textField.getText().endsWith(""));
          label.setText("");
          
      }
      else if(source==buttonZero){
          if(textField.getText().equals("0")){
              return;
          }
          else {
              textField.setText(textField.getText()+"0");
               }
      }
       else if(source==buttonOne){
           textField.setText(textField.getText()+"1");
              }
       else if(source==buttonTwo){
           textField.setText(textField.getText()+"2");
      }
       else if(source==buttonThree){
           textField.setText(textField.getText()+"3");
      }
       else if(source==buttonFour){
           textField.setText(textField.getText()+"4");
      }
       else if(source==buttonFive){
          textField.setText(textField.getText()+"5");
      }
       else if(source==buttonSix){
          textField.setText(textField.getText()+"6");
      }
       else if(source==buttonSeven){
          textField.setText(textField.getText()+"7");
      }
       else if(source==buttonEight){
         textField.setText(textField.getText()+"8");
      }
       else if(source==buttonNine){
          textField.setText(textField.getText()+"9");
      }
       else if(source==buttonDot){
         if(textField.getText().contains(".")){
             return;
         }
         else {
             textField.setText(textField.getText()+".");
         }
      }
       else if(source==buttonPlus){
           String ch =textField.getText();
           num1=Double.parseDouble(textField.getText());
           calculation=1;
           textField.setText("");
           label.setText(ch+"+");
           
       }
      else if(source==buttonMinus){
           String ch =textField.getText();
           num1=Double.parseDouble(textField.getText());
           calculation=2;
           textField.setText("");
           label.setText(ch+"-"); 
       }
       else if(source==buttonDiv){
           String ch =textField.getText();
           num1=Double.parseDouble(textField.getText());
           calculation=3;
           textField.setText("");
           label.setText(ch+"/"); 
       }
       else if(source==buttonMul){
           String ch =textField.getText();
           num1=Double.parseDouble(textField.getText());
           calculation=4;
           textField.setText("");
           label.setText(ch+"X"); 
       }
       else if(source==buttonSquare){
           num1=Double.parseDouble(textField.getText());
           double square=Math.pow(num1,2);
           String s=Double.toString(square);
           if(s.endsWith(".0")){
               textField.setText(s.replace(".",""));
           }
           else{
               textField.setText(s);
           }
       }
          else if(source==buttonSqrt){
           num1=Double.parseDouble(textField.getText());
           double sqrt=Math.sqrt(num1);
           String s=Double.toString(sqrt);
           if(s.endsWith(".0")){
               textField.setText(s.replace(".",""));
           }
           else{
               textField.setText(s);
           }
       }
         else if(source==buttonReciprocal){
           num1=Double.parseDouble(textField.getText());
           double sqrt=Math.pow(num1,-1);
           String s=Double.toString(sqrt);
           if(s.endsWith(".0")){
               textField.setText(s.replace(".",""));
           }
           else{
               textField.setText(s);
           }
       }
        else if(source==buttonReciprocal){
           num1=Double.parseDouble(textField.getText());
           double sqrt=Math.pow(num1,-1);
           String s=Double.toString(sqrt);
           if(s.endsWith(".0")){
               textField.setText(s.replace(".",""));
           }
           else{
               textField.setText(s);
           }
       }
        else if(source==buttonEqual){
           num2=Double.parseDouble(textField.getText());
           switch(calculation){
               case 1 :
                   result= num1+num2;
                   break;
               case 2 :
                   result= num1-num2;
                   break;
              case 3 :
                   result= num1/num2;
                   break;
              case 4 :
                   result= num1*num2;
                   break;

           }
           if(Double.toString(result).endsWith(".")){
               textField.setText(Double.toString(result).replace(".0",""));
           }
           else{
                textField.setText(Double.toString(result));
           }
           label.setText("");
           num1=result;
       }
      
      
      
      
      
      
      
    }
    public void enable(){
       onRadioButton.setEnabled(false);
       offRadioButton.setEnabled(true);
       textField.setEditable(true);
       label.setEnabled(true);
       buttonOne.setEnabled(true);
       buttonZero.setEnabled(true);
       buttonTwo.setEnabled(true);
       buttonThree.setEnabled(true);
       buttonFour.setEnabled(true);
       buttonFive.setEnabled(true);
       buttonSix.setEnabled(true);
       buttonSeven.setEnabled(true);
       buttonEight.setEnabled(true);
       buttonNine.setEnabled(true);
       buttonDel.setEnabled(true);
       buttonPlus.setEnabled(true);
       buttonMinus.setEnabled(true);
       buttonSqrt.setEnabled(true);
       buttonMul.setEnabled(true);
       buttonDiv.setEnabled(true);
       buttonEqual.setEnabled(true);
       buttonClear.setEnabled(true);
       buttonSquare.setEnabled(true);
       buttonReciprocal.setEnabled(true);
       buttonDot.setEnabled(true);
        
    }
    public void disable(){
         onRadioButton.setEnabled(true);
       offRadioButton.setEnabled(false);
       textField.setEditable(false);
      label.setText("");
      textField.setText("");
       label.setEnabled(false);
       buttonZero.setEnabled(false);
       buttonOne.setEnabled(false);
       buttonTwo.setEnabled(false);
       buttonThree.setEnabled(false);
       buttonFour.setEnabled(false);
       buttonFive.setEnabled(false);
       buttonSix.setEnabled(false);
       buttonSeven.setEnabled(false);
       buttonEight.setEnabled(false);
       buttonNine.setEnabled(false);
       buttonDel.setEnabled(false);
       buttonPlus.setEnabled(false);
       buttonMinus.setEnabled(false);
       buttonSqrt.setEnabled(false);
       buttonMul.setEnabled(false);
       buttonDiv.setEnabled(false);
       buttonEqual.setEnabled(false);
       buttonClear.setEnabled(false);
       buttonSquare.setEnabled(false);
       buttonReciprocal.setEnabled(false);
       buttonDot.setEnabled(false);
        
    }
    
}
