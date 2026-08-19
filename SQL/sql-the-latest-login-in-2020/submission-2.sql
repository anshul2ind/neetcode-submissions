-- Write your query below
select user_id, time_stamp as last_stamp
from (
    select *, 
    ROW_NUMBER() OVER(PARTITION BY user_id order by time_stamp desc) as RN
    from logins
    where extract(YEAR from time_stamp::timestamp) = 2020
)
where RN = 1
