package Java.Training.EmployeeManagement.src;

public class Experience {
    private String title;
    private String companyName;
    private String duration;

    public Experience(String title, String companyName, String duration) {
        this.title = title;
        this.companyName = companyName;
        this.duration = duration;
    }

    public String getExperienceInfo() {
        return this.title + this.companyName + this.duration;
    }
}
