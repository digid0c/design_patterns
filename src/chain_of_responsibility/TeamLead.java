package chain_of_responsibility;

import chain_of_responsibility.VacationApplication.Type;

public class TeamLead extends Employee {

    public TeamLead(VacationApprover successor) {
        super(successor, Role.TEAM_LEAD.name());
    }

    @Override
    protected boolean processRequest(VacationApplication vacationApplication) {
        if (vacationApplication.getType() == Type.SICK_LEAVE && vacationApplication.getPeriodInDays() <= 3) {
            vacationApplication.approve(getApproverRole());
            return true;
        }
        return false;
    }
}
