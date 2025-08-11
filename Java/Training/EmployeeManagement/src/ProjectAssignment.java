package Java.Training.EmployeeManagement.src;

import java.time.LocalDate;

public class ProjectAssignment {
    private Employee employee;
    private Project project;
    private double percentageAllocation;
    private LocalDate startDate;
    private LocalDate endDate;

    public ProjectAssignment(Employee employee, Project project, double percentageAllocation, LocalDate startDate,
            LocalDate endDate) {
        this.employee = employee;
        this.project = project;
        this.percentageAllocation = percentageAllocation;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Employee getEmployee() {
        return this.employee;
    }

    public Project getProject() {
        return this.project;
    }

    public String getAdditionalInfo() {
        return this.percentageAllocation + this.startDate.toString() + this.endDate.toString();
    }
}