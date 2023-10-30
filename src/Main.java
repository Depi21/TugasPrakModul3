import java.util.Scanner ;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {

    public String nama;
    public int tanggallahir;
    public int bulanlahir;
    public int tahunlahir;

    public void input() {
        Scanner scanner = new Scanner(in);
        out.print("Masukan nama : ");
        nama = scanner.nextLine();
        out.print("Masukan Tanggal Lahir : ");
        tanggallahir = scanner.nextInt();
        out.print("Masukan Bulan Lahir : ");
        bulanlahir = scanner.nextInt();
        out.print("Masukan Tahun Lahir : ");
        tahunlahir = scanner.nextInt();
    }
}