package BillingTest;

// Each product costs £10 per advert per month
// Each adverts cost £50 per month for dealers, and £20 per month for private individuals

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class BillingCalculatorTest {
    BillingCalculator billingCalculator;

    @Before
    public void setup() {
        billingCalculator = new BillingCalculator();
    }

    @Test
    public void DealerHasOneAdvertWithNoProducts () {

        Advertiser advertiser = new Advertiser("AutoTrader", AdvertiserType.DEALER, 1, 0);

        int result = billingCalculator.total(advertiser);

        Assertions.assertThat(result).isEqualTo(50);
    }

    @Test
    public void PrivateIndividualHasOneAdvertWithNoProducts () {

        Advertiser advertiser = new Advertiser("AutoTrader", AdvertiserType.PRIVATE, 1, 0);

        int result = billingCalculator.total(advertiser);

        Assertions.assertThat(result).isEqualTo(20);
    }

    @Test
    public void DealerHasOneAdvertWithOneProduct () {

        Advertiser advertiser = new Advertiser("AutoTrader", AdvertiserType.DEALER, 1, 1);

        int result = billingCalculator.total(advertiser);

        Assertions.assertThat(result).isEqualTo(60);
    }

    @Test
    public void PrivateIndividualHasOneAdvertWithOneProducts () {

        Advertiser advertiser = new Advertiser("AutoTrader", AdvertiserType.PRIVATE, 1, 1);

        int result = billingCalculator.total(advertiser);

        Assertions.assertThat(result).isEqualTo(30);
    }

    @Test
    public void DealerHasOneAdvertWithThreeProducts () {

        Advertiser advertiser = new Advertiser("AutoTrader", AdvertiserType.DEALER, 1, 3);

        int result = billingCalculator.total(advertiser);

        Assertions.assertThat(result).isEqualTo(80);
    }

    @Test
    public void PrivateIndividualHasOneAdvertWithThreeProducts () {

        Advertiser advertiser = new Advertiser("AutoTrader", AdvertiserType.PRIVATE, 1, 3);

        int result = billingCalculator.total(advertiser);

        Assertions.assertThat(result).isEqualTo(50);
    }

    @Test
    public void DealerHasThreeAdvertsWithFiveProducts() {

        Advertiser advertiser = new Advertiser("AutoTrader", AdvertiserType.DEALER, 3, 5);

        int result = billingCalculator.total(advertiser);

        Assertions.assertThat(result).isEqualTo(300);
    }

    @Test
    public void PrivateIndividualHasThreeAdvertsWithFiveProducts() {

        Advertiser advertiser = new Advertiser("AutoTrader", AdvertiserType.PRIVATE, 3, 5);

        int result = billingCalculator.total(advertiser);

        Assertions.assertThat(result).isEqualTo(210);
    }

    @Test
    public void DealerHasTwentyAdvertsWithOneProduct() {

        Advertiser advertiser = new Advertiser("AutoTrader", AdvertiserType.DEALER, 20, 1);

        int result = billingCalculator.total(advertiser);

        Assertions.assertThat(result).isEqualTo(1200);
    }

    @Test
    public void DealerHasOneThousandAdvertsWithTwoProducts() {

        Advertiser advertiser = new Advertiser("AutoTrader", AdvertiserType.DEALER, 1000, 2);

        int result = billingCalculator.total(advertiser);

        Assertions.assertThat(result).isEqualTo(70000);
    }

    @Test
    public void PrivateIndividualHasThreeAdvertsWithNoProducts() {

        Advertiser advertiser = new Advertiser("AutoTrader", AdvertiserType.PRIVATE, 3, 0);

        int result = billingCalculator.total(advertiser);

        Assertions.assertThat(result).isEqualTo(60);
    }

    @Test
    public void PrivateIndividualHasOneAdvertWithOneHundredProducts() {

        Advertiser advertiser = new Advertiser("AutoTrader", AdvertiserType.PRIVATE, 1, 100);

        int result = billingCalculator.total(advertiser);

        Assertions.assertThat(result).isEqualTo(1020);
    }
}
