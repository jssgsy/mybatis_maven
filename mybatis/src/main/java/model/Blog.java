package model;

public class Blog {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog.id
     *
     * @mbggenerated Fri Jun 24 14:22:55 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog.title
     *
     * @mbggenerated Fri Jun 24 14:22:55 CST 2016
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog.content
     *
     * @mbggenerated Fri Jun 24 14:22:55 CST 2016
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog.author_id
     *
     * @mbggenerated Fri Jun 24 14:22:55 CST 2016
     */
    private Long authorId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog.id
     *
     * @return the value of blog.id
     *
     * @mbggenerated Fri Jun 24 14:22:55 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog.id
     *
     * @param id the value for blog.id
     *
     * @mbggenerated Fri Jun 24 14:22:55 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog.title
     *
     * @return the value of blog.title
     *
     * @mbggenerated Fri Jun 24 14:22:55 CST 2016
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog.title
     *
     * @param title the value for blog.title
     *
     * @mbggenerated Fri Jun 24 14:22:55 CST 2016
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog.content
     *
     * @return the value of blog.content
     *
     * @mbggenerated Fri Jun 24 14:22:55 CST 2016
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog.content
     *
     * @param content the value for blog.content
     *
     * @mbggenerated Fri Jun 24 14:22:55 CST 2016
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog.author_id
     *
     * @return the value of blog.author_id
     *
     * @mbggenerated Fri Jun 24 14:22:55 CST 2016
     */
    public Long getAuthorId() {
        return authorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog.author_id
     *
     * @param authorId the value for blog.author_id
     *
     * @mbggenerated Fri Jun 24 14:22:55 CST 2016
     */
    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }
}