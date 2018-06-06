create TABLE person
(
  id INTEGER NOT NULL ,
  NAME VARCHAR(255) NOT NULL ,
  location VARCHAR(255),
  birth_date TIMESTAMP ,
  PRIMARY KEY (id)
);
INSERT INTO person (id,NAME,location,birth_date) VALUES (101,'umang','noida',sysdate);
INSERT INTO person (id,NAME,location,birth_date) VALUES (102,'kushal','noida',sysdate);
INSERT INTO person (id,NAME,location,birth_date) VALUES (103,'jewel','noida',sysdate);