/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10116228.latihan36.targetsaldotabungan;

/**
 *
 * @author
 * Nama     : Gandy Christian Situmorang
 * Kelas    : PBO-6
 * NIM      :10116228
 * Deskripsi Program : program ini berisi program yang menampilkan target saldo
 * tabungan nasabah
 */
public class PBO610116228Latihan36TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int saldo = 3500000;
        double bunga = 0.08;
        double bulan = 0;
        
        SaldoTabungan targetsaldotabungan = new SaldoTabungan();
        targetsaldotabungan.hitungSaldoTabungan(saldo, bulan, bunga);
    
    }
    
}
