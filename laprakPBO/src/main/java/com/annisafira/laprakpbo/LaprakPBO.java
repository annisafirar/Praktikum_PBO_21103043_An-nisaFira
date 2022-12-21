package com.annisafira.laprakpbo;

import java.util.Scanner;
public class LaprakPBO {
 
  static final Scanner in = new Scanner(System.in);
  static String user, passlogin;
 
  //Membuat variabel untuk menginput suatu nilai
   static String passlogin(){
    System.out.print("Password = ");
    passlogin = in.nextLine();
    return passlogin;
  }
  static String user(){
    System.out.print("Username = ");
    user = in.nextLine();
    return user;
  }
 
//variabel passlogin dan user di gunakakn untuk meng input username dan pasword dari  pengguna 
  public static void main(String[] args) {
      //variabel untuk menyimpan nma, pengguna,paswor dan konfirmasi yang ber tipe data string  
      String nama, pengguna, pass, konfir;
      boolean reg = true;
 
      while(reg){//struktur while guna menentukan kondisi saat pengguna melakukan registrasi 
         System.out.print("Nama Lengkap = ");
         nama = in.nextLine();
 
         System.out.print("Username = ");
         pengguna = in.nextLine();
 
         System.out.print("Password = ");
         pass = in.nextLine();
 
         System.out.print("Masukkan Kembali Password = ");
         konfir = in.nextLine();
         //pengulangan akan terjadi cabang ketika user tidak meng input dengan benar 
         if(konfir.equals(pass)){//if mennetukan jika pengguna memasukkan nilai yang sama dari variabel pass dan konfir
           reg = false;
           System.out.println("Registrasi Berhasil");//jika program nya benar maka pengguna berhasil
 
           for(int i = 3;i >= 1;i --){// gunanya untuk menghitung kesalahan pengguna 
 
            if(user().equals(pengguna) && passlogin().equals(pass)){
              System.out.println("Selamat Datang Di AKUN ANDA");
              break;// untuk menghentikan perulangan menggunkan break 
            } 
            else if( i == 1 ){//jika perulangan sama dengan 1 memberikan informasi terakhir prgram yang telah di jalankan 
              System.out.println("Anda sudah 3x salah, Coba beberapa saat lagi ");
            }
            else {//ketika kondisi di atas pengguna meng input nilai yang sama sesuai pasword dan konfir, dan bnear makan pengguna berhasil login 
              System.out.println("Username atau password salah, silakan coba lagi " + "(kesempatan login anda "+(i-1)+" kali lagi)");
            }
         }// jika gagal maka  pengguna akan kembali menginput nilai jika sudah salah 3 kali maka selesai karena hanya di batasi sebnayak 3 kali 
      } else {
          System.out.println("Gagal");
    } 
   }
  }
}
