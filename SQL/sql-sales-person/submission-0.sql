-- Write your query below
select s.name from sales_person s
where not exists (
select 1 from orders o
JOIN company c on c.com_id = o.com_id
where s.sales_id = o.sales_id and c.name = 'CRIMSON'
)