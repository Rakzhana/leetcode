-- Last updated: 21/07/2026, 15:50:21
# Write your MySQL query statement below
SELECT 
    p.product_name, 
    s.year, 
    s.price
FROM 
    Sales s
JOIN 
    Product p ON s.product_id = p.product_id;