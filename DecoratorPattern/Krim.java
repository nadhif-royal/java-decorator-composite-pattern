public class Krim extends TambahanMinuman {
    public Krim(Minuman dasar) {
        super(dasar);
    }

    @Override
    public String deskripsi() {
        return dasar.deskripsi() + ", krim";
    }

    @Override
    public double harga() {
        return dasar.harga() + 3000;
    }
}