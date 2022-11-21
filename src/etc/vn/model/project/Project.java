package etc.vn.model.project;

import etc.vn.model.user.Account;

import java.util.List;

public class Project {
    private Long id;
    private String name;
    private String description;
    private String avatar;
    private Long member;
    private List<Account> accountList;

    public Project(Long id, String name, String description, String avatar, List<Account> accountList) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.avatar = avatar;
        this.member = 0L;
        this.accountList = accountList;
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
        this.member=  Long.parseLong(String.valueOf( accountList.size()));
        return member;
    }

    public List<Account> getAccountList() {
        return accountList;
    }


    public void setAccountList(List<Account> accountList) {

        this.accountList = accountList;
    }
}
