CREATE TABLE Address (
  id_address SERIAL PRIMARY KEY,
  cep VARCHAR(10),
  address VARCHAR(200),
  complement VARCHAR(50),
  neighborhood VARCHAR(100),
  city VARCHAR(100),
  state VARCHAR(2),
  country VARCHAR(100)
);

CREATE TABLE Person (
  person_id SERIAL PRIMARY KEY,
  name VARCHAR(100),
  age INTEGER,
  phone VARCHAR(20),
  height NUMERIC(5,2),
  email VARCHAR(100),
  cpf VARCHAR(14),
  birth_date DATE,
  id_address INTEGER REFERENCES Address(id_address)
);