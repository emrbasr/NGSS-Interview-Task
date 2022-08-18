public class SilverCardUser implements User {
    @Override
    public double calgulate(Product product) {

        if (product.getCategoryId() != 1) {
            return 0.8 * product.getPrice();
        } else if (product.getCategoryId() == 1) {
            System.out.println("indirimlerimiz telfonda geçerli değildir, Ürün fiiyatı :" + product.getPrice());

        }

        return 0;
    }
}
