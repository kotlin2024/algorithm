-- 코드를 입력하세요
SELECT CATEGORY,SUM(BOOK_SALES.SALES) AS TOTAL_SALES
FROM BOOK
LEFT  JOIN BOOK_SALES ON BOOK.BOOK_ID = BOOK_SALES.BOOK_ID
WHERE MONTH(BOOK_SALES.SALES_DATE)=1 AND YEAR(BOOK_SALES.SALES_DATE)= 2022
GROUP BY CATEGORY
ORDER BY CATEGORY