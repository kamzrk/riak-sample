package ztbd.riak.domain;

public class DetailsBookDto {

	private String title;

	private String author;

	private String description;

	public DetailsBookDto() {
	}

	public DetailsBookDto(String title, String author, String description) {
		this.title = title;
		this.author = author;
		this.description = description;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
