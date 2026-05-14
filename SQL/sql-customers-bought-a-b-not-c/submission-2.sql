-- Write your query below
select distinct(c.customer_id), c.customer_name from customers c
join orders o on o.customer_id = c.customer_id
where c.customer_id in (
    select o.customer_id from orders o where o.product_name = 'A'
) and c.customer_id in (
    select o.customer_id from orders o where o.product_name = 'B'
) and c.customer_id not in (
    select o.customer_id from orders o where o.product_name = 'C'
)
order by c.customer_name