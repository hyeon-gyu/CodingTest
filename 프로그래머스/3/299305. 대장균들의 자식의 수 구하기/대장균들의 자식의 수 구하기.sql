-- 코드를 작성해주세요
select e1.id, IFNULL(count(e2.parent_id), 0) AS CHILD_COUNT 
from ecoli_data e1
left join ecoli_data e2
on e1.id = e2.parent_id
group by e1.id
