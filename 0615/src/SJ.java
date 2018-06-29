import java.awt.*;
import javax.swing.*;

public class SJ {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(EXIT_ON_CLOSE);

			setSize(300, 500);
			setTitle("연습");

			setLayout(new BorderLayout());
			JButton button = new JButton("과목");
			this.add(button);
			setVisible(true);

		}
	}

}
