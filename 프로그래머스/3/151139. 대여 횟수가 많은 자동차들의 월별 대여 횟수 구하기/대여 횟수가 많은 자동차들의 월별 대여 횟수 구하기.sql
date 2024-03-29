WITH MORE_THAN5 AS (
SELECT CAR_ID FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY 
WHERE START_DATE BETWEEN '2022-08-01' AND '2022-10-31'
GROUP BY CAR_ID
HAVING COUNT(*) >= 5
)
SELECT DATE_FORMAT(START_DATE, '%m') AS MONTH, CAR_ID, COUNT(*) AS RECORDS
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY 
WHERE (START_DATE BETWEEN '2022-08-01' AND '2022-10-31') AND CAR_ID IN (SELECT * FROM MORE_THAN5)
GROUP BY MONTH, CAR_ID
ORDER BY MONTH, CAR_ID DESC;

