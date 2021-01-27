import java.io.Serializable;

public class Book implements Serializable {
	
	private String nameBook;
	private String author;
	private String publisher;
        private int publishingYear;
        private int numberOfBooks;
	
	public Book(String nameBook, String author, String publisher, int publishingYear, int numberOfBooks ){
                this.nameBook = nameBook;
                this.author = author;
                this.publisher = publisher;
                this.publishingYear = publishingYear;
                this.numberOfBooks = numberOfBooks;
                
	}
	
	public String getnameBook(){
		return nameBook;
	}
	
	public String getAuthor(){
		return author;
	}
	
	public String getPublisher(){
		return publisher;
	}
        
        public int getPublishingYear(){
                return publishingYear;
        }
        
        public String getNumberOfBooks(){
                return numberOfBooks;
        }
}
