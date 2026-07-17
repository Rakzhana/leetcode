-- Last updated: 17/07/2026, 15:11:23
# Write your MySQL query statement below
SELECT
    Request_at AS Day,
    ROUND(
        SUM(CASE
                WHEN Status IN ('cancelled_by_driver', 'cancelled_by_client')
                THEN 1
                ELSE 0
            END) / COUNT(*),
        2
    ) AS "Cancellation Rate"
FROM Trips t
JOIN Users c
    ON t.Client_Id = c.Users_Id
JOIN Users d
    ON t.Driver_Id = d.Users_Id
WHERE c.Banned = 'No'
  AND d.Banned = 'No'
  AND Request_at BETWEEN '2013-10-01' AND '2013-10-03'
GROUP BY Request_at;