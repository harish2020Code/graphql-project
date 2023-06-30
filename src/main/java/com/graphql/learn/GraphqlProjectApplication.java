package com.graphql.learn;

import com.graphql.learn.entities.Book;
import com.graphql.learn.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqlProjectApplication implements CommandLineRunner {

	@Autowired
	private BookService bookService;
	public static void main(String[] args) {
		SpringApplication.run(GraphqlProjectApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Book b1 =  new Book();
		b1.setTitle("Complete Reference");
		b1.setDesc("For learning Spring boot");
		b1.setPages(500);
		b1.setPrice(5000);
		b1.setAuthor("Kevin Smith");

		Book b2 =  new Book();
		b2.setTitle("Learn GraphL");
		b2.setDesc("For learning GraphQL");
		b2.setPages(250);
		b2.setPrice(4000);
		b2.setAuthor("Alex Smith");

		Book b3 =  new Book();
		b3.setTitle("Learn H2 Database");
		b3.setDesc("For learning H2 Database");
		b3.setPages(250);
		b3.setPrice(4000);
		b3.setAuthor("Steve Jones");

		this.bookService.create(b1);
		this.bookService.create(b2);
		this.bookService.create(b3);


	}
}
