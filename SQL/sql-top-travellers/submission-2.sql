-- Write your query below
with t_dis as (
    select user_id, sum(distance) as val
    from rides
    group by user_id
)
select u.name, (
    case 
    when t.val is NULL then 0
    else t.val
    end
) as travelled_distance
from users u left join t_dis t on u.id = t.user_id
order by travelled_distance desc, u.name;