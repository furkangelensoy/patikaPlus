# Perform the following query scenarios using the dvdrental sample database.
1- Enter the data in all columns in the movie table with a replacement cost value greater than or equal to 12.99.
Sort by being less than 16.99 (use the BETWEEN - AND structure.)

```Sql

SELECT * FROM film
WHERE replacement_cost BETWEEN 12.99 AND 16.99;

```

2- Enter the data in the first_name and last_name columns in the actor table as first_name 'Penelope' or
Sort by 'Nick' or 'Ed'. (Use the IN operator.)
```Sql

SELECT first_name, last_name FROM actor
WHERE first_name IN ('Penelope','Nick','Ed');

```

3- The data in all columns in the movie table are rental_rate 0.99, 2.99, 4.99 AND
Sort by replacement_cost 12.99, 15.99, 28.99. (Use the IN operator.)
```Sql

SELECT * FROM film
WHERE rental_rate IN (0.99,2.99,4.99) AND replacement_cost IN (12.99,15.99,28.99);

```
