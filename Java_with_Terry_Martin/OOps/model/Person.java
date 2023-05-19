package Java_with_Terry_Martin.OOps.model;

import java.time.LocalDate;

public class Person {
    private String firstname;
    private String lastname;
    private LocalDate dob;
    private Address address;
    private Person spouse;
    private Pet pet;

    public Person(String firstname, String lastname, LocalDate dob) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dob = dob;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Person getSpouse() {
        return spouse;
    }

    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }

    public void setPet(Pet pet) {
            this.pet = pet;
    }

    public Pet getPet() {
            return pet;
    }
    @Override
    public String toString() {
        return "Person{" +
                "\nfirstname='" + firstname + '\'' +
                ",\nlastname='" + lastname + '\'' +
                ",\ndob=" + dob +
                ",\naddress=" + address +
                ",\nspouse=" + spouse +
                ",\npet=" + pet +
                "\n}";
    }

}
