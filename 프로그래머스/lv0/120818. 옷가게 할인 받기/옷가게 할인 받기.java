class Solution {
    public int solution(int price) {
        if(price >= 100000 && price <300000){
            return (int)(price *(1 - 0.05F));
        } else if (price >= 300000 && price < 500000) {
            return (int)(price *(1 - 0.1F));
        } else if (price >= 500000 && price <= 1000000) {
            return (int)(price *(1 - 0.2F));
        }else{
            return price;
        }
    }
}