package src.Practice.Coding.Ineritance.Equals;

import java.util.Objects;

public class Person {
    private  String name;
    private int age;
    private String id;

    // Constructor: jab naya object banega to ye values set karega
    public Person(String name, int age, String id) {
        this.name =  name;                   // 'this.name' instance variable hai, 'name' parameter ka value assign ho raha hai
        this.age  = age;                     // instance variable age = constructor ke parameter age
        this.id = id;                        // instance variable id = constructor ke parameter id
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof  Person)) {               // Agar obj Person ka instance hi nahi hai, to equal nahi hoga
            return false;
        }
        // type cast kar rahe obj ko Person me
        Person per = (Person) obj;
        // Check karte hain ki name, age aur id same hain ya nah
        return  per.name.equals(name) &&
                per.age ==  age &&
                per.id.equals(id);

    }


    // hashCode() method override
    @Override
    public  int hashCode(){                    // // Objects.hash() ek utility hai jo hash code generate karta hai based on fields
        return  Objects.hash(name,age, id);}

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Person {");    // ek StringBuilder banaya output banane ke liye
        sb.append("name = ").append(name).append('\'');         // name add kar diya
        sb.append(", age = ").append(age);
        sb.append(", id = ").append(id).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
