# Write your MySQL query statement below
(
select name as results from Users as p join MovieRating as m on p.user_id = m.user_id
group by m.user_id order by count(*) desc, results asc limit 1
)
union all
    (select m1.title as results from Movies as m1 join MovieRating as m2 on m1.movie_id = m2.movie_id where month(created_at)=2 and year(created_at)=2020 group by m2.movie_id order by avg(rating) desc, results asc limit 1)