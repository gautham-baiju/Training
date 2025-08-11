package Java.Training.EmployeeManagement.src;

import java.time.LocalDate;
import java.util.ArrayList;

public class ProjectAllocationManager {

    private ArrayList<ProjectAssignment> projectAssignments = new ArrayList<>();

    public void assignEmployeeToProject(Employee employee, Project project, double percentageAllocation,
            LocalDate startDate,
            LocalDate endDate) {
        ProjectAssignment assignment = new ProjectAssignment(employee, project, percentageAllocation, startDate,
                endDate);
        this.projectAssignments.add(assignment);
    }

    public ArrayList<ProjectAssignment> getAssignmentsForEmployee(Employee employee) {
        ArrayList<ProjectAssignment> result = new ArrayList<>();
        for (ProjectAssignment pa : projectAssignments) {
            if (pa.getEmployee().equals(employee)) {
                result.add(pa);
            }
        }
        return result;
    }

    public ArrayList<ProjectAssignment> getAssignmentsForProject(Project project) {
        ArrayList<ProjectAssignment> result = new ArrayList<>();
        for (ProjectAssignment pa : projectAssignments) {
            if (pa.getProject().equals(project)) {
                result.add(pa);
            }
        }
        return result;
    }
}
