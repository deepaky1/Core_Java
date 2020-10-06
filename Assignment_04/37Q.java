// 37.	Create a class Person with properties (name and age) with following features. 
// a.	Default age of person should be 18.
// b.	A person object can be initialized with name and age.
// c.	Method to display name and age of person
// Create another class PersonDemo ( main class ) that demonstrates the functionalities of Person class by creating Person object and calling methods.

import java.util.Scanner;
class Person{
    private String name;
    private int age;
    
   void display(){
        System.out.print("Welome "+name+"\t Age : "+age);
    }

    Person(String name){
         age =18;
        this.name = name;
    }
}

class PersonDemo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Name : ");
        String s = sc.next();
        Person p = new Person(s);
        p.display();
        
    }
}