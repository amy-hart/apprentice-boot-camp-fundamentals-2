package BillingTest;

// Each product costs £10 per advert per month
// Each adverts cost £50 per month for dealers, and £20 per month for private individuals

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class BillingTest {
    BillingCalculator billingCalculator;

    @Before
    public void setup() {
        billingCalculator = new BillingCalculator();
    }

    @Test
    public void DealerHasOneAdvertWithNoProducts () {

        int result = billingCalculator.total(AdvertiserType.DEALER, 1, 0);

        Assertions.assertThat(result).isEqualTo(50);
    }

    @Test
    public void PrivateIndividualHasOneAdvertWithNoProducts () {

        int result = billingCalculator.total(AdvertiserType.PRIVATE, 1, 0);

        Assertions.assertThat(result).isEqualTo(20);
    }

    @Test
    public void DealerHasOneAdvertWithOneProduct () {

        int result = billingCalculator.total(AdvertiserType.DEALER, 1, 1);

        Assertions.assertThat(result).isEqualTo(60);
    }

    @Test
    public void PrivateIndividualHasOneAdvertWithOneProducts () {

        int result = billingCalculator.total(AdvertiserType.PRIVATE, 1, 1);

        Assertions.assertThat(result).isEqualTo(30);
    }

    @Test
    public void DealerHasOneAdvertWithThreeProducts () {

        int result = billingCalculator.total(AdvertiserType.DEALER, 1, 3);

        Assertions.assertThat(result).isEqualTo(80);
    }

    @Test
    public void PrivateIndividualHasOneAdvertWithThreeProducts () {

        int result = billingCalculator.total(AdvertiserType.PRIVATE, 1, 3);

        Assertions.assertThat(result).isEqualTo(50);
    }

    @Test
    public void DealerHasThreeAdvertsWithFiveProducts() {

        int result = billingCalculator.total(AdvertiserType.DEALER, 3, 5);

        Assertions.assertThat(result).isEqualTo(300);
    }

    @Test
    public void PrivateIndividualHasThreeAdvertsWithFiveProducts() {

        int result = billingCalculator.total(AdvertiserType.PRIVATE, 3, 5);

        Assertions.assertThat(result).isEqualTo(210);
    }

    @Test
    public void DealerHasTwentyAdvertsWithOneProduct() {

        int result = billingCalculator.total(AdvertiserType.DEALER, 20, 1);

        Assertions.assertThat(result).isEqualTo(1200);
    }

    @Test
    public void DealerHasOneThousandAdvertsWithTwoProduct() {

        int result = billingCalculator.total(AdvertiserType.DEALER, 1000, 2);

        Assertions.assertThat(result).isEqualTo(70000);
    }

    @Test
    public void PrivateIndividualHasThreeAdvertsWithNoProducts() {

        int result = billingCalculator.total(AdvertiserType.PRIVATE, 3, 0);

        Assertions.assertThat(result).isEqualTo(60);
    }

    @Test
    public void PrivateIndividualHasOneAdvertWithOneHundredProducts() {

        int result = billingCalculator.total(AdvertiserType.PRIVATE, 1, 1);

        Assertions.assertThat(result).isEqualTo(30);
    }
}
