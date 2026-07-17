-- Last updated: 17/07/2026, 15:10:37
# Write your MySQL query statement below
select *, if(x+y>z and y+z>x and x+z>y, "Yes","No") as triangle from triangle