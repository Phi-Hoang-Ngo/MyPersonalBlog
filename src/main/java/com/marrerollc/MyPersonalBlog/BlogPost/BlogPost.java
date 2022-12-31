//package com.marrerollc.MyPersonalBlog.BlogPost;
//
//import java.math.BigInteger;
//import java.sql.Clob;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "Blog_Post")
//public class BlogPost {
//
//	// sets the Id as the Primary Key
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private BigInteger id;
//
//	public BigInteger getId() {
//		return id;
//	}
//
//	public void setId(BigInteger id) {
//		this.id = id;
//	}
//	@Column(name = "Title")
//	private String title;
//	
//	@Column(name = "Author")
//	private String author;
//	
//	@Column(name = "Blog_Entry")
//	private Clob blogEntry;
//
//	public BlogPost() {
//		// non-argument constructor needed for JPA
//	}
//
//	public BlogPost(String title, String author, Clob blogEntry) {
//		this.title = title;
//		this.author = author;
//		this.blogEntry = blogEntry;
//	}
//
//	public String getTitle() {
//		return title;
//	}
//
//	public void setTitle(String title) {
//		this.title = title;
//	}
//
//	public String getAuthor() {
//		return author;
//	}
//
//	public void setAuthor(String author) {
//		this.author = author;
//	}
//
//	public Clob getBlogEntry() {
//		return blogEntry;
//	}
//
//	public void setBlogEntry(Clob blogEntry) {
//		this.blogEntry = blogEntry;
//	}
//
//	@Override
//	public String toString() {
//		return "BlogPost [id=" + id + ", title=" + title + ", author=" + author + ", blogEntry=" + blogEntry + "]";
//	}
//}
//
package com.marrerollc.MyPersonalBlog.BlogPost;

import java.math.BigInteger;
import java.sql.Clob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "Blog_Post")
public class BlogPost {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public BigInteger id;

	@Column(name = "Title")
	private String title;

	@Column(name = "Author")
	private String author;

	@Lob
	@Column(name = "Blog_Entry")
	private  String blogEntry;

	public BlogPost() {
		// non-argument constructor needed for JPA
	}

	public BlogPost(BigInteger id, String title, String author, String blogEntry) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.blogEntry = blogEntry;
	}


	public BigInteger getId() {
		return id;
	}

	public void setID(BigInteger id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBlogEntry() {
		return blogEntry;
	}

	public void setBlogEntry(String blogEntry) {
		this.blogEntry = blogEntry;
	}

	@Override
	public String toString() {
		return "BlogPost [id=" + id + ", title=" + title + ", author=" + author + ", blogEntry=" + blogEntry + "]";
	}
}