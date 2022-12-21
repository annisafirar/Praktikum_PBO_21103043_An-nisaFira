
package com.annisafira.praktikumpbo.pertemuan3.challange;


public class Main {
     public static void main(String[] args) {
        // membuat project dari kelas animal
        Library indonesia  = new Library("Universitas Indonesia",5000,1876);
        Library eropa = new Library("Universitas Harvard",9000,1779);
        Library asia = new Library("Library Universitas Nasional Singapura",1110,1988);
        
         //Memanggil method
        indonesia.showProfile();
        eropa.showProfile();
        asia.showProfile();
}
}