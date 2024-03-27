1- Let's create a table named employee in your test database with column information id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100).

```Sql

CREATE TABLE employee (
	id SERIAL PRIMARY KEY,
	name VARCHAR(50) NOT NULL,
	birthday DATE,
	email VARCHAR(100)
);

```


2- Let's add 50 data to the employee table we created using the 'Mockaroo' service.

```Sql

insert into employee (name, birthday, email) values ('Darin Colecrough', '1937-03-08', 'dcolecrough0@gmpg.org');
insert into employee (name, birthday, email) values ('Pierrette Note', '1935-04-30', 'pnote1@dropbox.com');
insert into employee (name, birthday, email) values ('Hallsy Muscat', '1917-12-10', 'hmuscat2@usgs.gov');
insert into employee (name, birthday, email) values ('Morgan Tabor', '1921-07-12', 'mtabor3@1und1.de');
insert into employee (name, birthday, email) values ('Laurie Daid', '1942-04-28', null);
insert into employee (name, birthday, email) values ('Elfrida Hallut', '1954-06-17', 'ehallut5@omniture.com');
insert into employee (name, birthday, email) values ('Toiboid Mongain', '1945-08-05', 'tmongain6@noaa.gov');
insert into employee (name, birthday, email) values ('Hortense Gosz', '1919-07-27', 'hgosz7@geocities.com');
insert into employee (name, birthday, email) values ('Saundra Salleir', '1932-05-18', 'ssalleir8@indiegogo.com');
insert into employee (name, birthday, email) values ('Alberik Hugh', '1949-04-01', 'ahugh9@scientificamerican.com');
insert into employee (name, birthday, email) values ('Andriana Lyles', '1955-09-07', 'alylesa@odnoklassniki.ru');
insert into employee (name, birthday, email) values ('Eddy Rosenberger', '1941-02-03', 'erosenbergerb@foxnews.com');
insert into employee (name, birthday, email) values ('Mellisent Jodrelle', '1947-11-01', null);
insert into employee (name, birthday, email) values ('Rozalie Gerge', '1924-06-06', 'rgerged@creativecommons.org');
insert into employee (name, birthday, email) values ('Elsbeth Borland', '1920-08-28', 'eborlande@miitbeian.gov.cn');
insert into employee (name, birthday, email) values ('Gabbie Lavigne', '1933-04-15', 'glavignef@usa.gov');
insert into employee (name, birthday, email) values ('Lief Grestye', '1925-01-28', 'lgrestyeg@addthis.com');
insert into employee (name, birthday, email) values ('Bail Malcolmson', '1944-09-09', 'bmalcolmsonh@angelfire.com');
insert into employee (name, birthday, email) values ('Clo Scurrer', '1938-09-26', 'cscurreri@state.gov');
insert into employee (name, birthday, email) values ('Maridel Erskine Sandys', '1927-07-24', 'merskinej@paginegialle.it');
insert into employee (name, birthday, email) values ('Gerladina Dunsire', '1941-10-06', 'gdunsirek@reference.com');
insert into employee (name, birthday, email) values ('Gert Haysman', '1931-04-28', 'ghaysmanl@wikia.com');
insert into employee (name, birthday, email) values ('Hattie Klambt', '1925-10-19', 'hklambtm@harvard.edu');
insert into employee (name, birthday, email) values ('Chane Huck', null, 'chuckn@hp.com');
insert into employee (name, birthday, email) values ('Scott O''Sheeryne', '1915-06-14', 'sosheeryneo@friendfeed.com');
insert into employee (name, birthday, email) values ('Aggie Rotlauf', '1928-08-29', 'arotlaufp@mozilla.org');
insert into employee (name, birthday, email) values ('Etty Davidesco', '1934-09-14', 'edavidescoq@dagondesign.com');
insert into employee (name, birthday, email) values ('Tiertza Keymer', '1955-10-18', 'tkeymerr@github.com');
insert into employee (name, birthday, email) values ('Curr Hessel', '1954-01-12', 'chessels@ehow.com');
insert into employee (name, birthday, email) values ('Mandi Guerrero', '1955-11-09', 'mguerrerot@gravatar.com');
insert into employee (name, birthday, email) values ('Englebert Marchington', '1945-08-26', 'emarchingtonu@washington.edu');
insert into employee (name, birthday, email) values ('Dell Sumbler', '1946-01-14', 'dsumblerv@squidoo.com');
insert into employee (name, birthday, email) values ('Chrystel Glencross', '1933-12-13', 'cglencrossw@last.fm');
insert into employee (name, birthday, email) values ('Nicol Boothroyd', '1921-08-11', 'nboothroydx@engadget.com');
insert into employee (name, birthday, email) values ('Siffre Mahon', '1934-08-17', 'smahony@istockphoto.com');
insert into employee (name, birthday, email) values ('Myrtice Wadhams', '1953-08-31', 'mwadhamsz@ovh.net');
insert into employee (name, birthday, email) values ('Ulrich Zanolli', '1955-11-24', 'uzanolli10@spiegel.de');
insert into employee (name, birthday, email) values ('Leontyne Oggers', null, 'loggers11@mac.com');
insert into employee (name, birthday, email) values ('Derry Elt', '1919-08-25', 'delt12@va.gov');
insert into employee (name, birthday, email) values ('Caressa Stollard', '1952-03-28', 'cstollard13@vistaprint.com');
insert into employee (name, birthday, email) values ('Dene O''Dulchonta', '1956-04-22', 'dodulchonta14@godaddy.com');
insert into employee (name, birthday, email) values ('Emmye Brazil', '1945-01-29', 'ebrazil15@desdev.cn');
insert into employee (name, birthday, email) values ('Edin Whitworth', '1949-02-15', 'ewhitworth16@de.vu');
insert into employee (name, birthday, email) values ('Binnie Finders', '1932-10-31', 'bfinders17@ow.ly');
insert into employee (name, birthday, email) values ('Agna Drissell', '1955-04-28', null);
insert into employee (name, birthday, email) values ('Lolly Roman', '1937-01-27', 'lroman19@meetup.com');
insert into employee (name, birthday, email) values ('Eustacia Muino', '1918-09-22', 'emuino1a@tinyurl.com');
insert into employee (name, birthday, email) values ('Nara Pedrollo', '1926-08-15', 'npedrollo1b@ucoz.ru');
insert into employee (name, birthday, email) values ('Avram Dike', '1944-01-23', 'adike1c@cornell.edu');
insert into employee (name, birthday, email) values ('Violetta Oakinfold', '1938-03-14', 'voakinfold1d@youtube.com');

```
3- Let's perform 5 UPDATE operations for each column that will update the other columns.

```Sql

UPDATE employee
SET name = 'J.J. Rousseau'
WHERE id = 13;

```

```Sql

UPDATE employee
SET birthday = '1937-04-13'
WHERE name LIKE 'Vi%';

```

```Sql

UPDATE employee
SET name = 'Dimitri Mendleyev'
WHERE email LIKE '%.ru';

```

```Sql

UPDATE employee
SET name = 'Pat Hanrahan'
WHERE birthday = '1954-06-17';

```

```Sql

UPDATE employee
SET birthday = '1900-01-01'
WHERE name ILIKE '%gh%';

```

4- Let's perform 5 DELETE operations that will delete the relevant row for each column.

```Sql

DELETE FROM employee
WHERE birthday = '1900-01-01';

```

```Sql

DELETE FROM employee
WHERE name ILIKE '%ls%';

```

```Sql

DELETE FROM employee
WHERE email ILIKE '%ox%';

```

```Sql

DELETE FROM employee
WHERE name LIKE 'J%';

```

```Sql

DELETE FROM employee
WHERE id > 40;

```
