-- Last updated: 17/07/2026, 15:10:32
# Write your MySQL query statement below
UPDATE salary SET sex =
CASE sex
    WHEN 'm' THEN 'f'
    ELSE 'm'
END;