import java.awt.*;
import javax.swing.*;

public class SUNGJUK {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(EXIT_ON_CLOSE);


			setSize(300, 500);
			setTitle("sungjuk");
			setLayout(new GridLayout(4,3,20,20));
			
		
			
			Button btn = new Button("�̸�");
			this.add(btn);		
			
			
			JTextField tf = new JTextField("");
			this.add(tf);
			
			JButton btn4 = new JButton("�̸�");
			this.add(btn4);
		
		    
		    
			
			Button btn1 = new Button("����");
			this.add(btn1);
		
			
			JTextField tf1 = new JTextField("");
			this.add(tf1);
			
			JButton btn5 = new JButton("����");
			this.add(btn5);
		

			Button btn2 = new Button("����");
			this.add(btn2);
			
			
			JTextField tf2 = new JTextField("");
			this.add(tf2);

			JButton btn6 = new JButton("����");
			this.add(btn6);
			
			Button btn3 = new Button("����");
			this.add(btn3);
			
			
			
			JTextField tf3 = new JTextField("");
			this.add(tf3);
			
			JButton btn7 = new JButton("�߰�");
			this.add(btn7);
			
		
			

			JLabel label2 = new JLabel();
			JTextField field1 = new JTextField(10);
			
			JTable table;
			
			String fieldname={"�̸�,����,����,����"};
			String data[][] = new String[100][6];
			}
			
			
			
			
			
            pack();
			setVisible(true);

		}
	}
	public static void main(String[]args) {
		new MyGUI();	
		
	}

}
