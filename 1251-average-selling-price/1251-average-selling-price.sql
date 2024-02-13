# Write your MySQL query statement below
                    
SELECT P.product_id, IFNULL(ROUND(SUM(UNITS*PRICE)/SUM(UNITS),2),0) AS average_price
FROM PRICES P
LEFT JOIN UNITSSOLD U
ON P.product_id = U.product_id
AND U.purchase_date BETWEEN p.START_DATE AND p.END_DATE
GROUP BY P.PRODUCT_ID;