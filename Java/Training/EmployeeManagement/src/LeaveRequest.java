package Java.Training.EmployeeManagement.src;

import java.time.LocalDate;

public class LeaveRequest {
    private Employee employee;
    private String leaveType;
    private LocalDate startDate;
    private LocalDate endDate;
    private String reason;
    private String status;

    public LeaveRequest(Employee employee, String leaveType, LocalDate startDate, LocalDate endDate, String reason) {
        this.employee = employee;
        this.leaveType = leaveType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.reason = reason;
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

    public String getLeaveRequestInfo() {
        return employee.getEmployeeInfo() + leaveType + startDate.toString() + endDate.toString() + reason + status;
    }
}
