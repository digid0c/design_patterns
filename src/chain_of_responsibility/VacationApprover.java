package chain_of_responsibility;

public interface VacationApprover {

    void processVacationApplication(VacationApplication vacationApplication);

    String getApproverRole();
}
