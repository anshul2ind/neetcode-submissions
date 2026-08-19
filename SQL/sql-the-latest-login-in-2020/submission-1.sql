-- Write your query below
select distinct on (user_id) user_id, time_stamp as last_stamp
from logins
where extract(YEAR from time_stamp::timestamp) = 2020
order by user_id, time_stamp desc;