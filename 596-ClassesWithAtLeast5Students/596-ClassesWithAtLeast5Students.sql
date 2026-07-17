-- Last updated: 17/07/2026, 15:10:44
# Write your MySQL query statement below
SELECT class
FROM Courses
GROUP BY class
HAVING COUNT(student) >= 5;