DROP TABLE IF EXISTS planets;
CREATE TABLE planets (id bigserial PRIMARY KEY, name varchar(100), description varchar(1000), circumference int);