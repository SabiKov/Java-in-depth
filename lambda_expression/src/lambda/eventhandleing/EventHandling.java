package lambda.eventhandleing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EventHandling extends JFrame {
	
	public EventHandling(String s) {
		super(s);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 300);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setSize(400, 300);
		panel.setLayout(null);
		getContentPane().add(panel);
		
		JButton old = new JButton("Old Way");
		old.setSize(120, 30);
		old.setLocation(20, 20);
		panel.add(old);
		
		JButton lambda = new JButton("Lambda Way");
		lambda.setSize(120, 30);
		lambda.setLocation(20, 60);
		panel.add(lambda);
		
		JLabel label = new JLabel("Output: ");
		label.setSize(250, 50);
		label.setLocation(20, 160);
		panel.add(label);
		
		//old way Before Java 8
		old.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("Output: Event handeled the old way ...");
				
			}
		});
		
		// new way, Java 8 Lambda way
		lambda.addActionListener((e) -> label.setText("Output: Event handeled the lambda way ..."));
		
	}

	public static void main(String[] args) {
		
		EventHandling frame = new EventHandling("Old way vs. Lambda way");
		frame.setVisible(true);
	}

}
