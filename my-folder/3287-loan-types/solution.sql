# Write your MySQL query statement below

SELECT DISTINCT L2.user_id
FROM Loans L1 , Loans L2
WHERE L1.user_id=L2.user_id AND L1.loan_type = 'Mortgage' AND L2.loan_type = 'Refinance'
ORDER BY L1.user_id;
