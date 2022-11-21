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

}
