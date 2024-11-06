package net.javaguides.springannotation.beans;

//Lesson 9
public class Book {

    private int id;
    private String title;
    private String description;

   public Book(int id, String title, String description){
       this.id = id;
       this.title = title;
       this.description = description;
   }


    public void setId(int id){
        this.id = id;
    }


    public void setTitle(String title){
        this.title = title;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public int getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getDescription(){
        return description;
    }
}
