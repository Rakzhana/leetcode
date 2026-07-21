-- Last updated: 21/07/2026, 15:50:20
# Write your MySQL query statement below
select product_id, year as first_year, quantity, price 
from sales where (product_id, year) in 
(
    select product_id, min(year)
    from sales
    group by product_id
)