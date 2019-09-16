DROP TABLE users;

CREATE TABLE users(
	ID	INT,
	accountName VARCHAR(50),
	passWord	VARCHAR(50),
	PRIMARY KEY (ID)

);

INSERT INTO users VALUES (1,'admin','admin');