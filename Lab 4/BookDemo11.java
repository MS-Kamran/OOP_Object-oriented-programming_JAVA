public class BookDemo11{
  public static void main(String[] args){
      
    Book b1=new Book("Slaughterhouse-5","Kurt Vonnegut",400);
    b1.setPrice(250);
    System.out.println(b1.getTitle());
    System.out.println(b1.getAuthor());
    System.out.println(b1);
  }
}