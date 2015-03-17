import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ThreeMax {
	public static void main(String[] args) {
		JFrame jframe = new JFrame("求最大值");	    
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
		JLabel label1 = new JLabel("数字1");
		JLabel label2 = new JLabel("数字2");
		JLabel label3 = new JLabel("数字3");
		final JLabel label4 = new JLabel("最大值为：");
		
		final JTextField textField1 = new JTextField(10);
		final JTextField textField2 = new JTextField(10);
		final JTextField textField3 = new JTextField(10);
		
		JButton button1 = new JButton("求最大值");		
		
		jframe.setLayout(new GridLayout(5, 1));
		
		jframe.add(panel1);
		panel1.add(label1);
		panel1.add(textField1);
		
		jframe.add(panel2);
		panel2.add(label2);
		panel2.add(textField2);
		
		jframe.add(panel3);
		panel3.add(label3);
		panel3.add(textField3);
		
		jframe.add(panel4);
		panel4.add(label4);
		
		jframe.add(panel5);
		panel5.add(button1);
		
		jframe.setLocationRelativeTo(null);
	    jframe.setSize(300, 300);
	    jframe.setVisible(true);
	    
	    button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int num1,num2,num3,max;									

				String string1=textField1.getText();
				String string2=textField2.getText();
				String string3=textField3.getText();
				
				if(!string1.matches("^[0-9+-]+$")){
					JOptionPane.showMessageDialog(null, "请输入数字1！", "提示", JOptionPane.INFORMATION_MESSAGE);					
					return;
				}else if (!string2.matches("^[0-9-+]+$")) {
					JOptionPane.showMessageDialog(null, "请输入数字2！", "提示", JOptionPane.INFORMATION_MESSAGE);
					return;
				}else if (!string3.matches("^[0-9-+]+$")) {
					JOptionPane.showMessageDialog(null, "请输入数字3！", "提示", JOptionPane.INFORMATION_MESSAGE);
					return;
				}				
								
				num1 = Integer.parseInt(string1);
				num2 = Integer.parseInt(string2);
				num3 = Integer.parseInt(string3);	
				
				if(num1<-10000 || num1>10000 || num2<-10000 || num2>10000 || num3<-10000 || num3>10000){
					JOptionPane.showMessageDialog(null, "请输入-10000至+10000之间的数字！", "提示", JOptionPane.INFORMATION_MESSAGE);
					return;
				}
				
				if(num1>=num2){
					max = num1;
				}
				else {
					max = num2;
				}				
				if(num3 > max){
					max = num3;
				}
				
				label4.setText("最大值为："+max);
			}
		});	    
	}	
}
