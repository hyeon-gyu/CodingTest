# Write your MySQL query statement below
SELECT MAX(NUM) AS num
FROM MYNUMBERS
WHERE NUM NOT IN (SELECT NUM FROM MYNUMBERS GROUP BY NUM HAVING COUNT(NUM) >= 2)