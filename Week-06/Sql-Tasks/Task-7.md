# Perform the following query scenarios using the dvdrental sample database.

1- Group the movies in the movie table according to their rating values.

```Sql

SELECT rating, COUNT(*) FROM film
GROUP BY rating;

```

2- When we group the movies in the movie table according to the replacement_cost column, we use the replacement_cost value for movies with more than 50 movies.
and list the number of movies.

```Sql

SELECT replacement_cost, COUNT(*) FROM film
GROUP BY replacement_cost
HAVING COUNT(*) > 50;

```

3- What are the customer numbers corresponding to the store_id values ​​in the Customer table?

```Sql

SELECT store_id, COUNT(customer_id) FROM customer
GROUP BY store_id;

```

4- After grouping the city data in the City table according to the country_id column, the country_id with the largest number of cities is
Share the information and city number.

```Sql

SELECT country_id, COUNT(city) FROM city
GROUP BY country_id
ORDER BY COUNT(city) DESC;

```
**Output**
```Sql
country_id      count
    44           60
```
