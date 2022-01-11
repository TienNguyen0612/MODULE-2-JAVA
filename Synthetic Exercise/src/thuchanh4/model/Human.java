package thuchanh4.model;

import java.time.LocalDate;

public class Human {
    private String name;
    private LocalDate dateOfBirth;
    private String job;
    private House house;

    public Human() {
    }

    public Human(String name, LocalDate dateOfBirth, String job, House house) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.job = job;
        this.house = house;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", job='" + job + '\'' +
                ", house=" + house.toString() +
                '}';
    }
}
