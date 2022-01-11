package repairshop;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RepshopGui {
    private JPanel paneelRepShop;
    private JButton nieuweKlantButton;
    private JButton button2;
    private JTextField telefoontextfield;
    private JTextField emailtextfield;
    private JTextField naamtextfield;
    private JTextField voornaamtextfield;
    private JList list1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton nieuweItemButton;
    private JList list2;
    private Repairshop repairshop = new Repairshop();
    private DefaultListModel<String> lijstPersonen = new DefaultListModel<>();


    public RepshopGui() {
        list1.setModel(lijstPersonen);

        nieuweKlantButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String naam = naamtextfield.getText();
                String voornaam = voornaamtextfield.getText();
                String telefoon = telefoontextfield.getText();
                String email = emailtextfield.getText();
                Klant klant = new Klant(naam, voornaam, telefoon,email);
                voegToe(klant);

            }
        });

        list1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });
    }

    public void voegToe(Klant klant){
        repairshop.voegKlantToe(klant);
        lijstPersonen.removeAllElements();
        for (Klant k : repairshop.getContacten().values()){
            System.out.println(k);
            lijstPersonen.addElement(k.getNaam()+" "+k.getVoornaam());
        }



    }

    public void run() {
        JFrame frame = new JFrame();

        frame.setContentPane(paneelRepShop);
        frame.setTitle("personen beheren");
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}
