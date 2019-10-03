package chain_of_responsibility;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import chain_of_responsibility.VacationApplication.Type;

public class Client {

    public static void main(String[] args) {
        VacationApprover chain = createChainOfResponsibility();
        List<VacationApplication> applications = createVacationApplications();

        applications.forEach(application -> {
            System.out.println(application);
            chain.processVacationApplication(application);
            System.out.println(application);
            System.out.println("--------------------------------");
        });
    }

    private static VacationApprover createChainOfResponsibility() {
        VacationApprover ceo = new CEO(null);
        VacationApprover projectManager = new ProjectManager(ceo);
        return new TeamLead(projectManager);
    }

    private static List<VacationApplication> createVacationApplications() {
        VacationApplication handledByTeamLead = new VacationApplication(Type.SICK_LEAVE, LocalDate.now(), LocalDate.now().plusDays(2));
        VacationApplication handledByProjectManager = new VacationApplication(Type.UNPAID_HOLIDAY, LocalDate.now(), LocalDate.now().plusDays(2));
        VacationApplication handledByCEO = new VacationApplication(Type.STUDY_LEAVE, LocalDate.now(), LocalDate.now().plusDays(2));
        VacationApplication unhandled = new VacationApplication(Type.STUDY_LEAVE, LocalDate.now(), LocalDate.now().plusDays(5));

        return Stream.of(handledByTeamLead, handledByProjectManager, handledByCEO, unhandled).collect(Collectors.toList());
    }
}
