CREATE TABLE USER (
   id INT NOT NULL,
   idNo INT NOT NULL,
   name VARCHAR(50) NOT NULL,
   surname VARCHAR(20),
   address VARCHAR (100),
   date_of_birth DATE,
   email VARCHAR(50),
   PRIMARY KEY (id)
);