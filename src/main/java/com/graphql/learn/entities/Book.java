package com.graphql.learn.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Table(name= "project_books")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book {

  //  @Id
  //  @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private String title;
    private String desc;
    private String author;
    private double price;
    private int pages;

}
