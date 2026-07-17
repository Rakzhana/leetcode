-- Last updated: 17/07/2026, 15:11:59
# Write your MySQL query statement below
SELECT DISTINCT Num AS ConsecutiveNums
FROM Logs
WHERE (Id + 1, Num) IN (
    SELECT Id, Num FROM Logs
)
AND (Id + 2, Num) IN (
    SELECT Id, Num FROM Logs
);