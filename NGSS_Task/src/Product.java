public class Product {
    private double price;
    private int categoryId;


    public Product() {

    }


    public Product(double price, int categoryId) {
        this.price = price;
        this.categoryId = categoryId;

    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }


}
