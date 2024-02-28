select query_name ,
round(sum(rating /position )/count(*),2) AS quality ,
round(sum(CASE WHEN rating < 3 then 1 else 0 end)/count(*)*100,2) AS poor_query_percentage 
from queries 
where query_name IS NOT NULL
group by query_name;