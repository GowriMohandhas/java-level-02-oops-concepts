import java.io.*;
class Overloading {

        int add(int a, int b) {
        return a + b;
    }

        int add(int a, int b, int c) {
        return a + b + c;
    }

        double add(double a, double b) {
        return a + b;
    }

        String add(String a, String b) {
        return a + b;
    }

        void display(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

        void display(int age, String name) {
        System.out.println("Age: " + age + ", Name: " + name);
    }
}
