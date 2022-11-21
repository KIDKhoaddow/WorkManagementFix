package etc.vn.model.work.detail;

public abstract class DetailBusiness extends Detail {
    private String effort;
    private  String businessValue;
    private ValueArea valueArea;

    public DetailBusiness(Long id, String priority, String effort, String businessValue, ValueArea valueArea) {
        super(id, priority);
        this.effort = effort;
        this.businessValue = businessValue;
        this.valueArea = valueArea;
    }

    public String getEffort() {
        return effort;
    }

    public void setEffort(String effort) {
        this.effort = effort;
    }

    public String getBusinessValue() {
        return businessValue;
    }

    public void setBusinessValue(String businessValue) {
        this.businessValue = businessValue;
    }

    public ValueArea getValueArea() {
        return valueArea;
    }

    public void setValueArea(ValueArea valueArea) {
        this.valueArea = valueArea;
    }
}
