package model;

public class WorkExperience {

    private String technology;
    private int yearsOfExperience;

    public WorkExperience(String technology, int yearsOfExperience) {
        this.technology = technology;
        this.yearsOfExperience = yearsOfExperience;
    }

    public WorkExperience() {
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
}
