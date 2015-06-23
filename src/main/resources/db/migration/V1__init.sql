-- V1__initialise_database.sql
CREATE SEQUENCE CC.s_author_id START WITH 1;

CREATE TABLE CC.author (
  id INT NOT NULL,
  first_name VARCHAR(50),
  last_name VARCHAR(50) NOT NULL,
  date_of_birth DATE,
  year_of_birth INT,
  address VARCHAR(50),

  CONSTRAINT pk_t_author PRIMARY KEY (ID)
);

CREATE SEQUENCE CC.s_user_id START WITH 1;

CREATE TABLE CC.user (
  id INT NOT NULL,
  email VARCHAR(50) NOT NULL,
  username VARCHAR(50) NOT NULL,
  firstname VARCHAR(50),
  lastname VARCHAR(50),

  CONSTRAINT pk_t_user PRIMARY KEY (ID)
);


-- INSERT INTO CC.author VALUES (next value for CC.s_author_id, 'George', 'Orwell', '1903-06-25', 1903, null);
