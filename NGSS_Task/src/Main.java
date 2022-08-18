public class Main {

    public static void main(String[] args) {

        Product product = new Product(1000, 2);
        GoldCardUser goldCardUser = new GoldCardUser();
        UserManager userManager = new UserManager(goldCardUser);
        userManager.bill(product);

        Product product1 = new Product(1000, 2);
        SilverCardUser silverCardUser = new SilverCardUser();
        UserManager userManager1 = new UserManager(silverCardUser);
        userManager1.bill(product1);

        Product product2 = new Product(1000, 2);
        AffiliateUser affiliateUser = new AffiliateUser();
        UserManager userManager2 = new UserManager(affiliateUser);
        userManager2.bill(product2);

        Product product3 = new Product(1000, 2);
        TwoYearUser twoYearUser = new TwoYearUser(2020);
        UserManager userManager3 = new UserManager(twoYearUser);
        userManager3.bill(product3);

    }
}
