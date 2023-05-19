package Java_with_Terry_Martin.OOps.model;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person chandra=new Person("Chandra","GR", LocalDate.of(2007,6,21));
        Person jannet=new Person("Jannet","Adeson",LocalDate.of(2008,6,15));
        chandra.setSpouse(jannet);
        Dog jummy=new Dog("Jummy",LocalDate.of(2015,6,3));
       jummy.bark();
        chandra.setPet(jummy);
        System.out.println(chandra);
    }
}
