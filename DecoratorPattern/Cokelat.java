public class Cokelat extends TambahanMinuman {
    public Cokelat(Minuman dasar) {
        super(dasar);
    }

    @Override
    public String deskripsi() {
        return dasar.deskripsi() + ", cokelat";
    }

    @Override
    public double harga() {
        return dasar.harga() + 4000;
    }
}