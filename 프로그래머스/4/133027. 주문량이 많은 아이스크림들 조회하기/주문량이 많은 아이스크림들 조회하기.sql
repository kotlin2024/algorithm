-- 코드를 입력하세요
SELECT A1.FLAVOR 
FROM FIRST_HALF A1, JULY A2
WHERE A1.FLAVOR = A2.FLAVOR
GROUP BY FLAVOR
HAVING SUM(A1.TOTAL_ORDER + A2.TOTAL_ORDER)
ORDER BY SUM(A1.TOTAL_ORDER + A2.TOTAL_ORDER) DESC
LIMIT 3