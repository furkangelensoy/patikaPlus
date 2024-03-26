# Perform the following query scenarios using the dvdrental sample database.

1- The country names in the country column in the Country table start with the character 'A'.
List the ones ending with the character 'a'.

```Sql

SELECT * FROM country
WHERE country LIKE 'A%a';

```

2- It consists of at least 6 characters from the country names in the country column in the country table.
and list the ones ending with the character 'n'.

```Sql

SELECT * FROM country
WHERE country LIKE 'A____%n';

```

3- At least 4 uppercase or lowercase letters from the movie names in the title column of the movie table
List the movie titles that contain the character 'T', regardless of their status.
```Sql

SELECT * FROM film
WHERE title ILIKE '%t%t%t%t%';

```

4- From the data in all columns in the movie table, the title starts with the character 'C' and the length is
Sort the data with (length) greater than 90 and rental_rate 2.99.

```Sql

SELECT * FROM film
WHERE title LIKE 'C%' AND length > 90 AND rental_rate=2.99;

```
