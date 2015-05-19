import javax.swing.JFrame;
public class Window extends JFrame {
	public Window(){
		setTitle("Baffle Box");
		Screen screen = new Screen();
		add(screen);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	public static void main(String[] args){
		Window window = new Window();
	}
}
