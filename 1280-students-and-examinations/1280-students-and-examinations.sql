SELECT s.student_id, s.student_name, u.subject_name, count(e.subject_name) attended_exams
from students s
join subjects u
left join examinations e
on s.student_id = e.student_id and u.subject_name = e.subject_name
group by s.student_id, u.subject_name
order by s.student_id, u.subject_name
