 import java.awt.*; 
 import java.awt.event.*; 
 import javax.swing.*;

 import java.util.Random;

 public class GuessingGame implements ActionListener { 
   JTextField userGuess; 
   JButton guessButton, playAgainButton;
   JLabel jlabGuess, jlabHigh, jlabLast; 
   Random r = new Random();
   int randomInt = r.nextInt(100) + 1;

   GuessingGame() {
     Random r = new Random();
     int randomInt = r.nextInt(100) + 1;

     JFrame frame = new JFrame("GuessingGame");
     frame.setLayout(new FlowLayout());
     frame.setSize(240, 120); 

     userGuess = new JTextField(10); 
     userGuess.setActionCommand("myTF"); 

     guessButton = new JButton("Button"); 
     playAgainButton = new JButton("Play Again");
        
     userGuess.addActionListener(this); 
     guessButton.addActionListener(this); 
     playAgainButton.addActionListener(this);

     jlabGuess = new JLabel("Enter your guess: "); 
     jlabHigh = new JLabel("");
     jlabLast = new JLabel(""); 

     frame.add(jlabGuess);
     frame.add(userGuess);
     frame.add(guessButton);
     frame.add(jlabHigh);
     frame.add(jlabLast);
     frame.add(playAgainButton);
     
     frame.setVisible(true);

   }

   public void actionPerformed(ActionEvent ae) { 
      if(ae.getActionCommand().equals("Guess")) { 
        int guess = Integer.parseInt(userGuess.getText());

        if (userGuess < guess) { 
         jLabHigh.setText("Too low!");
        } 
        else 
        if (userGuess > guess) {
          jLabHigh.setText("Too high!");
        }
        if (userGuess = guess) {
         jLabHigh.setText("You got it!");
        }
      } 
        else {
        jlabLast.setText("Last guess was " + 
        userGuess.getText()); 
     }

     if(ae.getActionCommand().equals("Play Again")) { 
      Random r = new Random();
      int randomInt = r.nextInt(100) + 1;
      jlabGuess.setText("Enter your guess: ");
      jlabHigh.setText("");
      jlabLast.setText("");
      userGuess.setText("");
     }
     
     else 
     jlabHigh.setText("You pressed Enter. Please press the Guess Button.");
  } 
  
} 

   
   

