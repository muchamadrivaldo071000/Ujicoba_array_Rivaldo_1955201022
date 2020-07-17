/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author PERSONAL
 */
public class array_link2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            String [][] kontak = {{"Fitria","08111"},{"Adiesta","08122"},{"Naswa","08133"}};
        
        for (String[] kontak1 : kontak) {
            System.out.println("Nama: " + kontak1[0]);
            System.out.println("Nomor:" + kontak1[1]);
            System.out.println("--------------------------");
        }

    }
    
}
