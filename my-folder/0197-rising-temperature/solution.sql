# Write your MySQL query statement below
select w1.id from weather w1 join weather w2 where 
w2.recordDate=(w1.recordDate- INTERVAL 1 DAY) && 
(w1.temperature>w2.temperature) ;
