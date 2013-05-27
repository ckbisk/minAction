package minimal.key.action;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Frame extends JFrame {


	public static void main(String[] args) {
		// Use the event dispatch thread to build the UI since its the one that runs it.
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Frame();
			}
		});
	}
	
	private Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setLocationRelativeTo(null);
		Panel panel = new Panel();
		setContentPane(panel);
		setVisible(true);
	}

	private static final long serialVersionUID = 1L;
}
