package tody.springboot.springbootproject.domain;

/**
 * BoardVO
 */
public class BoardVO {

    public String idx;
    public String title;
    public String content;
    public String writer;
    public String view;
    public String like;
    public String notice;
    public String open;
    public String reply;
    public String delete_yn;
    public String crea_date;
    public String update_date;

    public String getIdx() {
        return idx;
    }

    public void setIdx(String idx) {
        this.idx = idx;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWrtier() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public String getDelete_yn() {
        return delete_yn;
    }

    public void setDelete_yn(String delete_yn) {
        this.delete_yn = delete_yn;
    }

    public String getCrea_date() {
        return crea_date;
    }

    public void setCrea_date(String crea_date) {
        this.crea_date = crea_date;
    }

    public String getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(String update_date) {
        this.update_date = update_date;
    }

    @Override
    public String toString() {
        return "BoardVO [content=" + content + ", crea_date=" + crea_date + ", delete_yn=" + delete_yn + ", idx=" + idx
                + ", like=" + like + ", notice=" + notice + ", open=" + open + ", reply=" + reply + ", title=" + title
                + ", update_date=" + update_date + ", view=" + view + ", writer=" + writer + "]";
    }
    
}