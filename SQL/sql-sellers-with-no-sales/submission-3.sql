-- Write your query below
SELECT seller_name FROM seller s
WHERE NOT EXISTS (
    SELECT 1 FROM orders o
    where o.seller_id = s.seller_id and EXTRACT(YEAR FROM o.sale_date) = 2020
)
ORDER BY seller_name