package week_8;

//program to constrocter overloading

public class Students5Que25 {

    int id;
    String name;
    int age;
    //creating two arg constructor
    Students5Que25(int i, String n) {
        id = i;
        name = n;
    }
    //creating three arg constructor
    Students5Que25(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }
    public void display() {
        System.out.println(id + " " + name + " " + age);
    }
    public static void main(String[] args) {

        Students5Que25 s1 = new Students5Que25(111, "karan");
        Students5Que25 s2 = new Students5Que25(222, "aryan", 25);
        s1.display();
        s2.display();
    }
}


