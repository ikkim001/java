import java.awt.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class SUNGJUK {
		static class MyGUI extends JFrame {
			MyGUI() {
				setDefaultCloseOperation(EXIT_ON_CLOSE);

				setSize(300, 500);
				setTitle("sungjuk");
				setLayout(new GridLayout(4, 3, 20, 20));

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
				
				String[]fieldname={"��","��","��","��"};
				String[][] data={
						{},
						{},
						{},
						{},
				};
				
				table = new JTable(data,fieldname);
				JScrollPane sp = new JScrollPane(table);
				
				JLabel label2 = new JLabel();
				JTextField field1 = new JTextField(10);

				DefaultTableModel model = new DefaultTableModel();
				
				this.add(table);

				setVisible(true);

			}
		}
	



	public void main1(String[]args) {
		new MyGUI();	
	
	}
}
