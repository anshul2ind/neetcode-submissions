CREATE TABLE stocks (
  id INTEGER PRIMARY KEY,
  name TEXT,
  transaction_dates DATE[]
);

-- Do not modify above this line --

insert into stocks ( id, name, transaction_dates)
values(1,'AAPL', ARRAY['2007-02-09'::date, '2007-02-10'::date, '2007-02-11'::date]),
(2, 'GOOG', ARRAY['2004-12-15'::date, '2004-12-16'::date]);





-- Do not modify below this line --
SELECT * FROM stocks;
