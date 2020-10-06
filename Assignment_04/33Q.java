//33.	Write a program to demonstrate functionalities of this keyword in java. 



class student{
       

    private String name;
    private int roll_no;
    int a = 0;
    int b = 0;
    student(){
       
            this("Under",26);
            b++;
            System.out.println("This is in this construct : "+b);

    }
    student(String name ,int roll_no){
        this.name = name;
        this.roll_no = roll_no;
        a++;
        System.out.println("this is under parametrisezed Constructor : "+a);
    }
    void show(){
        System.out.println("Name : "+name+"\tRoll No : "+roll_no);
    }
}

class studentDemo{
    public static void main(String[] args){
       student e = new student();
        e.show();
        student e1 = new student("Deepak Yadav",031);
        e1.show();
        student e2 = new student("Suraj Yadav",032);
        e2.show();
       // student e3 = new student();
      //  e3.show();
        
        

    }
}