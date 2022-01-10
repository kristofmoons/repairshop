package repairshop;

import javax.swing.*;

public class RepshopGui {
    private JPanel paneelRepShop;
    private JButton button1;
    private JList list1;

    public void run() {
        JFrame frame = new JFrame();

        frame.setContentPane(paneelRepShop);
        frame.setTitle("personen beheren");
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}
