import java.awt.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class SUNGJUK {
		static class MyGUI extends JFrame {
			MyGUI() {
				setDefaultCloseOperation(EXIT_ON_CLOSE);
				setTitle("sungjuk");
				setSize(300, 500);
				setLayout(new GridLayout(4, 3));
				GridLayout grid = new GridLayout(1, 2);

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
					
				JTable table;
				
				
				};
				String[] title = {"�̸�","����","����","����"};
				String[][] asd = {}; 
				JTable  table = new JTable(asd,title);
				JScrollPane sp = new JScrollPane(table);
				
				setVisible(true);
		
	
		}
}


	public void main1(String[]args) {
		new MyGUI();	
	
	}
}