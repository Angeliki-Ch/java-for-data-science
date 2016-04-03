package com.forte.demo;

import com.forte.maths.ComplexNumber;

public class Student extends Person {

    private int matriculationId;

    public Student(String firstName, String lastName, ComplexNumber favouriteComplexNumber, int age, int matriculationId) {
        super(firstName, lastName, favouriteComplexNumber, age);
        this.matriculationId = matriculationId;
    }

    public int getMatriculationId() {
        return matriculationId;
    }

    public void setMatriculationId(int matriculationId) {
        this.matriculationId = matriculationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Student student = (Student) o;

        return matriculationId == student.matriculationId;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + matriculationId;
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + this.getFirstName() + "'" +
                ", lastName='" + lastName + '\'' +
                ", favouriteComplexNumber=" + favouriteComplexNumber +
                ", age=" + age +
                "matriculationId=" + matriculationId +
                '}';
    }

    public static void main(String[] args) {

        Student maria = new Student("Maria", "Choupa", new ComplexNumber(1,2), 19, 123456789);

        Person john = maria;

        System.out.println(john);

        john.setFirstName("John");

        System.out.println(john);
        System.out.println(maria);
    }
}
