CREATE DATABASE clinica
USE clinica;

-- comando para criar a tabela cidades;
CREATE TABLE cidades (
	id INT primary key not null auto_increment,
    nome varchar(70),
    estado enum('SP', 'RJ', 'MG', 'RS', 'ES', 'MT', 'PR', 'SC', 'DF' ));
    
    alter table cidades
		modify column nome varchar(70) not null;
        
        describe cidades;

CREATE table planoSaude (
	id int primary key not null auto_increment,
    nome varchar(50) not null);
    
CREATE table alergias (
	id int primary key not null auto_increment,
    nome varchar(50) not null);
    
create table paciente (
	id int primary key not null auto_increment,
    nome varchar(100) not null,
    CPF char(14) not null unique,
    Dt_Nas date not null,
    endereco varchar(120) not null,
	telefone varchar(20), 
    sexo enum('F', 'm' ),
    idmunicipios int not null,
    idplano int not null,
    idalergias int not null,
FOREIGN KEY (idmunicipios) references municipios(id),
FOREIGN KEY (idplano) references planoSaude(id),
FOREIGN key (idalergias) references alergias(id)); 
    
 ALTER TABLE paciente
	add column email varchar(100);
    
ALTER table paciente
	drop column telefone;
    
alter table paciente
	modify column endereco varchar(150) not null;
    
alter table paciente
	rename column Dt_Nas to dataNascimento;
    
create table especialidade (
	id int primary key not null auto_increment,
    nomeEsp varchar(50) not null);
    
alter table paciente
	add column idespecialidade int not null,
add constraint paciente_ibfk_4 foreign key (idespecialidade) references especialidade(id);
    
show create table paciente;

alter table paciente
	drop foreign key paciente_ibfk_2;

INSERT INTO alergias (nome) VALUES
	('Camarão'),
    ('Amendoim'),
    ('Chocolate'),
    ('Peixe'),
    ('Farinha Branca'),
    ('Nozes'),
    ('Poeira'),
    ('Gato'),
    ('Cachorro');
    
select * from alergias;
delete from alergias;

alter table cidades rename to municipios;

alter table paciente
	modify column CEP char(9) not null;
    
alter table paciente
	add column dataCadastro datetime default current_timestamp();
    
   INSERT INTO municipios (nome, estado)
VALUES
    ('São Paulo', 'SP'),
    ('Rio de Janeiro', 'RJ'),
    ('Belo Horizonte', 'MG'),
    ('Vitória', 'ES'),
    ('Florianópolis', 'SC'),
    ('Porto Alegre', 'RS'),
    ('Campinas', 'SP'),
    ('Niterói', 'RJ'),
    ('Belo Horizonte', 'MG'),
    ('Santos', 'SP'),
    ('Curitiba', 'ES'),
    ('Guarulhos', 'SP'),
    ('São Gonçalo', 'RJ'),
    ('Contagem', 'MG'),
    ('Serra', 'ES'),
    ('Joinville', 'SC'),
    ('Caxias do Sul', 'RS'),
    ('Osasco', 'SP');
    
    
    INSERT INTO planoSaude (Nome) VALUES
	('Unimed'),
    ('Amil'),
    ('Bradesco saúde'),
    ('Particular'),
    ('Albert Einstein');
    
    
    INSERT INTO Paciente (nome, CPF, Dt_Nas, endereco, sexo, idmunicipios, idplano, idalergias) VALUES
