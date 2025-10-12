package com.LibraryManagement.LibraryManagement.model;

import jakarta.persistence.*;
import jdk.jfr.Enabled;
@Entity
@Table(name = "\"Books\"")
public class Book {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookid;

    private String title;
    private String author;
    private int copiesavailable;

    // Default constructor (required)
    public Book() {}

    // Getters and Setters
    public int getBookid() { return bookid; }
    public void setBookid(int bookid) { this.bookid = bookid; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public int getCopiesavailable() { return copiesavailable; }
    public void setCopiesavailable(int copiesavailable) { this.copiesavailable = copiesavailable; }
}

