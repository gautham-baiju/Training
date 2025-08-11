package Java.Training.EmployeeManagement.src;

import java.time.LocalDate;
import java.util.ArrayList;

public class Project {
    private String name;
    private String description;
    private LocalDate deadline;
    private ArrayList<File> relevantFiles = new ArrayList<>();

    public Project(String name, String description, LocalDate deadline) {
        this.name = name;
        this.description = description;
        this.deadline = deadline;
    }

    public void addRelevantFile(String title, String description, String path) {
        File file = new File(title, description, path);
        this.relevantFiles.add(file);
    }

    public ArrayList<File> getRelevantFiles() {
        return this.relevantFiles;
    }

    public String getProjectInfo() {
        return this.name + this.description + this.deadline;
    }
}
