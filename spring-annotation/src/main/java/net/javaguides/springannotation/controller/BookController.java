package net.javaguides.springannotation.controller;

import net.javaguides.springannotation.beans.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//Lesson 9
//@Controller if you want to simply return the view of Spring MVC use this annotation
//@ResponseBody
@RestController // This is used if you want to set up Restful web services
@RequestMapping("/api")
public class BookController {

    @RequestMapping("/hello-world")
//    @ResponseBody
    public String hello(){
        return "Hello World!";
    }


    @GetMapping( value= {"/book", "/java"}//NB we are using GetMapping to Map to a particular method
            //LESSON 11 comment them out and just leave the get method above
//    produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
//            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    //Lesson 10 Response body can be used at class level as well and not just at a method/constructor level
    // comment out  response body inside class and place it top of the class
//    @ResponseBody
    public Book getBook(){
        Book book = new Book(1, "Core Java", "Learn Core Java and Latest features");
        return book;
    }

    @PostMapping(value = "/books/create",
    consumes = MediaType.APPLICATION_JSON_VALUE)
//    @ResponseStatus(value = HttpStatus.CREATED)
    //Lesson 13 USE Response Entity to alter the HTTP status message
    public ResponseEntity<Book> createBook(@RequestBody Book book){
        System.out.println(book.getId());
        System.out.println(book.getTitle());
        System.out.println(book.getDescription());
        return new ResponseEntity<>(book, HttpStatus.CREATED);
    }

    @PutMapping(value = "/books/update/{id}")
                                            //bind id to method argument by using path variable annotation
    public ResponseEntity<Book> updateBook(
            @PathVariable int id, @RequestBody Book updatedBook) {
        System.out.println(id);
        System.out.println(updatedBook.getTitle());
        System.out.println(updatedBook.getDescription());
        updatedBook.setId(id);
        return ResponseEntity.ok(updatedBook);

    }

    @DeleteMapping(value = "/books/delete/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable int id){
        System.out.println(id);
        return ResponseEntity.ok("Book deleted successfully!");
    }


}
