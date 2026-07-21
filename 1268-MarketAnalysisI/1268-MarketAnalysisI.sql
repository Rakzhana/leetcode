-- Last updated: 21/07/2026, 15:50:10
# Write your MySQL query statement below
SELECT u.user_id AS buyer_id, join_date, 
IFNULL(COUNT(order_date), 0) AS orders_in_2019 
FROM Users as u
LEFT JOIN
Orders as o
ON u.user_id = o.buyer_id
AND YEAR(order_date) = '2019'
GROUP BY u.user_id