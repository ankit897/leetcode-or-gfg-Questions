# Write your MySQL query statement below
Select Customers.name as Customers from Customers Where id not in (select CustomerId from Orders)