public class TwoYearUser implements User {
    int joinYear;

    public TwoYearUser(int joinYear) {
        this.joinYear = joinYear;
    }


    @Override
    public double calgulate(Product product) {

        int year = 2022 - this.joinYear;

        if (year <= 2) {
            return 0.95 * product.getPrice();
        } else {
            System.out.println("%5 indirimimizden sadece iki yıl boyunca yararlanılmaktadır ");

        }

        return product.getPrice();

    }
}
