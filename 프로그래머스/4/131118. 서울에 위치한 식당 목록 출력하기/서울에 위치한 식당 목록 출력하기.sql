-- 코드를 입력하세요
SELECT a.rest_id, a.rest_name, a.food_type,
a.favorites, a.address, ROUND(AVG(b.review_score), 2) as average
FROM rest_info a, rest_review b
WHERE a.address like '서울%'
AND a.rest_id = b.rest_id
GROUP BY a.rest_id
ORDER BY average DESC, a.favorites DESC;