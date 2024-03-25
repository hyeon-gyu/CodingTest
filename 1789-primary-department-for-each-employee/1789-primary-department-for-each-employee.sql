# Write your MySQL query statement below
# 부서에 두개 이상 속해있다면 flag가 y인게 주요 부서 / 부서에 하나만 속해있다면 flag가 n인게 주요부서

# 1. 하나의 부서에만 속한 근로자부터 찾고 group by -> count = 1
WITH ONLY AS (
    SELECT employee_id, department_id
    FROM Employee
    GROUP BY employee_id
    HAVING COUNT(employee_id) = 1
)


SELECT * FROM ONLY
UNION
SELECT employee_id, department_id FROM Employee WHERE primary_flag = 'Y';



