package Java.Training.EmployeeManagement.src;

import java.util.ArrayList;

public class WFHManager {
    private ArrayList<WFHRequest> wfhRequests = new ArrayList<>();

    public void submitWFHRequest(WFHRequest wfhRequest) {
        this.wfhRequests.add(wfhRequest);
    }

    public void approveWFH(WFHRequest wfhRequest) {
        wfhRequest.approve();
    }

    public void rejectWFH(WFHRequest wfhRequest) {
        wfhRequest.reject();
    }

    public ArrayList<WFHRequest> getWFHsByEmployee(Employee employee) {
        ArrayList<WFHRequest> result = new ArrayList<>();
        for (WFHRequest r : wfhRequests) {
            if (r.getEmployee().equals(employee)) {
                result.add(r);
            }
        }
        return result;
    }

    public ArrayList<WFHRequest> getPendingWFHs() {
        ArrayList<WFHRequest> result = new ArrayList<>();
        for (WFHRequest r : wfhRequests) {
            if (r.getStatus().equals("PENDING")) {
                result.add(r);
            }
        }
        return result;
    }
}