('Ana Maria', '123.456.789-00', '1985-06-15', 'Rua das Flores, 123', '(11) 99999-0000', 'F', 1, 2, 3),
('Bruno Silva', '234.567.890-11', '1990-11-23', 'Avenida Central, 45', '(21) 98888-1111', 'M', 2, 3, 4),
('Carla Souza', '345.678.901-22', '1978-03-08', 'Travessa do Bosque, 89', '(31) 97777-2222', 'F', 3, 4, 5),
('Daniel Ferreira', '456.789.012-33', '2000-09-17', 'Rua Ametista, 21', '(41) 96666-3333', 'M', 4, 5, 6),
('Elaine Costa', '567.890.123-44', '1982-01-30', 'Rua das Acácias, 72', '(71) 95555-4444', 'F', 5, 1, 7),
('Felipe Ramos', '678.901.234-55', '1995-05-20', 'Rua do Sol, 11', '(48) 94444-5555', 'M', 6, 2, 8),
('Gabriela Torres', '789.012.345-66', '1989-08-11', 'Rua do Campo, 47', '(51) 93333-6666', 'F', 7, 3, 9),
('Henrique Lima', '890.123.456-77', '1993-12-05', 'Avenida das Palmeiras, 95', '(27) 92222-7777', 'M', 8, 4, 1),
('Isabela Araújo', '901.234.567-88', '1987-04-13', 'Rua do Parque, 56', '(71) 91111-8888', 'F', 9, 5, 2),
('Jorge Almeida', '012.345.678-99', '1991-10-28', 'Rua Rio Branco, 87', '(11) 90000-9999', 'M', 10, 1, 3),
('Karen Santos', '123.456.789-10', '1986-07-25', 'Rua das Magnólias, 13', '(21) 98888-1010', 'F', 11, 2, 4),
('Leonardo Costa', '234.567.890-21', '1994-03-03', 'Avenida das Pedras, 45', '(31) 97777-1111', 'M', 12, 3, 5),
('Mariana Vieira', '345.678.901-32', '1998-02-14', 'Rua Flor de Lis, 62', '(41) 96666-1212', 'F', 13, 4, 6),
('Nelson Barros', '456.789.012-43', '1977-11-11', 'Rua da Lua, 27', '(71) 95555-1313', 'M', 14, 5, 7),
('Olivia Xavier', '567.890.123-54', '1992-06-19', 'Avenida do Sol, 34', '(48) 94444-1414', 'F', 15, 1, 8),
('Pedro Neves', '678.901.234-65', '1981-05-21', 'Rua Esperança, 78', '(51) 93333-1515', 'M', 16, 2, 9),
('Quitéria Alves', '789.012.345-76', '1988-09-29', 'Avenida Primavera, 19', '(27) 92222-1616', 'F', 17, 3, 1),
('Ricardo Gomes', '890.123.456-87', '1997-12-08', 'Rua Santa Luzia, 44', '(71) 91111-1717', 'M', 18, 4, 2),
('Sabrina Moura', '901.234.567-98', '1984-03-23', 'Rua das Amendoeiras, 51', '(11) 90000-1818', 'F', 19, 5, 3),
('Thiago Duarte', '012.345.678-09', '1999-08-30', 'Avenida Atlântica, 31', '(21) 98888-1919', 'M', 20, 1, 4),
('Ursula Pires', '123.456.789-01', '1996-04-04', 'Rua São João, 87', '(31) 97777-2020', 'F', 1, 2, 5),
('Vicente Rocha', '234.567.890-12', '1993-07-15', 'Rua Boa Vista, 45', '(41) 96666-2121', 'M', 2, 3, 6),
('Wanda Oliveira', '345.678.901-23', '1985-10-10', 'Rua dos Girassóis, 34', '(71) 95555-2222', 'F', 3, 4, 7),
('Xavier Lopes', '456.789.012-34', '1983-09-21', 'Avenida do Oceano, 56', '(48) 94444-2323', 'M', 4, 5, 8),
('Yasmin Souza', '567.890.123-45', '1994-05-05', 'Rua da Paz, 71', '(51) 93333-2424', 'F', 5, 1, 9),
('Zeca Ferreira', '678.901.234-56', '1986-02-18', 'Avenida Central, 89', '(27) 92222-2525', 'M', 6, 2, 1),
('Amanda Silva', '789.012.345-67', '1992-12-13', 'Rua Independência, 42', '(71) 91111-2626', 'F', 7, 3, 2),
('Brenda Luz', '890.123.456-78', '1987-08-20', 'Rua Principal, 54', '(11) 90000-2727', 'F', 8, 4, 3),
('Carlos Prado', '901.234.567-89', '1979-11-11', 'Avenida Flores, 36', '(21) 98888-2828', 'M', 9, 5, 4);
    
drop table paciente;