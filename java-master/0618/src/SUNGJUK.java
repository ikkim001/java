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
				
				
				};
				String[] title = {"이름","국어","수학","영어"};
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