import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class EvidenceDeskovek {
    private final ArrayList<Deskovka> seznamDeskovek = new ArrayList<>();
    public EvidenceDeskovek() {
        cteniZeSouboru();
    }
    private void cteniZeSouboru() {
        try (Scanner sc = new Scanner(new BufferedReader(new FileReader("deskovky.txt")))) {
            while (sc.hasNextLine()) {
                String radek = sc.nextLine();
                String[] polozky = radek.split(";");
                String nazev = polozky[0];
                boolean zakoupeno = polozky[1].equals("ano");
                int oblibenost = Integer.parseInt(polozky[2]);
                seznamDeskovek.add(new Deskovka(nazev, zakoupeno, oblibenost));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public Deskovka vratDeskovku(int index) {
        return seznamDeskovek.get(index);
    }
}
