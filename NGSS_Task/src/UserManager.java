public class UserManager {


    User user;

    public UserManager(User user) {
        this.user = user;
    }


    public void bill(Product product) {
        int a = 200;
        double discountRate = Math.floor(product.getPrice() / a);
        double discount = discountRate * 5;
        double price = user.calgulate(product);
        double toplam = price - discount;
        if (product.getCategoryId() == 1) {
            System.out.println("Fatura Tutarınız :" + product.getPrice());
        } else {
            System.out.println("Fatura Tutarınız :" + user.calgulate(product));
            System.out.println("İndirimli Fatura Tutarınız :" + toplam);
        }


    }
}
