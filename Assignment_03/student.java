class student{
    private int studentid;
    private String studentname;
    void set(int id, String name){
        studentid = id;
        studentname = name;
    }  
    void show(){
        System.out.print("Student Roll No :"+studentid+"\tStudent Name :"+studentname);
    }
}

class main{
    public static void main(String[] args){
        student s = new student();
        s.set(101,"Deepak");
        s.show();
        student s1 = new student();
        s1.set(102, "Abhishek");
        s1.show();

    }
}