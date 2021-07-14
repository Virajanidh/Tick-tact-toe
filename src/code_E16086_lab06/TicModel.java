package code_E16086_lab06;

/*----------------------------------
do the calculations
 ->select winner
 ->select who players the game
---------------------------------*/


public class TicModel {
	
	String s=""; //to get player number
	private boolean win=false;  
	
	
	public String countValue(int count) {
		//select the played user 1 or 2.player 1 always start the game 
		if(count%2==1)s="1" ;
		if(count%2==0)s= "2";
		return s;
	}
	public boolean setWin(String [] b) {
		//compare and check if column or row or diagonal has the same string value
		//if it exists game win by the user who did the last selection 
		if(b[0]==b[1]&&b[1]==b[2]&&b[0]!="") {
			win = true;
		}
		else if(b[3]==b[4]&&b[4]==b[5]&&b[3]!="") {
			win = true;
		}
		else if(b[6]==b[7]&&b[7]==b[8]&&b[6]!="") {
			win = true;
		}
		else if(b[0]==b[4]&&b[4]==b[8]&&b[0]!="") {
			win = true;
		}
		else if(b[2]==b[4]&&b[4]==b[6]&&b[2]!="") {
			win = true;
		}
		else if(b[0]==b[3]&&b[3]==b[6]&&b[0]!="") {
			win = true;
			}
		else if(b[1]==b[4]&&b[4]==b[7]&&b[1]!="") {
			win = true;
		}
		else if(b[2]==b[5]&&b[5]==b[8]&&b[2]!="") {
			win = true;
		}
		else {
			win=false;
		}
			
		return win;
		
	}

}
