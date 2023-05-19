package Java_with_Terry_Martin.OOps.model;

import java.time.LocalDate;

public class Dog extends Pet{

    public Dog(String name, LocalDate dob) {
        super(name, dob);
    }
    public void bark(){
        System.out.println("Bow--Bow & Ruff Ruff");
    }
}
