-- Last updated: 17/07/2026, 15:10:46
# Write your MySQL query statement below
SELECT customer_number
FROM Orders 
GROUP BY customer_number
ORDER BY COUNT(customer_number) DESC
LIMIT 1;