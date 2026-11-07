import java.util.List;
import java.util.ArrayList;

public class Menu extends KomponenMenu {
    private final String nama;
    private final List<KomponenMenu> anak = new ArrayList<>();

    public Menu(String nama) {
        this.nama = nama;
    }

    @Override
    public void tambah(KomponenMenu k) {
        anak.add(k);
    }

    @Override
    public void cetak() {
        System.out.println(nama);
        for (KomponenMenu k : anak) {
            k.cetak();
        }
    }
}