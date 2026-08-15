-- Write your query below

select c.customer_id, c.customer_name
from customers c
where exists (
    select 1
    from orders o
    where o.product_name = 'A' and c.customer_id = o.customer_id
) and exists (
    select 1
    from orders o
    where o.product_name = 'B' and c.customer_id = o.customer_id
) and not exists (
    select 1
    from orders o
    where o.product_name = 'C' and c.customer_id = o.customer_id
)
order by c.customer_name;