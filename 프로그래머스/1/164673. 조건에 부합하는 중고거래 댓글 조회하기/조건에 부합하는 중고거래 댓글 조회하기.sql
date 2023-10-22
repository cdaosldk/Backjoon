-- 코드를 입력하세요
SELECT a.TITLE, a.BOARD_ID, b.REPLY_ID, b.WRITER_ID, b.CONTENTS, DATE_FORMAT(b.CREATED_DATE, '%Y-%m-%d') AS CREATED_DATE
FROM USED_GOODS_BOARD a, USED_GOODS_REPLY b
WHERE a.CREATED_DATE LIKE '2022-10%'
AND a.BOARD_ID = b.BOARD_ID
ORDER BY b.CREATED_DATE, a.TITLE