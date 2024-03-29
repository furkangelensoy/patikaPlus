# Perform the following query scenarios using the dvdrental sample database.
1- Write the LEFT JOIN query in which we can see the city and country names in the city table and the country table together.

```Sql

SELECT city.city, country.country FROM city
LEFT JOIN country ON city.country_id = country.country_id;

```

2- We can see the payment_id in the customer table and the payment table, and the first_name and last_name in the customer table together.
Write the RIGHT JOIN query.

```Sql

SELECT payment.payment_id, customer.first_name, customer.last_name FROM payment
RIGHT JOIN customer ON payment.customer_id = customer.customer_id;

```

3- We can see the rental_id in the customer table and the rental table, and the first_name and last_name in the customer table together.
Write the FULL JOIN query.

```Sql

SELECT rental.rental_id, customer.first_name, customer.last_name FROM customer
FULL JOIN rental ON rental.customer_id = customer.customer_id;

```
