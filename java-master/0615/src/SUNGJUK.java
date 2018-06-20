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

				Button btn = new Button("이름");
				this.add(btn);

				JTextField tf = new JTextField("");
				this.add(tf);

				JButton btn4 = new JButton("이름");
				this.add(btn4);

				Button btn1 = new Button("국어");
				this.add(btn1);

				JTextField tf1 = new JTextField("");
				this.add(tf1);

				JButton btn5 = new JButton("수정");
				this.add(btn5);

				Button btn2 = new Button("영어");
				this.add(btn2);

				JTextField tf2 = new JTextField("");
				this.add(tf2);

				JButton btn6 = new JButton("삭제");
				this.add(btn6);

				Button btn3 = new Button("수학");
				this.add(btn3);

				JTextField tf3 = new JTextField("");
				this.add(tf3);

				JButton btn7 = new JButton("추가");
				this.add(btn7);
					
				JTable table;
				
				String[]fieldname={"가","나","다","라"};
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
