DROP PROCEDURE p_unused/
DROP PROCEDURE p_author_exists/
DROP PROCEDURE p_create_author/
DROP PROCEDURE p_create_author_by_name/
DROP PROCEDURE p391/

DROP FUNCTION f_author_exists/
DROP FUNCTION f_one/
DROP FUNCTION f_number/
DROP FUNCTION f317/

DROP VIEW v_library/
DROP VIEW v_author/
DROP VIEW v_book/

DROP TRIGGER t_triggers_trigger/

DROP TABLE t_dates/
DROP TABLE t_triggers/
DROP TABLE t_book_to_book_store/
DROP TABLE t_book_store/
DROP TABLE t_book/
DROP TABLE t_book_details/
DROP TABLE t_author/
DROP TABLE t_language/
DROP TABLE x_test_case_71/
DROP TABLE x_test_case_64_69/
DROP TABLE x_test_case_85/
DROP TABLE t_986_1/
DROP TABLE t_986_2/
DROP TABLE x_unused/
DROP TABLE t_639_numbers_table/
DROP TABLE t_658_ref/
DROP TABLE t_658_11/
DROP TABLE t_658_21/
DROP TABLE t_658_31/
DROP TABLE t_658_12/
DROP TABLE t_658_22/
DROP TABLE t_658_32/
DROP TABLE t_725_lob_test/
DROP TABLE t_785/
DROP TABLE t_booleans/
DROP TABLE t_identity/
DROP TABLE t_identity_pk/

CREATE TABLE t_identity_pk (
  id INTEGER GENERATED BY DEFAULT AS IDENTITY,
  val int,

  CONSTRAINT pk_t_identity_pk PRIMARY KEY (id)
)
/

CREATE TABLE t_identity (
  id INTEGER GENERATED BY DEFAULT AS IDENTITY,
  val int
)
/

CREATE TABLE t_dates (
  id int not null,
  d date,
  t time,
  ts timestamp,
  d_int int,
  ts_bigint bigint,

  CONSTRAINT pk_t_dates PRIMARY KEY (id)
)
/

CREATE TABLE t_booleans (
  id int not null,
  one_zero int,
  true_false_lc varchar(5),
  true_false_uc varchar(5),
  yes_no_lc varchar(3),
  yes_no_uc varchar(3),
  y_n_lc char(1),
  y_n_uc char(1),
  vc_boolean varchar(1),
  c_boolean char(1),
  n_boolean int,

  CONSTRAINT pk_t_booleans PRIMARY KEY (id)
)
/

DROP SEQUENCE s_trigger_id/
CREATE SEQUENCE s_trigger_id/

CREATE TABLE t_triggers (
  id_generated int not null,
  id int,
  counter int,

  CONSTRAINT pk_t_triggers PRIMARY KEY (id_generated)
)
/

CREATE TRIGGER t_triggers_trigger
BEFORE INSERT
ON t_triggers
REFERENCING NEW AS new
FOR EACH ROW
BEGIN
	select s_trigger_id.nextval into new.id_generated from sysibm.dual;

	set new.id = new.id_generated;
	set new.counter = new.id_generated * 2;
END
/

CREATE TABLE t_language (
  cd CHAR(2) NOT NULL,
  description VARCHAR(50),
  description_english VARCHAR(50),
  id INTEGER NOT NULL,

  CONSTRAINT pk_t_language PRIMARY KEY (ID)
)
/

CREATE TABLE t_658_11 (
  id CHAR(3) NOT NULL,

  CONSTRAINT pk_t_658_11 PRIMARY KEY (id)
)
/

CREATE TABLE t_658_21 (
  id INT NOT NULL,

  CONSTRAINT pk_t_658_21 PRIMARY KEY (id)
)
/

CREATE TABLE t_658_31 (
  id BIGINT NOT NULL,

  CONSTRAINT pk_t_658_31 PRIMARY KEY (id)
)
/

CREATE TABLE t_658_12 (
  id CHAR(3) NOT NULL,
  cd CHAR(3) NOT NULL,

  CONSTRAINT pk_t_658_12 PRIMARY KEY (id)
)
/

CREATE TABLE t_658_22 (
  id INT NOT NULL,
  cd INT NOT NULL,

  CONSTRAINT pk_t_658_22 PRIMARY KEY (id)
)
/

CREATE TABLE t_658_32 (
  id BIGINT NOT NULL,
  cd BIGINT NOT NULL,

  CONSTRAINT pk_t_658_32 PRIMARY KEY (id)
)
/

