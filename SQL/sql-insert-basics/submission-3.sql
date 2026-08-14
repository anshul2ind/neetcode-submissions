CREATE TYPE account_type AS ENUM ('checking', 'savings', 'cd', 'money_market');

CREATE TABLE bank_accounts (
    id INTEGER PRIMARY KEY,
    account_type account_type,
    balance INTEGER
);
-- Do not modify above this line --

insert into bank_accounts(balance, account_type, id)
values (1000, 'checking', 1),
(2000, 'savings', 2),
(3000, 'cd', 3),
(4000, 'money_market', 4);








-- Do not modify below this line --
SELECT * FROM bank_accounts;
