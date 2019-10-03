package chain_of_responsibility;

public class ProjectManager extends Employee {

    public ProjectManager(VacationApprover successor) {
        super(successor, Role.PROJECT_MANAGER.name());
    }

    @Override
    protected boolean processRequest(VacationApplication vacationApplication) {
        switch (vacationApplication.getType()) {
            case SICK_LEAVE:
                vacationApplication.approve(getApproverRole());
                return true;
            case UNPAID_HOLIDAY:
                if (vacationApplication.getPeriodInDays() <= 3) {
                    vacationApplication.approve(getApproverRole());
                    return true;
                }
        }
        return false;
    }
}
