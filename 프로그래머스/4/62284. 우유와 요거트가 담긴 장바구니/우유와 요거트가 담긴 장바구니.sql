-- 코드를 입력하세요
SELECT CART_ID
FROM CART_PRODUCTS
WHERE NAME = 'MILK' 
INTERSECT
SELECT CART_ID
FROM CART_PRODUCTS
WHERE NAME = 'YOGURT'
ORDER BY CART_ID ASC