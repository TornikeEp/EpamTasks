public class Resume {

    private String technology;
    private int yearsOfExperience;

    public Resume(String technology, int yearsOfExperience, Candidate candidate) {
        this.technology = technology;
        this.yearsOfExperience = yearsOfExperience;
    }

    public Resume() {
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public Integer getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

}
