create table products (
    name TEXT default 'Unknown' NOT NULL,
    price INTEGER not NULL,
    quantity INTEGEr default 0
);






-- Do not modify below this line --
SELECT column_name, data_type, is_nullable, column_default
FROM information_schema.columns
WHERE table_name = 'products';
