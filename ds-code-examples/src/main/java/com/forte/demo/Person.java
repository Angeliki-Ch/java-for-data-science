package com.forte.demo;

import com.forte.maths.ComplexNumber;

public class Person {

    private String firstName;
    protected String lastName;
    protected ComplexNumber favouriteComplexNumber;
    protected int age;

    public Person(String firstName, String lastName, ComplexNumber favouriteComplexNumber, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.favouriteComplexNumber = favouriteComplexNumber;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age) {
        this(firstName, lastName, new ComplexNumber(0,0), age);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ComplexNumber getFavouriteComplexNumber() {
        return favouriteComplexNumber;
    }

    public void setFavouriteComplexNumber(ComplexNumber favouriteComplexNumber) {
        this.favouriteComplexNumber = favouriteComplexNumber;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (firstName != null ? !firstName.equals(person.firstName) : person.firstName != null) return false;
        if (lastName != null ? !lastName.equals(person.lastName) : person.lastName != null) return false;
        return favouriteComplexNumber != null ? favouriteComplexNumber.equals(person.favouriteComplexNumber) : person.favouriteComplexNumber == null;

    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (favouriteComplexNumber != null ? favouriteComplexNumber.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Person {" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", favouriteComplexNumber=" + favouriteComplexNumber +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {

        Person angeliki = new Person("Aggeliki", "Chatzimoschou", new ComplexNumber(69,69), 19);
        Person miguel = new Person("Rui Miguel", "Forte", 35);

        System.out.println(angeliki.equals(miguel));
        System.out.println(angeliki.equals(angeliki));
        System.out.println(angeliki.equals(new Person("Aggeliki", "Chatzimoschou", new ComplexNumber(69,69), 19)));

        System.out.println(angeliki.getFavouriteComplexNumber());
        System.out.println(miguel.getAge());

        System.out.println(miguel);
        miguel.setFavouriteComplexNumber(new ComplexNumber(4,3));
        System.out.println(miguel);

    }
}
