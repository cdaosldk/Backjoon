-- 코드를 입력하세요
SELECT a.flavor
FROM first_half a, icecream_info b
WHERE 
a.flavor = b.flavor
AND b.ingredient_type = "fruit_based"
AND a.total_order > 3000
ORDER BY a.total_order desc;