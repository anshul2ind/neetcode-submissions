-- Write your query below
select DISTINCT ON (user_id) user_id, time_stamp as last_stamp
from logins
where EXTRACT( YEAR from CAST( time_stamp as TIMEstamp)) = 2020
order by user_id, time_stamp desc