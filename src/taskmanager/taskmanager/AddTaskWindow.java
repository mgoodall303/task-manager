package taskmanager;

import java.awt.BorderLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class AddTaskWindow extends JFrame {
	
	JLabel taskDescriptionLabel;
	JTextArea taskDescriptionText;
	
	JLabel dayLabel;
	JTextArea dayText;
	
	JLabel monthLabel;
	JComboBox<Months> monthSelector;
	
	JLabel yearLabel;
	JTextArea yearText;
	
	JLabel difficultyLabel;
	JComboBox<Difficulty> difficultySelector;
	
	public AddTaskWindow() {
		
		JPanel panel = new JPanel(new BorderLayout());
		
		JPanel top = new JPanel();
		JPanel middle = new JPanel();
		JPanel bottom = new JPanel();
		
		taskDescriptionLabel = new JLabel("Task description: ");
		taskDescriptionText = new JTextArea(10, 20);
		
		top.add(taskDescriptionText);
		top.add(taskDescriptionText);
		
		JLabel dueDateLabel = new JLabel("Due Date (optional)");
		dayLabel = new JLabel("Day: ");
		dayText = new JTextArea(1, 3);
		
		monthLabel = new JLabel("Month: ");
		monthSelector = new JComboBox<Months>(Months.values());
		
		yearLabel = new JLabel("Year: ");
		yearText = new JTextArea(1, 4);
		
		middle.add(dueDateLabel);
		middle.add(dayText);
		middle.add(dayText);
		middle.add(monthLabel);
		middle.add(monthSelector);
		middle.add(yearLabel);
		middle.add(yearText);
		
		difficultyLabel = new JLabel("Difficulty");
		difficultySelector = new JComboBox<Difficulty>(Difficulty.values());
		
		bottom.add(difficultyLabel);
		bottom.add(difficultySelector);
		
		panel.add(top, BorderLayout.NORTH);
		panel.add(middle, BorderLayout.CENTER);
		panel.add(bottom, BorderLayout.SOUTH);
		
		getContentPane().add(panel);
		
		setSize(300,300);
		
		setVisible(true);
		
		
		
	}

}
