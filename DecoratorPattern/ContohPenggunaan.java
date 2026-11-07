public class ContohPenggunaan {
    public static void main(String[] args) {
        Minuman pesanan = new KopiTubruk();

        pesanan = new Krim(pesanan);
        pesanan = new Cokelat(pesanan);
        pesanan = new Cokelat(pesanan);

        System.out.println(pesanan.deskripsi());
        System.out.println(pesanan.harga());
    }
}