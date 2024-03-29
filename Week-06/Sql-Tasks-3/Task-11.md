# Perform the following query scenarios using the dvdrental sample database.


1- Let's sort all the data for the first_name columns in the actor and customer tables.

```Sql

(
SELECT first_name FROM actor
)
UNION
(
SELECT first_name FROM customer
);

```

2- Let's list the intersecting data for the first_name columns in the actor and customer tables.

```Sql

(
SELECT first_name FROM actor
)
INTERSECT
(
SELECT first_name FROM customer
);

```

3- For the first_name columns in the actor and customer tables, let's list the data that is in the first table but not in the second table.

```Sql

(
SELECT first_name FROM actor
)
EXCEPT
(
SELECT first_name FROM customer
);

```

4- Let's make the first 3 queries for repeating data.

```Sql

(
SELECT first_name FROM actor
)
UNION ALL
(
SELECT first_name FROM customer
);

```

```Sql

(
SELECT first_name FROM actor
)
INTERSECT ALL
(
SELECT first_name FROM customer
);

```

```Sql

(
SELECT first_name FROM actor
)
EXCEPT ALL
(
SELECT first_name FROM customer
);

```
