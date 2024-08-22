CREATE DATABASE Usuarios; 

USE Usuarios; 

CREATE TABLE IF NOT EXISTS Usuarios( 
	ID_cliente int(8) AUTO_INCREMENT, 
	Email varchar(255) not null, 
	Usuario varchar(255),
	Senha varchar(255),
	PRIMARY KEY (ID_cliente) 
);

select * from Usuarios;