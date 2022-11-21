package etc.vn.model.user;

import java.util.Date;

public class UserInfo {
    private Long id;
    private String firstName;
    private String lastName;
    private String avatar;
    private String about;
    private Date birthday;
    private Sex sex;
    private Date registerDate;
    private Long idUserStatus;

    public UserInfo(Long id, String firstName, String lastName, String avatar, String about, Date birthday, Sex sex, Date registerDate, Long idUserStatus) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.avatar = avatar;
        this.about = about;
        this.birthday = birthday;
        this.sex = sex;
        this.registerDate = registerDate;
        this.idUserStatus = idUserStatus;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public UserInfo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Long getIdUserStatus() {
        return idUserStatus;
    }

    public void setIdUserStatus(Long idUserStatus) {
        this.idUserStatus = idUserStatus;
    }
}
