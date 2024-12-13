# Write your MySQL query statement below

select  
MAX(assignment1 + assignment2 + assignment3) - 
MIN(assignment1 + assignment2 + assignment3) 
AS difference_in_score 
from Scores ;
