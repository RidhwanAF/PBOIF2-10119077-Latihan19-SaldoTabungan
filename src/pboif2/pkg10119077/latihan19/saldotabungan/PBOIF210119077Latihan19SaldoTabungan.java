/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119077.latihan19.saldotabungan;

/**
 *
 * @author RAF
 * Nama     : Ridhwan Anwar Fauzan
 * NIM      : 10119077
 * Kelas    : IF-2
 * Deskripsi: Saldo Tabungan
 */
public class PBOIF210119077Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double saldoAwal,bunga,total,totalBunga;
        int lama,i;
        
        saldoAwal = 2500000;
        bunga = 0.15;
        lama = 6;
        i=1;
        
        
        do{
            totalBunga = saldoAwal * bunga;
            total = totalBunga + saldoAwal;
            System.out.printf("Saldo di bulan ke-"+i+" Rp. %,1.0f%n", +total);
            saldoAwal += totalBunga;
            i++ ;
        } while (i <= lama);
    }
    
}