CREATE TABLE t_658_ref (
  ref_11 char(3),
  ref_21 int,
  ref_31 bigint,
  ref_12 char(3),
  ref_22 int,
  ref_32 bigint,

  CONSTRAINT fk_t_658_11 FOREIGN KEY (ref_11) REFERENCES t_658_11(id),
  CONSTRAINT fk_t_658_21 FOREIGN KEY (ref_21) REFERENCES t_658_21(id),
  CONSTRAINT fk_t_658_31 FOREIGN KEY (ref_31) REFERENCES t_658_31(id),
  CONSTRAINT fk_t_658_12 FOREIGN KEY (ref_12) REFERENCES t_658_12(id),
  CONSTRAINT fk_t_658_22 FOREIGN KEY (ref_22) REFERENCES t_658_22(id),
  CONSTRAINT fk_t_658_32 FOREIGN KEY (ref_32) REFERENCES t_658_32(id)
)
/

CREATE TABLE t_725_lob_test (
  ID int NOT NULL,
  LOB BLOB NULL,

  CONSTRAINT pk_t_725_lob_test PRIMARY KEY (id)
)
/

CREATE TABLE t_785 (
  ID int,
  NAME varchar(50),
  VALUE varchar(50)
)
/

CREATE TABLE t_author (
  ID INT NOT NULL,
  FIRST_NAME VARCHAR(50),
  LAST_NAME VARCHAR(50) NOT NULL,
  DATE_OF_BIRTH DATE,
  YEAR_OF_BIRTH INT,
  ADDRESS VARCHAR(200),

  CONSTRAINT pk_t_author PRIMARY KEY (ID)
)
/

CREATE TABLE t_book_details (
    ID INT NOT NULL,

    CONSTRAINT pk_t_book_details PRIMARY KEY (ID)
)
/

CREATE TABLE t_book (
  ID INT NOT NULL,
  AUTHOR_ID INT NOT NULL,
  co_author_id int,
  DETAILS_ID INT,
  TITLE VARCHAR(400) NOT NULL,
  PUBLISHED_IN INT NOT NULL,
  LANGUAGE_ID INT NOT NULL,
  CONTENT_TEXT LONG VARCHAR,
  CONTENT_PDF BLOB,

  CONSTRAINT pk_t_book PRIMARY KEY (ID),
  CONSTRAINT fk_t_book_author_id FOREIGN KEY (AUTHOR_ID) REFERENCES T_AUTHOR(ID),
  CONSTRAINT fk_t_book_co_author_id FOREIGN KEY (CO_AUTHOR_ID) REFERENCES T_AUTHOR(ID),
  CONSTRAINT fk_t_book_details_id FOREIGN KEY (DETAILS_ID) REFERENCES T_BOOK_DETAILS(ID),
  CONSTRAINT fk_t_book_language_id FOREIGN KEY (LANGUAGE_ID) REFERENCES T_LANGUAGE(ID)
)
/


CREATE TABLE t_book_store (
  name VARCHAR(400) NOT NULL,

  CONSTRAINT uk_t_book_store_name UNIQUE(name)
)
/

CREATE TABLE t_book_to_book_store (
  book_store_name VARCHAR(400) NOT NULL,
  book_id INTEGER NOT NULL,
  stock INTEGER,

  CONSTRAINT pk_b2bs PRIMARY KEY(book_store_name, book_id),
  CONSTRAINT fk_b2bs_bs_name FOREIGN KEY (book_store_name)
                             REFERENCES t_book_store (name)
                             ON DELETE CASCADE,
  CONSTRAINT fk_b2bs_b_id    FOREIGN KEY (book_id)
                             REFERENCES t_book (id)
                             ON DELETE CASCADE
)
/


CREATE TABLE x_unused (
  ID INT NOT NULL,
  NAME VARCHAR(10) NOT NULL,
  BIG_INTEGER DECIMAL(25),
  ID_REF INT,
  CLASS INT,
  FIELDS INT,
  TABLE INT,
  CONFIGURATION INT,
  U_D_T INT,
  META_DATA INT,
  VALUES INT,
  TYPE0 INT,
  PRIMARY_KEY INT,
  PRIMARYKEY INT,
  NAME_REF VARCHAR(10),
  "FIELD 737" DECIMAL(25, 2),

  CONSTRAINT pk_x_unused PRIMARY KEY(ID, NAME),
  CONSTRAINT uk_x_unused_id UNIQUE(ID),
  CONSTRAINT fk_x_unused_self FOREIGN KEY(ID_REF, NAME_REF) REFERENCES X_UNUSED(ID, NAME)
)
/

CREATE TABLE t_986_1 (
  REF INT NOT NULL,

  CONSTRAINT pk_986 PRIMARY KEY(REF),
  CONSTRAINT uk_986 UNIQUE(REF),
  CONSTRAINT fk_986 FOREIGN KEY(REF) REFERENCES X_UNUSED(ID)
)
/

CREATE TABLE t_986_2 (
  REF INT NOT NULL,

  CONSTRAINT pk_986 PRIMARY KEY(REF),
  CONSTRAINT uk_986 UNIQUE(REF),
  CONSTRAINT fk_986 FOREIGN KEY(REF) REFERENCES X_UNUSED(ID)
)
/

