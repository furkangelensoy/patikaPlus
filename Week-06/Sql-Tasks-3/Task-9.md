# Perform the following query scenarios using the dvdrental sample database.

1- Write the INNER JOIN query in which we can see the city and country names in the city table and the country table together.

```Sql

SELECT city, country FROM city
INNER JOIN country ON city.country_id = country.country_id;

```

2- We can see the payment_id in the customer table and the payment table, and the first_name and last_name in the customer table together.
Write the INNER JOIN query.

```Sql

SELECT payment_id, first_name, last_name FROM customer
INNER JOIN payment ON customer.customer_id = payment.customer_id;

```

3- We can see the rental_id in the customer table and the rental table, and the first_name and last_name in the customer table together.
Write the INNER JOIN query.

```Sql

SELECT rental_id, first_name, last_name FROM rental
INNER JOIN customer ON rental.customer_id = customer.customer_id;

```
