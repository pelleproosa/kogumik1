package remove_array_element;

/*
 * BorderLayoutDemo.java is a 1.4 application that requires no other files.
 */

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

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

        GridLayout ruudustik = new GridLayout(0,13,0, 0);
      JPanel kaardikesed = new JPanel();
      kaardikesed.setLayout(ruudustik);
      JButton nuppudeformaat= new JButton("nuppudeformaat");
      nuppudeformaat.setPreferredSize(new Dimension(0, 0));
      nuppudeformaat=new JButton("Nupuke1");
      kaardikesed.add(nuppudeformaat);
      nuppudeformaat=new JButton("Nupuke2");
      kaardikesed.add(nuppudeformaat);
      nuppudeformaat=new JButton("Nupuke3");
      kaardikesed.add(nuppudeformaat);
      nuppudeformaat=new JButton("Nupuke4");
      kaardikesed.add(nuppudeformaat);
      nuppudeformaat=new JButton("Nupuke5");
      kaardikesed.add(nuppudeformaat);
      nuppudeformaat=new JButton("Nupuke6");
      kaardikesed.add(nuppudeformaat);
      nuppudeformaat=new JButton("Nupuke7");
      kaardikesed.add(nuppudeformaat);
      nuppudeformaat=new JButton("Nupuke8");
      kaardikesed.add(nuppudeformaat);
      nuppudeformaat=new JButton("Nupuke9");
      kaardikesed.add(nuppudeformaat);
      nuppudeformaat=new JButton("Nupuke10");
      kaardikesed.add(nuppudeformaat);
      nuppudeformaat=new JButton("Nupuke11");
      kaardikesed.add(nuppudeformaat);
      nuppudeformaat=new JButton("Nupuke12");
      kaardikesed.add(nuppudeformaat);
      nuppudeformaat=new JButton("Nupuke13");
      kaardikesed.add(nuppudeformaat);
     // nuppudeformaat.setPreferredSize(new Dimension(0, 0));
      kaardikesed.add(nuppudeformaat);
      jbnSampleButtons.setPreferredSize(new Dimension(200, 100));
        
        
        
        contentPane.add(kaardikesed, BorderLayout.CENTER);

        
        
         
        
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
