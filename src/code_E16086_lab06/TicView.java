package code_E16086_lab06;

/*----------------------------------------------
display the playboard
------------------------------------------------*/


import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;

//set up the view and add components
public class TicView extends JFrame {
	private static final long serialVersionUID = 1L;
    private JButton button[]=new JButton[9]; //create 9 buttons
    int count = 0; //count the correct entries.if user select previously selected button ignore it
    private JFrame frame = new JFrame();
    
    public TicView() {
        super("Tick-tact-toe"); //title
        setSize(500,500); //size but can be resized
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3,3));
       
       
       //creating buttons 
        for(int i=0;i<9;i++) {
        	button[i] =new JButton();
            add(button[i]);
            button[i].setBackground(Color.BLACK); //set the button background color
        }
     
        
    }
    
    //check if user click that box
    void addButtonListener(ActionListener buttonListen) {
    	for(int i=0;i<9;i++) {
    		button[i].addActionListener(buttonListen);
    	}
    }
  
    //return buttons
    public JButton b1() {
    	return button[0];
    }
    public JButton b2() {
    	return button[1];
    }
    public JButton b3() {
    	return button[2];
    }
    public JButton b4() {
    	return button[3];
    }
    public JButton b5() {
    	return button[4];
    }
    public JButton b6() {
    	return button[5];
    }
    public JButton b7() {
    	return button[6];
    }
    public JButton b8() {
    	return button[7];
    }
    public JButton b9() {
    	return button[8];
    }
    
    //return values that buttons got during the game
    public String getb1() {
    	return button[0].getText();
    }
    public String getb2() {
    	return button[1].getText();
    }
    public String getb3() {
    	return button[2].getText();
    }
    public String getb4() {
    	return button[3].getText();
    }
    public String getb5() {
    	return button[4].getText();
    }
    public String getb6() {
    	return button[5].getText();
    }
    public String getb7() {
    	return button[6].getText();
    }
    public String getb8() {
    	return button[7].getText();
    }
    public String getb9() {
    	return button[8].getText();
    }
    
    //decide what would happen after selecting winner
   public void end(int result) {

    	//0=yes start again ,1=no terminate
    	if(result==0) {	
    		frame.dispose();  //cleanup the current grid	
    		reset();  //reset buttons
    		setVisible(true); //visible new play board 
    	}
    	else if(result==1) {
    		//close Jframe and end the game
    		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //close window
    		System.exit(0); //terminate the program
    	}
	}
   
   public void reset() {
	   //set buttons into it's default position
	   for(int i=0;i<9;i++) {
		   button[i].setText(""); //empty buttons
		   button[i].setEnabled(true); //button values can be changed
	   }
   }

   public void getwinner(String s) {
	 //window to giving winner and decision about game continue
	   int result1=JOptionPane.showConfirmDialog(null,"Player "+ s+" win the game.\nWould you like to play again?","Warning",JOptionPane.YES_NO_OPTION);
	   end(result1);
   }
   public void draw() {
	 //window to say draw and decision about game continue
	   int result2 = 0;
	   result2=JOptionPane.showConfirmDialog(null,"game draw.\nWould you like to play again?","Warning",result2);
	   end(result2);
   }
  
}
