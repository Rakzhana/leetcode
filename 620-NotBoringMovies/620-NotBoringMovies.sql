-- Last updated: 17/07/2026, 15:10:35
# Write your MySQL query statement below
# Write your MySQL query statement below

SELECT *
FROM cinema c
WHERE c.id % 2 =1 
    AND 
    c.description != 'boring'
ORDER BY c.rating DESC;