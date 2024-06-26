-- 코드를 입력하세요
SELECT AUTHOR_ID,AUTHOR_NAME,CATEGORY,SUM(SALES*PRICE) AS TOTAL_SALES
FROM 
(SELECT *
FROM BOOK
LEFT JOIN AUTHOR USING(AUTHOR_ID)) A1
LEFT JOIN BOOK_SALES USING(BOOK_ID)
WHERE SALES_DATE LIKE '2022-01%'
GROUP BY CATEGORY,AUTHOR_NAME
ORDER BY AUTHOR_ID ASC, CATEGORY DESC