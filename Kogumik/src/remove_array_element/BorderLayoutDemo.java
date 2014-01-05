package remove_array_element;

/*
 * BorderLayoutDemo.java is a 1.4 application that requires no other files.
 */

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BorderLayoutDemo {
    public static boolean RIGHT_TO_LEFT = false;

    public static void addComponentsToPane(Container contentPane) {
//    	Use BorderLayout. Default empty constructor with no horizontal and vertical
//    	gaps
    	contentPane.setLayout(new BorderLayout(0,0)); // siin valin horisontaal- ja vertikaalvahe nuppudele
        if (!(contentPane.getLayout() instanceof BorderLayout)) {
            contentPane.add(new JLabel("Container doesn't use BorderLayout!"));
            return;
        }

        if (RIGHT_TO_LEFT) {
            contentPane.setComponentOrientation(
                java.awt.ComponentOrientation.RIGHT_TO_LEFT);
        }

        JButton jbnSampleButtons = new JButton("Button 1 (PAGE_START)");
        contentPane.add(jbnSampleButtons, BorderLayout.PAGE_START);

        
        
        jbnSampleButtons = new JButton("Button 2 (CENTER)");
        jbnSampleButtons.setPreferredSize(new Dimension(200, 100));
        contentPane.add(jbnSampleButtons, BorderLayout.CENTER);

        
        
         
        
        jbnSampleButtons = new JButton("Button 3 (LINE_START)");
        contentPane.add(jbnSampleButtons, BorderLayout.LINE_START);
        
        
        
        ImageIcon Kaart1 = new ImageIcon(
                "D:/temp/kaardid/2/joker/jokerb.png");
        jbnSampleButtons.setSize(50, 50);
        jbnSampleButtons = new JButton( Kaart1);
        
        
        
        contentPane.add(jbnSampleButtons, BorderLayout.PAGE_END);

        jbnSampleButtons = new JButton("5 (LINE_END)");
        contentPane.add(jbnSampleButtons, BorderLayout.LINE_END);
    }

    private static void createAndShowGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);

        JFrame frame = new JFrame("BorderLayout Source Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Set up the content pane and add swing components to it
        addComponentsToPane(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    public static void start(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
