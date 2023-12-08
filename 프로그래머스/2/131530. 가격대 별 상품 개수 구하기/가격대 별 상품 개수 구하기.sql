-- 코드를 입력하세요
SELECT 
    TRUNCATE(price, -4) AS PRICE_GROUP, COUNT(*) AS PRODUCTS
FROM product
GROUP BY price_group
ORDER BY price_group