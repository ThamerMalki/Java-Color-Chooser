import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class MyFrame implements ActionListener{

	JButton button = new JButton("Pick a color");
	JLabel label = new JLabel();
	
	MyFrame(){
		
		JFrame frame = new JFrame("Color Chooser");
		button.addActionListener(this);
		
		label.setText("Random Text");
		label.setFont(new Font("MV Boli",Font.BOLD,35));
		
		frame.setSize(450,450);
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(button);
		frame.add(label);
		frame.setVisible(true);
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button) {
			Color color = JColorChooser.showDialog(null, "Choose a color", Color.BLACK);
			label.setForeground(color);
		}
	}

}
