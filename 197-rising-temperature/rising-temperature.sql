# Write your MySQL query statement below
select p.id from Weather as p , Weather as q where p.temperature > q.temperature and dateDiff(p.recordDate,q.recordDate)=1