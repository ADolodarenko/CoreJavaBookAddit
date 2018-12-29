package org.dav.learn.corejavabook;

import org.dav.learn.corejavabook.composite.CompositeTestFrame;

import javax.swing.*;
import java.awt.*;

public class WinMain
{
	public static void main(String[] args)
	{
		EventQueue.invokeLater(() ->
		{
			JFrame frame = new CompositeTestFrame();
			frame.setTitle("A composition test");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setLocationRelativeTo(null);
			frame.setVisible(true);
		});
	}
}
