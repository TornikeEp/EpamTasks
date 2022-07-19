public class Resume {
    private int candidateId;
    private String candidateNameAndSurname;
    private String technology;
    private Integer yearsOfExperience;

    public int getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(int candidateId) {
        this.candidateId = candidateId;
    }

    public String getCandidateNameAndSurname() {
        return candidateNameAndSurname;
    }

    public void setCandidateNameAndSurname(String candidateNameAndSurname) {
        this.candidateNameAndSurname = candidateNameAndSurname;
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

    public void setYearsOfExperience(Integer yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public void searchResume() {
        //logic to search resume from some repo goes here
    }

}