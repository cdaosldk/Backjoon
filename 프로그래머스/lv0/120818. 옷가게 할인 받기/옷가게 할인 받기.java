class Solution {
    public int solution(int price) {
        if(price >= 100000 && price <300000){
            return (int)(price *(1 - 0.05));
        } else if (price >= 300000 && price < 500000) {
            return (int)(price *(1 - 0.1));
        } else if (price >= 500000 && price <= 1000000) {
            return (int)(price *(1 - 0.2));
        }else{
            return price;
        }
    }
}