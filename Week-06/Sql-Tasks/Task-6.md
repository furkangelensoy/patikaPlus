# Perform the following query scenarios using the dvdrental sample database.

1- What is the average of the values ​​in the rental_rate column in the movie table?

```Sql

SELECT AVG(rental_rate) FROM film;

```
**Output:**
````Sql
2.98
````

2- How many of the movies in the movie table start with the character 'C'?

```Sql

SELECT COUNT(*) FROM film
WHERE title LIKE 'C%';

```
**Output:**
````Sql
92
````

3- Among the movies in the movie table, how many minutes is the longest movie with a rental_rate value equal to 0.99?

```Sql

SELECT MAX(length) FROM film
WHERE rental_rate = 0.99;

```
**Output:**
````Sql
184
````

4- How many different replacement_cost values ​​are there for movies in the movie table that are longer than 150 minutes?

```Sql

SELECT COUNT(DISTINCT replacement_cost) FROM film
WHERE length > 150

```
**Output:**
````Sql
21
````
