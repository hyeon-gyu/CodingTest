# Write your MySQL query statement below
with confirm as (
    select user_id, count(*) count from confirmations where action = 'confirmed' group by user_id
),
total as(
    select user_id, count(*) count from confirmations group by user_id
)

select s.user_id, round(ifnull(c.count/t.count,0),2) as confirmation_rate
from signups s 
left join confirm c
on s.user_id = c.user_id
left join total t
on s.user_id = t.user_id;