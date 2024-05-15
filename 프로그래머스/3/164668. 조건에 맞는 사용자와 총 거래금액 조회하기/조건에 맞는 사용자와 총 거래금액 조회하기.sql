-- 코드를 입력하세요
SELECT USER_ID,NICKNAME,SUM(PRICE) AS TOTOAL_SALES
FROM USED_GOODS_BOARD
INNER JOIN USED_GOODS_USER ON USED_GOODS_BOARD.WRITER_ID= USED_GOODS_USER.USER_ID
WHERE STATUS = 'DONE'
GROUP BY USER_ID
HAVING SUM(PRICE) >=700000
ORDER BY SUM(PRICE) ASC