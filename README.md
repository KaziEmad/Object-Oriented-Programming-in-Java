# Object Oriented Programming System (OOPS) Concepts

## What is OOPS?

Object Oriented Programming (OOP) is a methodology or paradigm for
creating programs using **classes** and **objects**.\
It simplifies software development and maintenance by providing several
key concepts.

------------------------------------------------------------------------

## Why OOPS?

-   Helps solve complex programming problems.
-   Encourages **code reuse**, reducing redundancy.
-   Supports **data abstraction** and **encapsulation**.
-   Follows a **bottom-up approach** (unlike procedural programming's
    top-down approach).
-   Provides flexibility through **polymorphism**.

------------------------------------------------------------------------

## Class

A **class** is a logical entity---a blueprint for creating objects.\
It doesn't occupy memory until an object is instantiated.

``` java
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
```

> **Note:** When an object is created using `new`, memory is allocated
> on the heap, and the reference is stored in stack memory.

------------------------------------------------------------------------

## `this` Keyword

The `this` keyword in Java refers to the current instance of the class.\
It is used to: - Pass the current object as a parameter. - Refer to
instance variables within the class.

------------------------------------------------------------------------

## Constructor

A **constructor** is a special method invoked automatically during
object creation.\
It: - Has the same name as the class. - Has no return type. - Runs only
once when the object is created.

### Types of Constructors

1.  Non-Parameterized Constructor\
2.  Parameterized Constructor\
3.  Copy Constructor

#### Example: Non-Parameterized Constructor

``` java
class Student {
    Student() {
        System.out.println("Constructor is Called!");
    }
}

class OOPS {
    public static void main(String[] arg) {
        Student s1 = new Student();
    }
}
```

#### Example: Parameterized Constructor

``` java
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Constructor created for " + name + ", age " + age);
    }
}

class OOPS {
    public static void main(String[] arg) {
        Student s1 = new Student("Md. Ariful Islam", 23);
    }
}
```

#### Example: Copy Constructor

``` java
class Student {
    String name;
    int age;

    Student() {
        System.out.println("Default constructor created");
    }

    Student(Student s1) {
        this.name = s1.name;
        this.age = s1.age;
        System.out.println("Copy constructor created for " + name + ", age " + age);
    }
}

class OOPS {
    public static void main(String[] arg) {
        Student s1 = new Student();
        s1.name = "Sharukh";
        s1.age = 24;
        Student s2 = new Student(s1);
    }
}
```

> **Note:** Java has no destructor. The **garbage collector** handles
> memory deallocation automatically.

------------------------------------------------------------------------

## Polymorphism

**Polymorphism** means "many forms."\
It allows objects to take on multiple forms through method overloading
or overriding.

### Types:

1.  **Compile-time Polymorphism (Static)** --- via *Method Overloading*\
2.  **Runtime Polymorphism (Dynamic)** --- via *Method Overriding*

### Example: Method Overloading

``` java
class Student {
    public void displayInfo(String name) {
        System.out.println(name);
    }

    public void displayInfo(int age) {
        System.out.println(age);
    }

    public void displayInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

class OOPS {
    public static void main(String[] arg) {
        Student s1 = new Student();
        s1.displayInfo("Emad", 22);
    }
}
```

### Example: Method Overriding

``` java
class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {
    void run() {
        System.out.println("Bike is running safely");
    }
}

class OOPS {
    public static void main(String[] arg) {
        Bike r15 = new Bike();
        r15.run();
    }
}
```

------------------------------------------------------------------------

## Inheritance

**Inheritance** allows one class to acquire properties and methods of
another class.\
It represents an *IS-A* relationship.

### Types:

-   Single Inheritance
-   Multi-level Inheritance
-   Hierarchical Inheritance
-   Multiple Inheritance (via Interfaces)
-   Hybrid Inheritance

#### Example: Single Inheritance

