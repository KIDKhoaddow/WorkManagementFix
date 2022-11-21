package etc.vn.model.work;

import java.util.Date;

public class Status {
    private Date startDate;
    private Date targetDate;

    public Status(Date startDate, Date targetDate) {
        this.startDate = startDate;
        this.targetDate = targetDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }
}
