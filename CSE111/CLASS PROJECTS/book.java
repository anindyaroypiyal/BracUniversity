
public class book {

	private String author;
	private String title ;
	private double price ;
	
	public book(String title, String author , double price) {
		this.title = title;
		this.author = author;
		this.price = price;
		}
	public book() {
		
	}
		public void setTitle(String title) {
			this.title = title;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public String getTitle() {
			return title;
		}
		public String getAuthor() {
			return author;
		}
		public double getPrice() {
			return price;
		}
		public String toString() {
			String s1 = this.title +"\n" +this.author +"\n" +this.price;
			return s1;
		}
}

