package org.dav.learn.corejavabook;

import javax.swing.*;
import java.awt.*;
import java.text.DateFormat;
import java.util.Date;

public class FormattedFieldsFrame extends JFrame
{
	private JFormattedTextField textField;
	private JButton button;

	public FormattedFieldsFrame()
	{
		JPanel dataPanel = new JPanel();
		textField = new JFormattedTextField(DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL));
		textField.setValue(new Date());
		dataPanel.add(textField);
		add(dataPanel, BorderLayout.CENTER);

		JPanel commandPanel = new JPanel();
		button = new JButton("Show");
		button.addActionListener(event ->
			JOptionPane.showMessageDialog(this, textField.getValue(), "Info", JOptionPane.INFORMATION_MESSAGE));
		commandPanel.add(button);
		add(commandPanel, BorderLayout.SOUTH);

		pack();
	}
}
