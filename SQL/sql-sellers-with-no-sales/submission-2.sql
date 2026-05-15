-- Write your query below
SELECT distinct s.seller_name from seller s
WHERE s.seller_id not in (Select seller_id from orders where EXTRACT(YEAR FROM sale_date) = 2020 )
ORDER BY s.seller_name