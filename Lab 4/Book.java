public class Book{
    private String author;
    private String title;
    private double price;
    
    Book(){
    }
    
    public Book (String title, String author, double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    
    public void setTitle(String title){
        this.title=title; 
    }
    
    public void setAuthor(String author){
        this.author=author; 
    }
    
    public void setPrice(double price){
        this.price=price;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public String toString(){
        String s="Book: "+title;
        s=s+" Author: "+author;
        s=s+" Price: "+price;
        return s;
    }
}