package model;

public class Resume {

    private PersonalInformation personalInformation;
    private WorkExperience workExperience;

    public Resume(PersonalInformation personalInformation, WorkExperience workExperience) {
        this.personalInformation = personalInformation;
        this.workExperience = workExperience;
    }

    public Resume() {
    }

    public PersonalInformation getPersonalInformation() {
        return personalInformation;
    }

    public void setPersonalInformation(PersonalInformation personalInformation) {
        this.personalInformation = personalInformation;
    }

    public WorkExperience getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(WorkExperience workExperience) {
        this.workExperience = workExperience;
    }
}
