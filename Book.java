class Book {
    String title;
    String author;
    int age;
 
   public Book(){
      this.title="book1";
      this.author="narmadha";
   }
   public Book(String title,String author){
      this.title=title;
      this.author=author;
   }
   public void introduce() {
      System.out.println(title+author);
}
   
   public static void main(String[]args){
       Book person1=new Book("life is full of surprices", "and miracles");
       person1.introduce();
   }
}