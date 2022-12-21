package com.annisafira.praktikumpbo.pertemuan3.praktukumpbo1.Animal;

public class Animal {
        // Attributes

        private String name;
        private int age;
        private String color;
        
        //constructor
        public Animal() {}
        
        
        //[Alt] + [insert] -> Constructor -> Select All
        
        
        public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
        }
 
        //Metod Mencetak Semua atribut 
        public void showProfile() {
            System.out.println("Name : " + name);
            System.out.println("Age  : " + age + "years old");
            System.out.println("Color: " + color);
           

        }
        
        //[Alt] + [fn]+ [insert] -> geter and senter  -> Select All

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
        
    }



