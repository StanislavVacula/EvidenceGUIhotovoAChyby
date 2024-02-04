import java.util.ArrayList;
import java.util.List;

public class EvidenceDeskovek {
    private List<Deskovka> seznamDeskovek = new ArrayList<>();

    public EvidenceDeskovek() {
        seznamDeskovek.add(new Deskovka("Šachy", false, 1));
        seznamDeskovek.add(new Deskovka("Pexeso", false, 1));
        seznamDeskovek.add(new Deskovka("Karty", false, 1));
    }

    public Deskovka vratDeskovku(int index) {
        return seznamDeskovek.get(index);
    }

}
