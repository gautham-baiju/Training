package Java.Training.EmployeeManagement.src;

public class Certification {
    private String title;
    private String description;

    public Certification(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getExperienceInfo() {
        return this.title + this.description;
    }
}
