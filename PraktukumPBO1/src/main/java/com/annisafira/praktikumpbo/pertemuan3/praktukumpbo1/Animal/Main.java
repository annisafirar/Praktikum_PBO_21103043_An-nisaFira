/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.annisafira.praktikumpbo.pertemuan3.praktukumpbo1.Animal;


public class Main {
    //'main' + tab
       public static void main(String[] args) {
        // membuat project dari kelas animal
        Animal cat = new Animal("Zee",2,"black");
        Animal dog = new Animal("qq",5,"pink");
        Animal rabbit = new Animal("ann",1,"blue");
        
       /* //Mengisi nilai atribute object 'cat'
        cat.name = " Zee";
        cat.age = 2;
        cat.color = "black";
        
        //Mengisi nilai atribute object 'dog'
        dog.name = " qq";
        dog.age = 5;
        dog.color = "pink";
        
         //Mengisi nilai atribute object 'rabbit'
        rabbit.name = " ann";
        rabbit.age = 1;
        rabbit.color = "blue";
        */
        //Memanggil method
        cat.showProfile();
        dog.showProfile();
        rabbit.showProfile();
        
           System.out.println(" Dog's name ( before) : " + dog.getName());
           dog.setName("Black");
           System.out.println("Dog's name (after) :  " + dog.getName());
        
            
    }
}
