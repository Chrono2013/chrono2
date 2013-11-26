package chrono3;

import java.util.Date;

public class Book {
    private String author, title, status;
    private Date publish;
    private int pages;
 
    public Book(String author, String title, Date publish, int pages,
            String status) {
        this.author = author;
        this.title = title;
        this.publish = publish;
        this.pages = pages;
        this.status = status;
        System.out.println("1");
    }
 
    public String getAuthor() {
        return author;
    }
 
    public void setAuthor(String author) {
        this.author = author;
    }
 
    public String getTitle() {
        return title;
    }
 
    public void setTitle(String title) {
    	System.out.println("ici"+title);
        this.title = title;
    }
 
    public String getStatus() {
        return status;
    }
 
    public void setStatus(String status) {
        this.status = status;
    }
 
    public Date getPublish() {
        return publish;
    }
 
    public void setPublish(Date publish) {
        this.publish = publish;
    }
 
    public int getPages() {
        return pages;
    }
 
    public void setPages(int pages) {
        this.pages = pages;
    }
 
}