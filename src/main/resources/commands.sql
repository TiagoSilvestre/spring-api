/* A palavra SERIAL, faz que ele crie um campo autoIncrement, criando uma sequence e associando ao campo
https://www.youtube.com/watch?v=j4Zx6qcLPbE&t=421s
*/

CREATE TABLE users (
 id SERIAL,
 first_name varchar(255) NOT NULL,
 last_name varchar(255) NOT NULL,
 email varchar(255) NOT NULL,
 phone varchar(100) NOT NULL,
 cpf varchar(100) NOT NULL,
 password varchar(100) NOT NULL,
 PRIMARY KEY(id), UNIQUE(cpf), UNIQUE(email)
);


INSERT INTO users  (first_name, last_name, email, phone, cpf, password) VALUES
('Tiago', 'Silvestre', 'tiagosilvestreadm@gmail.com', '998022981', '07137561950', 'a1b2c3d4');



CREATE TABLE users_addresses (
 id SERIAL,
 user_id INTEGER REFERENCES users(id),
 street varchar(255) NOT NULL,
 number varchar(100) NOT NULL,
 complement varchar(255),
 district varchar(150) NOT NULL,
 city varchar(150) NOT NULL,
 state varchar(100) NOT NULL,
 cep varchar(100) NOT NULL,
 PRIMARY KEY(id)
);


INSERT INTO users_addresses (user_id, street, number, complement, district, city, state, cep) VALUES
(1, 'Rua Almirante Barroso', '425', 'apto 102', 'Comerciário', 'Criciúma', 'SC', '88802249');

SELECT * FROM users_addresses;



DROP TABLE users;

CREATE SEQUENCE public.users_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;
