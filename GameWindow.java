import javax.swing.JFrame;
public class GameWindow extends JFrame {
	public GameWindow(){
		setTitle("Baffle Box");
		Screen screen = new Screen();
		add(screen);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}


}
