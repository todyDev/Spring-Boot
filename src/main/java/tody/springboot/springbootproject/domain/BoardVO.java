package tody.springboot.springbootproject.domain;

/**
 * BoardVO
 */
public class BoardVO {

    public int idx;
    public String title;
    public String content;
    public String writer;
    public int view;
    public String notice;
    public String open;
    public String reply;
    public int like_cnt;
    public String delete_yn;
    public String crea_date;
    public String update_date;

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
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

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
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

    public int getLike_cnt() {
        return like_cnt;
    }

    public void setLike_cnt(int like_cnt) {
        this.like_cnt = like_cnt;
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
                + ", like_cnt=" + like_cnt + ", notice=" + notice + ", open=" + open + ", reply=" + reply + ", title="
                + title + ", update_date=" + update_date + ", view=" + view + ", writer=" + writer + "]";
    }
    
}