package etc.vn.model.Comment;

import etc.vn.model.user.Account;
import etc.vn.model.work.work_item.Work;

public class comment {
    private Long id;
    private String content;
    private Work work;
    private Account account;

    public comment(Long id, String content, Work work, Account account) {
        this.id = id;
        this.content = content;
        this.work = work;
        this.account = account;
    }

    public comment() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Work getWork() {
        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
