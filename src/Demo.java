import javax.swing.*;

public class Demo extends JFrame {
    private JTextField textField1;
    private JButton predchoziButton;
    private JButton dalsiButton;
    private JButton ulozitButton;
    private JCheckBox koupenoCheckBox;
    private JRadioButton oblibenost1;
    private JRadioButton oblibenost2;
    private JRadioButton oblibenost3;
    private JPanel panelMain;

    ButtonGroup group = new ButtonGroup();
    private int indexAktualniDeskovky = 0;
    EvidenceDeskovek evidenceDeskovek = new EvidenceDeskovek();

    public Demo() {
        initComponents();
        predchoziButton.addActionListener(e -> ubraniAkce());
        dalsiButton.addActionListener(e -> pridaniAkce());
        ulozitButton.addActionListener(e -> ulozenoAkce());
    }

    public void ubraniAkce() {
        indexAktualniDeskovky--;
        zobrazDeskovku();
    }

    public void pridaniAkce() {
        indexAktualniDeskovky++;
        zobrazDeskovku();
    }

    public void ulozenoAkce() {
        JOptionPane.showMessageDialog(this, "Odpovědi byli uloženy!");
    }

    public void initComponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        group.add(oblibenost1);
        group.add(oblibenost2);
        group.add(oblibenost3);
        setContentPane(panelMain);
        zobrazDeskovku();
        pack();
        setTitle("Otázky");
    }

    public void zobrazDeskovku() {
        Deskovka aktualniDeskovka = evidenceDeskovek.vratDeskovku(indexAktualniDeskovky);
        textField1.setText(aktualniDeskovka.getNazevDeskovky());
        koupenoCheckBox.setSelected(aktualniDeskovka.isKoupeno());
            if (aktualniDeskovka.getOblibenost() == 1) {
                oblibenost1.setSelected(true);
            } else if (aktualniDeskovka.getOblibenost() == 2) {
                oblibenost2.setSelected(true);
            } else if (aktualniDeskovka.getOblibenost() == 3) {
                oblibenost3.setSelected(true);
            }
        }
    }


