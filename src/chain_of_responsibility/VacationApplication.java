package chain_of_responsibility;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class VacationApplication {

    private Type type;
    private LocalDate startDate;
    private LocalDate endDate;
    private Status status;
    private String processedBy;

    public enum Type {
        UNPAID_HOLIDAY, SICK_LEAVE, STUDY_LEAVE
    }

    public enum Status {
        PENDING, APPROVED, REJECTED
    }

    public VacationApplication(Type type, LocalDate startDate, LocalDate endDate) {
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = Status.PENDING;
    }

    public long getPeriodInDays() {
        return DAYS.between(startDate, endDate);
    }

    public void approve(String approverRole) {
        this.status = Status.APPROVED;
        this.processedBy = approverRole;
    }

    public Type getType() {
        return type;
    }

    public Status getStatus() {
        return status;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public String getProcessedBy() {
        return processedBy;
    }

    @Override
    public String toString() {
        return String.format("%s for %d days, %s by %s", getType(), getPeriodInDays(), getStatus(), getProcessedBy());
    }
}
