package chain_of_responsibility;

public abstract class Employee implements VacationApprover {

    private VacationApprover successor;
    private String role;

    public enum Role {
        TEAM_LEAD, PROJECT_MANAGER, CEO
    }

    public Employee(VacationApprover successor, String role) {
        this.successor = successor;
        this.role = role;
    }

    protected abstract boolean processRequest(VacationApplication vacationApplication);

    @Override
    public void processVacationApplication(VacationApplication vacationApplication) {
        if (!processRequest(vacationApplication)) {
            if (successor != null) {
                successor.processVacationApplication(vacationApplication);
            } else {
                System.out.println("Oops! No one could handle your vacation application request.");
            }
        }
    }

    @Override
    public String getApproverRole() {
        return role;
    }
}
