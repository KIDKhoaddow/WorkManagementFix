package etc.vn.model.work.work_item;

public class Project {
    private Long id;
    private String name;
    private String description;
    private String avatar;
    private Long member;

    public Project(Long id, String name, String description, String avatar, Long member) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.avatar = avatar;
        this.member = member;
    }

    public Project() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Long getMember() {
        return member;
    }

    public void setMember(Long member) {
        this.member = member;
    }
}
