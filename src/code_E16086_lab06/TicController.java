package code_E16086_lab06;

/*----------------------------------
connect Ticmodel and Ticview
---------------------------------*/


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicController{
	
	String s[]=new String[9]; //store values in buttons
	private TicView theview;
	private TicModel themodel;
	private static int count=0; //count the correct entries.if user select previously selected button ignore it
	
	public TicController(TicView theview,TicModel themodel){
		this.theview=theview;
		this.themodel=themodel;
		this.theview.addButtonListener(new handler());
		
	}

	private class handler implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
	
			count ++; //update the number of entries
	
 // The buttons selected by user  should be marked with the entered user's number (1 or 2)
// in order to ignore selecting previously selected values selecting again setEnabled() disabled.
			if(e.getSource()==theview.b1()) {
				theview.b1().setText(themodel.countValue(count));
				theview.b1().setEnabled(false);
			}
			if(e.getSource()==theview.b2()) {
				theview.b2().setText(themodel.countValue(count));
				theview.b2().setEnabled(false);
			}
			if(e.getSource()==theview.b3()) {
				theview.b3().setText(themodel.countValue(count));
				theview.b3().setEnabled(false);
			}
			if(e.getSource()==theview.b4()) {
				theview.b4().setText(themodel.countValue(count));
				theview.b4().setEnabled(false);
			}
			if(e.getSource()==theview.b5()) {
				theview.b5().setText(themodel.countValue(count));
				theview.b5().setEnabled(false);
			}
			if(e.getSource()==theview.b6()) {
				theview.b6().setText(themodel.countValue(count));
				theview.b6().setEnabled(false);
			}
			if(e.getSource()==theview.b7()) {
				theview.b7().setText(themodel.countValue(count));
				theview.b7().setEnabled(false);
			}
			if(e.getSource()==theview.b8()) {
				theview.b8().setText(themodel.countValue(count));
				theview.b8().setEnabled(false);
			}
			if(e.getSource()==theview.b9()) {
				theview.b9().setText(themodel.countValue(count));
				theview.b9().setEnabled(false);
			}
	
	//get the string value in button
		
			s[0]=theview.getb1();
			s[1]=theview.getb2();
			s[2]=theview.getb3();
			s[3]=theview.getb4();
			s[4]=theview.getb5();
			s[5]=theview.getb6();
			s[6]=theview.getb7();
			s[7]=theview.getb8();
			s[8]=theview.getb9();
	
//decide whether win or draw.give result in different window
			if (themodel.setWin(s)==true) {
				theview.getwinner(themodel.countValue(count)); //window to giving winner and decision about game continue
				count=0; //as count is static variable at the end of round count set to 0
				reset_array(); //end of a round string array must be cleared

			}
		//if there is no winner but all the boxes of the grid are filled result is draw. game round must finish
			else if(themodel.setWin(s)==false&& count==9) {
				theview.draw(); //window to say draw and decision about game continue
				count=0; //as count is static variable at the end of round count set to 0
				reset_array();  //end of a round string array must be cleared
	
			}
		}		
	
	}
	
	//this method clear the values in array which use to store values in the buttons
	public void reset_array() {
		for(int i=0;i<9;i++) {
			s[i]="";
		}
	}
}

