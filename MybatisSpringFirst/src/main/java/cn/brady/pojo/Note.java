package cn.brady.pojo;

import java.util.Date;

public class Note {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column note.note_id
     *
     * @mbggenerated Fri Apr 28 16:28:30 CST 2017
     */
    private String noteId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column note.create_time
     *
     * @mbggenerated Fri Apr 28 16:28:30 CST 2017
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column note.content
     *
     * @mbggenerated Fri Apr 28 16:28:30 CST 2017
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column note.type
     *
     * @mbggenerated Fri Apr 28 16:28:30 CST 2017
     */
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column note.tag
     *
     * @mbggenerated Fri Apr 28 16:28:30 CST 2017
     */
    private String tag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column note.note_id
     *
     * @return the value of note.note_id
     *
     * @mbggenerated Fri Apr 28 16:28:30 CST 2017
     */
    public String getNoteId() {
        return noteId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column note.note_id
     *
     * @param noteId the value for note.note_id
     *
     * @mbggenerated Fri Apr 28 16:28:30 CST 2017
     */
    public void setNoteId(String noteId) {
        this.noteId = noteId == null ? null : noteId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column note.create_time
     *
     * @return the value of note.create_time
     *
     * @mbggenerated Fri Apr 28 16:28:30 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column note.create_time
     *
     * @param createTime the value for note.create_time
     *
     * @mbggenerated Fri Apr 28 16:28:30 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column note.content
     *
     * @return the value of note.content
     *
     * @mbggenerated Fri Apr 28 16:28:30 CST 2017
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column note.content
     *
     * @param content the value for note.content
     *
     * @mbggenerated Fri Apr 28 16:28:30 CST 2017
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column note.type
     *
     * @return the value of note.type
     *
     * @mbggenerated Fri Apr 28 16:28:30 CST 2017
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column note.type
     *
     * @param type the value for note.type
     *
     * @mbggenerated Fri Apr 28 16:28:30 CST 2017
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column note.tag
     *
     * @return the value of note.tag
     *
     * @mbggenerated Fri Apr 28 16:28:30 CST 2017
     */
    public String getTag() {
        return tag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column note.tag
     *
     * @param tag the value for note.tag
     *
     * @mbggenerated Fri Apr 28 16:28:30 CST 2017
     */
    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }
}