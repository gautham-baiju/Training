package Java.Training.EmployeeManagement.src;

import java.util.ArrayList;
import java.util.UUID;

public class Employee {
    private String id;
    private String name;
    private String contactNumber;
    private String address;
    private String emergencyContactInfo;
    private String department;
    private ArrayList<String> skills = new ArrayList<>();
    private ArrayList<Experience> experiences = new ArrayList<>();
    private ArrayList<Certification> certifications = new ArrayList<>();

    public Employee(String name, String contactNumber, String address, String emergencyContactInfo, String department) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.contactNumber = contactNumber;
        this.address = address;
        this.emergencyContactInfo = emergencyContactInfo;
        this.department = department;
    }

    public void addSkill(String skill) {
        this.skills.add(skill);
    }

    public void addExperience(String title, String companyName, String duration) {
        Experience experience = new Experience(title, companyName, duration);
        this.experiences.add(experience);
    }

    public void addCertification(String title, String description) {
        Certification certification = new Certification(title, description);
        this.certifications.add(certification);
    }

    public ArrayList<String> getSkills() {
        return this.skills;
    }

    public ArrayList<Experience> getExperiences() {
        return this.experiences;
    }

    public ArrayList<Certification> getCertifications() {
        return this.certifications;
    }

    public String getEmployeeInfo() {
        return this.id + this.name + this.contactNumber + this.address + this.emergencyContactInfo + this.department;
    }
}
