-- Last updated: 21/07/2026, 15:50:12
# Write your MySQL query statement below


select distinct author_id as id from Views
where author_id = viewer_id 
order by id;