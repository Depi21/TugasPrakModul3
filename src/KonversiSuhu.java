/**
 * Kelas KonversiSuhu digunakan untuk mengkonversi suhu antara Celcius, Fahrenheit, dan Kelvin.
 */
public class KonversiSuhu {
    private double suhu;
    private String satuanAwal;

    /**
     * Konstruktor untuk kelas KonversiSuhu.
     * @param suhu Suhu awal yang akan dikonversi.
     * @param satuanAwal Satuan suhu awal (misalnya, "Celcius", "Fahrenheit", "Kelvin").
     */
    public KonversiSuhu(double suhu, String satuanAwal) {
        this.suhu = suhu;
        this.satuanAwal = satuanAwal;
    }

    /**
     * Mengkonversi suhu ke Celcius.
     * @return Nilai suhu dalam satuan Celcius.
     */
    public double keCelcius() {
        if (satuanAwal.equals("Fahrenheit")) {
            return (suhu - 32) * 5/9;
        } else if (satuanAwal.equals("Kelvin")) {
            return suhu - 273.15;
        } else {
            return suhu;
        }
    }

    /**
     * Mengkonversi suhu ke Fahrenheit.
     * @return Nilai suhu dalam satuan Fahrenheit.
     */
    public double keFahrenheit() {
        if (satuanAwal.equals("Celcius")) {
            return (suhu * 9/5) + 32;
        } else if (satuanAwal.equals("Kelvin")) {
            return (suhu - 273.15) * 9/5 + 32;
        } else {
            return suhu;
        }
    }

    /**
     * Mengkonversi suhu ke Kelvin.
     * @return Nilai suhu dalam satuan Kelvin.
     */
    public double keKelvin() {
        if (satuanAwal.equals("Celcius")) {
            return suhu + 273.15;
        } else if (satuanAwal.equals("Fahrenheit")) {
            return (suhu - 32) * 5/9 + 273.15;
        } else {
            return suhu;
        }
    }

    public static void main(String[] args) {
        // Contoh penggunaan:
        KonversiSuhu konversi = new KonversiSuhu(100, "Celcius");
        System.out.println("Celcius ke Fahrenheit: " + konversi.keFahrenheit());
        System.out.println("Celcius ke Kelvin: " + konversi.keKelvin());

        konversi = new KonversiSuhu(212, "Fahrenheit");
        System.out.println("Fahrenheit ke Celcius: " + konversi.keCelcius());
        System.out.println("Fahrenheit ke Kelvin: " + konversi.keKelvin());

        konversi = new KonversiSuhu(300, "Kelvin");
        System.out.println("Kelvin ke Celcius: " + konversi.keCelcius());
        System.out.println("Kelvin ke Fahrenheit: " + konversi.keFahrenheit());
    }
}