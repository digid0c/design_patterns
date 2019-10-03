package chain_of_responsibility;

public class CEO extends Employee {

    public CEO(VacationApprover successor) {
        super(successor, Role.CEO.name());
    }

    @Override
    protected boolean processRequest(VacationApplication vacationApplication) {
        switch (vacationApplication.getType()) {
            case SICK_LEAVE:
            case UNPAID_HOLIDAY:
                vacationApplication.approve(getApproverRole());
                return true;
            case STUDY_LEAVE:
                if (vacationApplication.getPeriodInDays() <= 3) {
                    vacationApplication.approve(getApproverRole());
                    return true;
                }
        }
        return false;
    }
}
