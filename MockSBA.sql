SELECT * FROM users;
SELECT * FROM orders;

-- Question 1
SELECT * FROM orders o, users u WHERE o.user_id = u.user_id AND u.first_name = "Marion";

