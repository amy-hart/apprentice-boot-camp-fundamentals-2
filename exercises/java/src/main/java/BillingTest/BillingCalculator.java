package BillingTest;

public class BillingCalculator {

    public int total(Advertiser advertiser) {

        int total = 0;

        if(advertiser.getType() == AdvertiserType.DEALER){
            total += advertiser.getNumberOfAdverts() * 50;
        }else{
            total += advertiser.getNumberOfAdverts() * 20;
        }

        total += (advertiser.getNumberOfProducts() *  advertiser.getNumberOfAdverts()) * 10;

        return total;
    }
}
