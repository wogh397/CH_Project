public class BookCart {
    String title;
    String writer;
    String category;
    int price;


    public BookCart(String title, String writer, String category, int price) {
        this.title = title;
        this.writer = writer;
        this.category = category;
        this.price = price;
    }

    public String getTitle(){
        return this.title;
    }
    public String getWriter(){
        return  this.writer;
    }
    public  String getCategory(){
        return  this.category;
    }
    public int getPrice(){
        return  this.price;
    }
}



