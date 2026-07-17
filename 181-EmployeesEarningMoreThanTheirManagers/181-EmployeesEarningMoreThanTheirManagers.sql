-- Last updated: 17/07/2026, 15:11:57
SELECT
    e1.name AS Employee
FROM Employee e1
JOIN Employee e2
ON e1.managerId = e2.id
WHERE e1.salary > e2.salary;
# Write your MySQL query statement below
