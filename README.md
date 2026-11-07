# Studi Kasus Pola Perancangan: Decorator & Composite Pattern (Java)

Repositori ini berisi implementasi studi kasus **Structural Design Patterns** menggunakan bahasa pemrograman **Java** untuk mata kuliah **Pola Perancangan**, yang mencakup **Decorator Pattern** dan **Composite Pattern**.

---

## 📂 Struktur Direktori

```text
.
├── CompositePattern/
│   ├── ButirMenu.java
│   ├── ContohPenggunaan.java
│   ├── KomponenMenu.java
│   └── Menu.java
├── DecoratorPattern/
│   ├── Cokelat.java
│   ├── ContohPenggunaan.java
│   ├── KopiTubruk.java
│   ├── Krim.java
│   ├── Minuman.java
│   └── TambahanMinuman.java
└── README.md
```

---

## 1. Case Study: Decorator Pattern (`DecoratorPattern/`)

### Deskripsi Studi Kasus
Mengimplementasikan perhitungan harga dan deskripsi pesanan minuman secara dinamis menggunakan **Decorator Pattern**. Pelanggan dapat memesan minuman dasar (`KopiTubruk`) lalu membungkusnya (*wrap*) dengan berbagai tambahan *topping* (`Krim`, `Cokelat`) secara berlapis tanpa mengubah kelas minuman dasar.

### Komponen Kelas
* **`Minuman.java`** *(Component)*: Kelas abstrak dasar yang mendefinisikan metode `deskripsi()` dan `harga()`.
* **`KopiTubruk.java`** *(Concrete Component)*: Implementasi minuman dasar dengan harga awal `Rp8.000`.
* **`TambahanMinuman.java`** *(Decorator)*: Kelas abstrak pembungkus yang menyimpan referensi objek `Minuman`.
* **`Krim.java`** *(Concrete Decorator)*: Menambahkan deskripsi `", krim"` dan biaya tambahan `+Rp3.000`.
* **`Cokelat.java`** *(Concrete Decorator)*: Menambahkan deskripsi `", cokelat"` dan biaya tambahan `+Rp4.000`.
* **`ContohPenggunaan.java`** *(Client / Main)*: Mensimulasikan pesanan **Kopi Tubruk + Krim + Cokelat (2x)**.

### Cara Menjalankan
```bash
cd DecoratorPattern
javac *.java
java ContohPenggunaan
```

### Hasil Keluaran (Output)
```text
Kopi tubruk, krim, cokelat, cokelat
19000.0
```

---

## 2. Case Study: Composite Pattern (`CompositePattern/`)

### Deskripsi Studi Kasus
Mengimplementasikan struktur hierarki menu restoran menggunakan **Composite Pattern** agar objek satuan (*Leaf* / item menu) dan kumpulan objek (*Composite* / kategori menu dan sub-menu) dapat diperlakukan secara seragam. Seluruh pohon menu dapat dicetak secara rekursif hanya dengan satu pemanggilan metode `cetak()` pada menu utama.

### Komponen Kelas
* **`KomponenMenu.java`** *(Component)*: Kelas abstrak yang mendefinisikan antarmuka bersama `cetak()` dan `tambah(KomponenMenu k)`.
* **`ButirMenu.java`** *(Leaf)*: Merepresentasikan item menu satuan yang memiliki atribut `nama` dan `harga`.
* **`Menu.java`** *(Composite)*: Menyimpan daftar `KomponenMenu` (`anak`) di dalam `ArrayList` dan meneruskan pemanggilan `cetak()` secara rekursif ke seluruh anggotanya.
* **`ContohPenggunaan.java`** *(Client / Main)*: Membangun pohon hierarki `Menu Restoran` $\rightarrow$ `Makan Siang` (`Nasi Goreng`, `Ayam Bakar`) $\rightarrow$ `Penutup` (`Es Krim`).

### Cara Menjalankan
```bash
cd CompositePattern
javac *.java
java ContohPenggunaan
```

### Hasil Keluaran (Output)
```text
Menu Restoran
Makan Siang
Nasi Goreng - Rp20000.0
Ayam Bakar - Rp25000.0
Penutup
Es Krim - Rp12000.0
```
