# README.md
# Konversi Suhu

Kelas KonversiSuhu digunakan untuk mengkonversi suhu antara Celcius, Fahrenheit, dan Kelvin.

## Deskripsi

Kelas ini menyediakan metode untuk mengkonversi suhu dari satu satuan ke satuan lainnya (misalnya, dari Celcius ke Fahrenheit, atau dari Kelvin ke Celcius). Konversi suhu dilakukan dengan mengikuti rumus matematis yang sesuai dengan perubahan satuan suhu.

## Penggunaan

Anda dapat menggunakan kelas KonversiSuhu sebagai berikut:

```java
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