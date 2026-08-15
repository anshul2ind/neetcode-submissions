CREATE TABLE customers (
    id INTEGER PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    name TEXT
);

CREATE TABLE orders (
    id INTEGER PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    customer_id INTEGER,
    price INTEGER
);

INSERT INTO customers (name) VALUES
  ('Alice'),
  ('Bob'),
  ('Charlie'),
  ('David'),
  ('Eve'),
  ('Frank'),
  ('Grace'),
  ('Hank');

INSERT INTO orders (customer_id, price) VALUES
  (1, 50),
  (2, 100),
  (3, 150),
  (4, 200),
  (5, 250),
  (6, 300),
  (7, 70),
  (8, 400);
-- Do not modify above this line. --




-- select name
-- from customers c
-- where id = any (
--     select distinct customer_id
--     from orders
--     where price < 100
-- )
-- order by name;

select c.name as name
from customers c
where exists (
    select 1
    from orders o
    where o.price < 100 and o.customer_id = c.id
)
order by name asc;






