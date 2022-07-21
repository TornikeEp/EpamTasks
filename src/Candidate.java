public class Candidate {

    private int id;
    private Resume resume;

    public Candidate(int id, String name, String surname, Resume resume) {
        this.id = id;
        this.resume = resume;
    }

    public Candidate(int id) {
        this.id = id;
    }

    public Candidate() {
    }

    public Resume getResume() {
        return resume;
    }

    public void setResume(Resume resume) {
        this.resume = resume;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
