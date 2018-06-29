import java.awt.BorderLayout;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.BoxLayout;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.JScrollPane;

import javax.swing.JTable;

import javax.swing.JTextField;

import javax.swing.table.DefaultTableModel;

public class asasdasdsa {

	static class mygui extends JFrame {

		mygui(){

 

			JPanel panel = new JPanel();

 

			JPanel panelA = new JPanel();

 

			JPanel panelB = new JPanel();

 

			JPanel panelc = new JPanel();

 

			JPanel paneld = new JPanel();

 

			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 

			setTitle("제목");

 

			

 

			setSize(400,300);

 

			

 

			

 

		String tabel[]={"이름","국어","수학","영어"};

 

		String num[][]={

 

				{"a","b","c","d"},

 

				{"a","b","c","d"},

 

				{"a","b","c","d"},

 

		};

 

		DefaultTableModel model=new DefaultTableModel(num, tabel);

 

		JTable table1=new JTable(model);

 

		JScrollPane scp=new JScrollPane(table1);

 

		

 

		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

 

	  

 

			JTextField label1 = new JTextField(3);

 

			JTextField label2 = new JTextField(3);

 

			JTextField label3 = new JTextField(3);

 

			JTextField label4 = new JTextField(3);

 

		

 

			panel.add(label1);

 

			panel.add(label2);

 

			panel.add(label3);

 

			panel.add(label4);

 

			

 

			JButton button1 = new JButton("저장");

 

			button1.addActionListener(new ActionListener() {

 

				

 

				@Override

 

				public void actionPerformed(ActionEvent e) {

 

					// TODO Auto-generated method stub

 

					String str[]=new String[4];

 

					

 

					str[0]=label1.getText();

 

					str[1]=label2.getText();

 

					str[2]=label3.getText();

 

					str[3]=label4.getText();

 

				model.addRow(str);

 

					

 

				label1.setText("");

 

				label2.setText("");

 

				label3.setText("");

 

				label4.setText("");

 

				}

 

			});

 

			JButton dbutton=new JButton("삭제");

 

			dbutton.addActionListener(new ActionListener() {

 

				

 

				@Override

 

				public void actionPerformed(ActionEvent e) {

 

					// TODO Auto-generated method stub

 

					if(table1.getSelectedRow()==-1)

 

					{

 

						return;

 

					}

 

					else{

 

						model.removeRow(table1.getSelectedRow());

 

					}

 

				}

			});
