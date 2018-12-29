package org.dav.learn.corejavabook;

import javax.swing.*;
import java.awt.*;

public class SplittedFrame extends JFrame
{
	public SplittedFrame()
	{
		setSize(300, 300);

		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, new JLabel("Left"), new JLabel("Right"));
		add(splitPane, BorderLayout.CENTER);

		splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, new JLabel("Top"), new JLabel("Bottom"));
		add(splitPane, BorderLayout.SOUTH);

		pack();
	}
}
