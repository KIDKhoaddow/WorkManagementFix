package etc.vn.model.work.detail;


public class DetailEpic extends DetailBusiness {
    private String timeCriticality;

    public DetailEpic(Long id, String priority, String effort, String businessValue, ValueArea valueArea, String timeCriticality) {
        super(id, priority, effort, businessValue, valueArea);
        this.timeCriticality = timeCriticality;
    }

    public String getTimeCriticality() {
        return timeCriticality;
    }

    public void setTimeCriticality(String timeCriticality) {
        this.timeCriticality = timeCriticality;
    }

    @Override
    public Long getId() {
        return super.getId();
    }

    @Override
    public void setId(Long id) {
        super.setId(id);
    }

    @Override
    public String getPriority() {
        return super.getPriority();
    }

    @Override
    public void setPriority(String priority) {
        super.setPriority(priority);
    }

    @Override
    public String getEffort() {
        return super.getEffort();
    }

    @Override
    public void setEffort(String effort) {
        super.setEffort(effort);
    }

    @Override
    public String getBusinessValue() {
        return super.getBusinessValue();
    }

    @Override
    public void setBusinessValue(String businessValue) {
        super.setBusinessValue(businessValue);
    }

    @Override
    public ValueArea getValueArea() {
        return super.getValueArea();
    }

    @Override
    public void setValueArea(ValueArea valueArea) {
        super.setValueArea(valueArea);
    }
}
