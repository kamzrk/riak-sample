package ztbd.riak.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.basho.riak.client.api.annotations.RiakBucketName;
import com.basho.riak.client.api.annotations.RiakKey;

@Entity
@Table(name = "books")
@SequenceGenerator(name = "books_sequence", sequenceName = "books_id_seq")
public class Book {

	public static final String BUCKET = "Books";

	@RiakBucketName
	@Transient
	private String bucketName = BUCKET;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "books_sequence")
	private Long id;

	@RiakKey
	@Column(name = "isbn")
	private String isbn;

	private BigDecimal price;
	private Integer pages;
	private Integer review;
	private String desc;
	private Integer issue_date;
	private String category;
	private String subcategory;
	private BigDecimal rating;
	private String author;
	private String title;

	public Book() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getBucketName() {
		return bucketName;
	}

	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	public Integer getReview() {
		return review;
	}

	public void setReview(Integer review) {
		this.review = review;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Integer getIssue_date() {
		return issue_date;
	}

	public void setIssue_date(Integer issue_date) {
		this.issue_date = issue_date;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSubcategory() {
		return subcategory;
	}

	public void setSubcategory(String subcategory) {
		this.subcategory = subcategory;
	}

	public BigDecimal getRating() {
		return rating;
	}

	public void setRating(BigDecimal rating) {
		this.rating = rating;
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
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book [bucketName=" + bucketName + ", id=" + id + ", isbn=" + isbn + "]";
	}

}
