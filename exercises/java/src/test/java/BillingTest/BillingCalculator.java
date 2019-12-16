package BillingTest;

public class BillingCalculator {

    public int total(AdvertiserType advertiserType, int numberOfAdverts, int numberOfProducts) {

        int total = 0;

        if(advertiserType == AdvertiserType.DEALER){
            total += numberOfAdverts * 50;
        }else{
            total += numberOfAdverts * 20;
        }

        total += (numberOfProducts *  numberOfAdverts) * 10;

        return total;
    }
}
