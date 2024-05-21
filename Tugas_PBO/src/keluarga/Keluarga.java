/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package keluarga;
/**
 *
 * @author user
 */
public class Keluarga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Manusia bapak = new Orang_Tua("Mujiono", "Secang", "06 February 1978", "Wirausaha", "Secang,Magelang", "085223490391", 0);
        Manusia ibu = new Orang_Tua("Zun", "Secang", "10 December 1983", "Ibu Rumah tangga", "Secang,Magelang", "085546112500", 0);
        Manusia yoga = new Anak("Yoga", "Secang", "07 April 2003", "Pelajar/Mahasiswa", "Secang,Magelang", "08139211230", 0);
        Manusia maulana = new Anak("Maulana", "Secang", "26 February 2014", "Pelajar", "Secang,Magelang", "0", 0);
       
        System.out.println(bapak.getDetails());
        System.out.println(ibu.getDetails());
        System.out.println(yoga.getDetails());
        System.out.println(maulana.getDetails());
    }
    
       
    }
