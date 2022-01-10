package repairshop;

import javax.swing.*;

public class KlantPanel {
    private JPanel panel;
    private JLabel voornaam;
    private JLabel naam;
    private JLabel telefoon;
    private JLabel email;

    public KlantPanel(Klant klant) {

        voornaam.setText(klant.getVoornaam());
        naam.setText(klant.getNaam());
        telefoon.setText(klant.getTelefoon());
        email.setText(klant.getEmail());

    }

    public JFrame run() {
        JFrame frame = new JFrame();
        frame.setContentPane(panel);
        frame.setTitle("Klant");
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        return frame;
    }
}