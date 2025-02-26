package com.example.bookstore.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @JsonProperty("booktitle")
    private String booktitle;

    @JsonProperty("author")
    private String author;

    @JsonProperty("publishingdate")
    private String publishingdate;

    @JsonProperty("publisher")
    private String publisher;

    @JsonProperty("edition")
    private String edition;

    @JsonProperty("category")
    private String category;

    @JsonProperty("language")
    private String language;

    @JsonProperty("format")
    private String format;

    @JsonProperty("synopsis")
    private String synopsis;

    @JsonProperty("rating")
    private String rating;

    @JsonProperty("price")
    private String price;

    public Long getId() {
        return Id;
    }

    public String getBooktitle() {
        return booktitle;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishingdate() {
        return publishingdate;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getEdition() {
        return edition;
    }

    public String getCategory() {
        return category;
    }

    public String getLanguage() {
        return language;
    }

    public String getFormat() {
        return format;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public String getRating() {
        return rating;
    }

    public String getPrice() {
        return price;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setBooktitle(String booktitle) {
        this.booktitle = booktitle;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublishingdate(String publishingdate) {
        this.publishingdate = publishingdate;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Books() {
    }
}

