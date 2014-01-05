package remove_array_element;




import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class NupudJaPildid {
        public static void start(String[] a) {
                JFrame f = new JFrame();
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.add(new ButtonDemo());
                f.setSize(550, 200);
                f.setMaximizedBounds(null);
                f.setVisible(true);
        }

}

class ButtonDemo extends JPanel implements ActionListener {
        /**
	 * 
	 */
	private static final long serialVersionUID = 2612823715528142733L;
		JTextField jtf;

        public ButtonDemo() {
                try {
                        makeGUI();
                } catch (Exception exc) {
                        System.out.println("Can't create because of " + exc);
                }
        }

        private void makeGUI() {
                setLayout(new FlowLayout());

                ImageIcon Kaart1 = new ImageIcon(
                                "D:/temp/kaardid/2/joker/jokerb.png");
                JButton jb = new JButton(Kaart1);
                jb.setSize(0,0);
                jb.setActionCommand("Black Joker");
                jb.addActionListener(this);
                jb.setMargin (new Insets (0, 0, 0, 0));
                jb.setBorder (null);
                add(jb);

                ImageIcon India = new ImageIcon(
                                "D:/temp/kaardid/2/joker/jokerr.png");
                jb = new JButton(India);
                jb.setActionCommand("Red Joker");
                jb.setMargin (new Insets (0, 0, 0, 0));
                jb.setBorder (null);
                jb.addActionListener(this);
                add(jb);

                ImageIcon srilanka = new ImageIcon(
                                "E:/ankit_tutorial/java/Flags/srilanka.gif");
                jb = new JButton(srilanka);
                jb.setActionCommand("Srilanka");
                jb.addActionListener(this);
                add(jb);

                ImageIcon UK = new ImageIcon("E:/ankit_tutorial/java/Flags/UK.jpg");
                jb = new JButton(UK);
                jb.setActionCommand("UK");
                jb.addActionListener(this);
                add(jb);

                jtf = new JTextField(15);
                add(jtf);
        }

        public void actionPerformed(ActionEvent ae) {
                jtf.setText(ae.getActionCommand());
        }
}