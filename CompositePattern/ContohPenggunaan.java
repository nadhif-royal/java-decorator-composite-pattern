public class ContohPenggunaan {
    public static void main(String[] args) {
        Menu utama = new Menu("Menu Restoran");
        Menu siang = new Menu("Makan Siang");
        Menu penutup = new Menu("Penutup");

        siang.tambah(new ButirMenu("Nasi Goreng", 20000));
        siang.tambah(new ButirMenu("Ayam Bakar", 25000));

        penutup.tambah(new ButirMenu("Es Krim", 12000));
        siang.tambah(penutup);

        utama.tambah(siang);

        utama.cetak();
    }
}