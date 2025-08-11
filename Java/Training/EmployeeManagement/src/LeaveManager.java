package Java.Training.EmployeeManagement.src;

import java.util.ArrayList;

public class LeaveManager {
    private ArrayList<LeaveRequest> leaveRequests = new ArrayList<>();

    public void submitLeaveRequest(LeaveRequest leaveRequest) {
        this.leaveRequests.add(leaveRequest);
    }

    public void approveLeave(LeaveRequest leaveRequest) {
        leaveRequest.approve();
    }

    public void rejectLeave(LeaveRequest leaveRequest) {
        leaveRequest.reject();
    }

    public ArrayList<LeaveRequest> getLeavesByEmployee(Employee employee) {
        ArrayList<LeaveRequest> result = new ArrayList<>();
        for (LeaveRequest lr : leaveRequests) {
            if (lr.getEmployee().equals(employee)) {
                result.add(lr);
            }
        }
        return result;
    }

    public ArrayList<LeaveRequest> getPendingLeaves() {
        ArrayList<LeaveRequest> result = new ArrayList<>();
        for (LeaveRequest lr : leaveRequests) {
            if (lr.getStatus().equals("PENDING")) {
                result.add(lr);
            }
        }
        return result;
    }
}
