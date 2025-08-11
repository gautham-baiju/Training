package Java.Training.EmployeeManagement.src;

public class File {
    private String title;
    private String description;
    private String path;

    public File(String title, String description, String path) {
        this.title = title;
        this.description = description;
        this.path = path;
    }

    public String getFileInfo() {
        return this.title + this.description + this.path;
    }
}
