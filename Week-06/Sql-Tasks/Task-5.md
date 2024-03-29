# Perform the following query scenarios using the dvdrental sample database.
1- List the 5 longest movies in the movie table whose title ends with the character 'n'.

```Sql

SELECT * FROM film
WHERE title LIKE '%n'
ORDER BY length DESC
LIMIT 5;

```

2- List the second shortest 5 movies (6,7,8,9,10) in the movie table whose movie names end with the character 'n'.

```Sql

SELECT * FROM film
WHERE title LIKE '%n'
ORDER BY length ASC
OFFSET 5
LIMIT 5;

```

3- Sort the first 4 data in descending order according to the last_name column in the Customer table, provided that store_id is 1.

```Sql

SELECT * FROM customer
WHERE store_id = 1
ORDER BY last_name DESC
LIMIT 4;

```
