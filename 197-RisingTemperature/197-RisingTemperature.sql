-- Last updated: 17/07/2026, 15:11:44
# Write your MySQL query statement
SELECT w1.id
FROM Weather w1
JOIN Weather w2
    ON DATEDIFF(w1.recordDate, w2.recordDate) = 1
WHERE w1.temperature > w2.temperature;