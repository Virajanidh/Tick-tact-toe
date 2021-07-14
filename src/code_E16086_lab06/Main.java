package code_E16086_lab06;

public class Main {
	public static void main(String[] args) {
		TicView theview= new TicView();
		TicModel themodel=new TicModel();
		@SuppressWarnings("unused")
		TicController thecontroller =new TicController(theview,themodel);
		theview.setVisible(true); //set the play board visible
	}
}
