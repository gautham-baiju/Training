package Java.Training.EmployeeManagement.src;

import java.time.LocalDate;
import java.util.ArrayList;

public class WFHRequest {
    private Employee employee;
    private String reason;
    private String status;
    private ArrayList<LocalDate> desiredDates = new ArrayList<>();

    public WFHRequest(Employee employee, String reason, ArrayList<LocalDate> desiredDates) {
        this.employee = employee;
        this.reason = reason;
        this.desiredDates = desiredDates;
        this.status = "PENDING";
    }

    public void approve() {
        this.status = "APPROVED";
    }

    public void reject() {
        this.status = "REJECTED";
    }

    public Employee getEmployee() {
        return this.employee;
    }

    public String getStatus() {
        return this.status;
    }

    public ArrayList<LocalDate> getDesiredDates() {
        return this.desiredDates;
    }

    public String getWFHInfo() {
        return employee.getEmployeeInfo() + reason + status;
    }
}
