import java.awt.*;
import javax.swing.*;

public class SJ {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(EXIT_ON_CLOSE);

			setSize(300, 500);
			setTitle("����");

			setLayout(new BorderLayout());
			JButton button = new JButton("����");
			this.add(button);
			setVisible(true);

		}
	}

}
