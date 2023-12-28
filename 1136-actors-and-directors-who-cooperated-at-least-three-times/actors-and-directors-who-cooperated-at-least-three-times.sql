# Write your MySQL query statement below
select ActorDirector.actor_id,ActorDirector.director_id from ActorDirector group by actor_id,director_id having count(actor_id)>=3