package etc.vn.model.user;

import etc.vn.model.project.Project;

import java.util.Set;

public class Account {
    private Long id;
    private String email;
    private String username;
    private String password;
    private Project project;
    private Set<Role> roles;

    public Account(Long id, String email, String username, String password, Project project, Set<Role> roles) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.password = password;
        this.project = project;
        this.roles = roles;
    }

    public Account() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
