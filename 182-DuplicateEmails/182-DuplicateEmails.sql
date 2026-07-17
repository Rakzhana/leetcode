-- Last updated: 17/07/2026, 15:11:56
# Write your MySQL query statement below
SELECT Email
FROM Person
GROUP BY Email
HAVING COUNT(*) > 1;