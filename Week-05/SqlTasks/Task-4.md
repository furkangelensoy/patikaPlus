# Perform the following query scenarios using the dvdrental sample database.

1- List the different values ​​in the replacement_cost column in the movie table.

```Sql

SELECT DISTINCT replacement_cost FROM film;

```

2- How many different data are there in the replacement_cost column in the movie table?

```Sql

SELECT COUNT(DISTINCT replacement_cost) FROM film;

```
3- How many of the movie titles in the movie table start with the character T and also have a rating equal to 'G'?

```Sql

SELECT COUNT(*) FROM film
WHERE (title LIKE 'T%') AND (rating = 'G');

```
4- How many of the country names in the Country table consist of 5 characters?

```Sql

SELECT COUNT(*) FROM country
WHERE country LIKE '_____';

```
5- How many of the city names in the City table end with the character 'R' or r?

```Sql

SELECT COUNT(*) FROM city
WHERE city ILIKE '%r';

```
