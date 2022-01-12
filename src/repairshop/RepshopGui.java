package repairshop;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Iterator;

public class RepshopGui {
    private JPanel paneelRepShop;
    private JButton nieuweKlantButton;
    private JButton maakEenCsvAanButton;
    private JTextField telefoontextfield;
    private JTextField emailtextfield;
    private JTextField naamtextfield;
    private JTextField voornaamtextfield;
    private JList list1;
    private JTextField textFieldNaamItem;
    private JTextField textFieldProbleem;
    private JTextField textFieldPrijsrestauratie;
    private JTextField textFieldstatus;
    private JButton nieuweItemButton;
    private JList list2;
    private Repairshop repairshop = new Repairshop();
    private DefaultListModel<String> lijstPersonen = new DefaultListModel<>();
    private DefaultListModel<String> lijstItems = new DefaultListModel<>();


    public RepshopGui() {
        list1.setModel(lijstPersonen);
        list2.setModel(lijstItems);

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
        maakEenCsvAanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                repairshop.ExportToCSV();
            }
        });

        nieuweItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String naam = textFieldNaamItem.getText();
                String probleem = textFieldProbleem.getText();
                double prijsrestauratie = Double.parseDouble(textFieldPrijsrestauratie.getText());
                String status = textFieldstatus.getText();
                Item item = new Item(naam, probleem, prijsrestauratie,status);
//                voegToe(item);
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

    public void voegItemToe(Item item){
        repairshop.wachtrij(item);
        lijstItems.removeAllElements();

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