CREATE TABLE t_639_numbers_table (
  ID INT NOT NULL,
  SHORT SMALLINT,
  "INTEGER" INT,
  "LONG" BIGINT,
  BYTE_DECIMAL DECIMAL(2, 0),
  SHORT_DECIMAL DECIMAL(4, 0),
  INTEGER_DECIMAL DECIMAL(9, 0),
  LONG_DECIMAL DECIMAL(18, 0),
  BIG_INTEGER DECIMAL(22, 0),
  BIG_DECIMAL DECIMAL(22, 5),
  "FLOAT" REAL,
  "DOUBLE" DOUBLE,

  CONSTRAINT pk_t_639_numbers_table PRIMARY KEY(ID)
)
/

CREATE TABLE x_test_case_64_69 (
  ID INT NOT NULL,
  UNUSED_ID INT,

  CONSTRAINT pk_x_test_case_64_69 PRIMARY KEY(ID),
  CONSTRAINT fk_x_test_case_64_69 FOREIGN KEY(UNUSED_ID) REFERENCES X_UNUSED(ID)
)
/

CREATE TABLE x_test_case_71 (
  ID INT NOT NULL,
  TEST_CASE_64_69_ID SMALLINT,

  CONSTRAINT pk_x_test_case_71 PRIMARY KEY(ID),
  CONSTRAINT fk_x_test_case_71 FOREIGN KEY(TEST_CASE_64_69_ID) REFERENCES X_TEST_CASE_64_69(ID)
)
/

CREATE TABLE x_test_case_85 (
  id int NOT NULL,
  x_unused_id int,
  x_unused_name VARCHAR(10),

  CONSTRAINT pk_x_test_case_85 PRIMARY KEY(ID),
  CONSTRAINT fk_x_test_case_85 FOREIGN KEY(x_unused_id, x_unused_name) REFERENCES X_UNUSED(id, name)
)
/

CREATE VIEW V_LIBRARY (AUTHOR, TITLE) AS
SELECT T_AUTHOR.FIRST_NAME || ' ' || T_AUTHOR.LAST_NAME, T_BOOK.TITLE
FROM T_AUTHOR JOIN T_BOOK ON T_BOOK.AUTHOR_ID = T_AUTHOR.ID
/

CREATE VIEW v_author AS
SELECT * FROM t_author
/

CREATE VIEW v_book AS
SELECT * FROM t_book
/

CREATE PROCEDURE p_unused (IN in1 VARCHAR(50), OUT out1 INT, INOUT out2 INT) LANGUAGE SQL
BEGIN
	SET out1 = 0;
	SET out2 = 0;
END
/

CREATE PROCEDURE p_author_exists (IN author_name VARCHAR(50), OUT result INT) LANGUAGE SQL
BEGIN
  SELECT COUNT(*) INTO result
    FROM t_author
   WHERE first_name LIKE author_name
      OR last_name LIKE author_name;
END
/

CREATE PROCEDURE p_create_author_by_name (IN first_name VARCHAR(50), IN last_name VARCHAR(50)) LANGUAGE SQL
BEGIN
	INSERT INTO T_AUTHOR (ID, FIRST_NAME, LAST_NAME)
	VALUES ((SELECT MAX(ID)+1 FROM T_AUTHOR), first_name, last_name);
END
/

CREATE PROCEDURE p_create_author() LANGUAGE SQL
BEGIN
	call {jdbc.Schema}.p_create_author_by_name('William', 'Shakespeare');
END
/

CREATE PROCEDURE p391 (
	IN i1 INTEGER, INOUT io1 INTEGER, OUT o1 INTEGER,
	OUT o2 INTEGER, INOUT io2 INTEGER, IN i2 INTEGER) LANGUAGE SQL
BEGIN
  SET o1 = io1;
  SET io1 = i1;

  SET o2 = io2;
  SET io2 = i2;
END
/

CREATE FUNCTION f_author_exists (author_name varchar(50))
     RETURNS INTEGER
     LANGUAGE SQL
     READS SQL DATA
     NO EXTERNAL ACTION
     DETERMINISTIC
     RETURN
        SELECT COUNT(*)
    FROM t_author
   	WHERE first_name = author_name
      	OR last_name = author_name
/

CREATE FUNCTION f_one ()
	RETURNS INTEGER
	LANGUAGE SQL
	DETERMINISTIC
	RETURN 1
/

CREATE FUNCTION f_number (n integer)
	RETURNS INTEGER
	LANGUAGE SQL
	DETERMINISTIC
	RETURN n
/

CREATE FUNCTION f317 (p1 INTEGER, p2 INTEGER, p3 INTEGER, p4 INTEGER)
    RETURNS INTEGER
    LANGUAGE SQL
    DETERMINISTIC
 	RETURN 1000 * p1 + 100 * p2 + p4
/
