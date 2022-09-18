import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class MyFrame extends JFrame implements ActionListener{

	JButton button = new JButton("Pick a color");
	JLabel label = new JLabel();
	
	MyFrame(){
		
		button.addActionListener(this);
		
		label.setText("Random Text");
		label.setFont(new Font("MV Boli",Font.BOLD,35));
		
		this.setSize(450,450);
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(button);
		this.add(label);
		this.setVisible(true);
		
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
