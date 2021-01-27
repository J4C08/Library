import java.io.Serializable;

public class ksiazka implements Serializable {
	
	private String nameBook;
	private String author;
	private String publisher;
        private String publishingYear;
        private String numberOfBooks;
	
	public ksiazka(String nameBook, String author, String publisher, String publishingYear, String numberOfBooks ){
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
        
        public String getPublishingYear(){
                return publishingYear;
        }
        
        public String getNumberOfBooks(){
                return numberOfBooks;
        }
}
