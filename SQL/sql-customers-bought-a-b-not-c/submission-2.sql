-- Write your query below
select employee_id,
(case
when ((employee_id % 2) != 0) and (name not like 'M%') then 1
else 0
end) * salary as bonus
from employees
order by employee_id;