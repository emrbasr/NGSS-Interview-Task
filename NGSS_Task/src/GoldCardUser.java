public class GoldCardUser implements User {
    public GoldCardUser(Product product) {
    }

    public GoldCardUser() {

    }

    @Override
    public double calgulate(Product product) {
        if (product.getCategoryId() != 1) {
            return 0.7 * product.getPrice();
        } else if (product.getCategoryId() == 1) {
            System.out.println("indirimlerimiz telfonda geçerli değildir, Ürün fiiyatı :" + product.getPrice());

        }


        return 0;
    }
}
