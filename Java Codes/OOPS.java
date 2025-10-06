class Student {
    String name;
    int age;

    public void getInfo() {
        System.out.println("This is " + this.name + ", age " + this.age);
    }
}

class OOPS {
    public static void main(String[] arg) {
        Student s1 = new Student();
        s1.name = "Ahsanul Karim";
        s1.age = 22;
        s1.getInfo();
    }
}