``` java
class Employee {
    float salary = 40000;
}

class Programmer extends Employee {
    int bonus = 10000;
}

class OOPS {
    public static void main(String[] arg) {
        Programmer p = new Programmer();
        System.out.println("Salary: " + p.salary);
        System.out.println("Bonus: " + p.bonus);
    }
}
```

#### Example: Multi-level Inheritance

``` java
class Employee {
    float salary = 40000;
}

class Programmer extends Employee {
    int bonus = 10000;
}

class SeniorProgrammer extends Programmer {
    int extraBonus = 20000;
}

class OOPS {
    public static void main(String[] arg) {
        SeniorProgrammer p = new SeniorProgrammer();
        System.out.println(p.salary);
        System.out.println(p.bonus);
        System.out.println(p.extraBonus);
    }
}
```

#### Example: Hierarchical Inheritance

``` java
class Shape {
   public void area() {
       System.out.println("Displays area of shape");
   }
}

class Triangle extends Shape {
   public void area(int h, int b) {
       System.out.println(0.5 * b * h);
   }
}

class Circle extends Shape {
   public void area(int r) {
       System.out.println(3.14 * r * r);
   }
}

class OOPS {
   public static void main(String[] arg) {
       Circle c1 = new Circle();
       c1.area(3);
       Triangle t1 = new Triangle();
       t1.area(3, 4);
   }
}
```

------------------------------------------------------------------------

## Encapsulation

Encapsulation is the process of **wrapping data and methods** into a
single unit (class).\
It supports **data hiding** and **controlled access** via getters and
setters.

### Example:

``` java
class Account {
   public String name;
   protected String email;
   private String password;

   public void setPassword(String password) {
       this.password = password;
   }

   public String getPassword() {
       return password;
   }
}

class OOPS {
   public static void main(String[] args) {
       Account a1 = new Account();
       a1.name = "Apna College";
       a1.email = "hello@apnacollege.com";
       a1.setPassword("abcd");

       System.out.println("Your Password is: " + a1.getPassword());
   }
}
```

------------------------------------------------------------------------

## Abstraction

**Abstraction** hides implementation details and shows only essential
functionality.\
It can be achieved using: 1. **Abstract Classes** 2. **Interfaces**

### Example: Abstract Class

``` java
abstract class Bike {
    abstract void run();
}

class R15 extends Bike {
    void run() {
        System.out.println("running safely");
    }
}

class OOPS {
   public static void main(String[] args) {
       R15 bike = new R15();
       bike.run();
   }
}
```

### Example: Interface

``` java
interface Drawable {
    void draw();
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("drawing rectangle");
    }
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("drawing circle");
    }
}

class OOPS {
   public static void main(String[] args) {
       Circle c1 = new Circle();
       c1.draw();
   }
}
```

------------------------------------------------------------------------

## Multiple Inheritance via Interface

``` java
interface Printable {
    void print();
}

interface Showable {
    void show();
}

class Test implements Printable, Showable {
    public void print() {
        System.out.println("Printing...");
    }
    public void show() {
        System.out.println("Showing...");
    }
}

public class OOPS {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.print();
        obj.show();
    }
}
```

------------------------------------------------------------------------

## Static Keyword

`static` can be used with: - Variables (class-level) - Methods -
Blocks - Nested classes

``` java
class Student {
   static String school;
   String name;
}

public class OOPS {
   public static void main(String[] args) {
       Student.school = "The Scholars' College";
       Student s1 = new Student();
       Student s2 = new Student();

       s1.name = "Meena";
       s2.name = "Beena";

       System.out.println(s1.school);
       System.out.println(s2.school);
   }
}
```

------------------------------------------------------------------------

### 📘 Summary

  Concept         Description
  --------------- ------------------------------
  Class           Blueprint for objects
  Object          Instance of a class
  Constructor     Initializes an object
  Inheritance     Enables reusability
  Polymorphism    Many forms of a method
  Encapsulation   Data hiding and control
  Abstraction     Hides implementation details

------------------------------------------------------------------------

**Author:** Kazi Hasnayeen Emad\
**Topic:** OOPS Concepts with Java Code Examples
