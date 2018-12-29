package org.dav.learn.corejavabook;

import javax.swing.*;
import java.awt.*;
import java.text.ParseException;

public class FrameTest
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run()
            {
                JFrame frame = null;
                frame = new SplittedFrame();
                frame.setTitle("Testing...");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}
