package pboif2.pkg10119065.latihan58.tambahkurang;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program Tambah Kurang dengan objek
 */
public class JumlahBilangan extends Bilangan {
    public void tampilHasilJumlah(){
        int x = getX();
        int y = getY();
        int jumlah = x + y;
        System.out.printf("Hasil Perjumlahan %d + %d = %d\n",x, y, jumlah);
    }
}
