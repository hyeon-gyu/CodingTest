select a1.machine_id, round(((sum(a1.timestamp) - sum(a2.timestamp))/ count(a1.machine_id)),3) as processing_time
from activity a1, activity a2
where a1.machine_id = a2.machine_id 
and a1.process_id = a2.process_id 
and a1.activity_type = 'end'
and a2.activity_type = 'start'
group by a1.machine_id;