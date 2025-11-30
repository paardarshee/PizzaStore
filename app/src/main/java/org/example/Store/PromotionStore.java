package org.example.Store;

import java.util.Map;

public class PromotionStore {
    public Map<String,Double>promotions;
    public PromotionStore(){
        this.promotions = Map.of("default",5.0);
    }
    public void addPromotions(String promoCode,double discount){
        if(discount>100){
            System.out.println("Discount should be less than or equal to 100%");
        }else{
            promotions.put(promoCode,discount);
        }
    }
    public double getDefaultPromotion(){
        return promotions.get("default");
    }
    public double getPromotion(String promoCode){
        return promotions.get(promoCode);
    }
}
