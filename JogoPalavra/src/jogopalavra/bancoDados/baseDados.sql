create database jogoPalavra;
use JogoPalavra;

create table if not exists assunto (
codAssunto int unsigned not null auto_increment,
nomeAssunto varchar(30),
primary key (codAssunto)
);

create table if not exists palavra(
codPalavra int unsigned not null auto_increment,
codAssunto int unsigned not null, 
palavra varchar(50),
contador int,
primary key (codPalavra),
foreign key (codAssunto) references assunto(codAssunto) on delete cascade
);

create table if not exists usuario
 (
	codUsuario int unsigned not null auto_increment,
	nome varchar(80) ,
	qtdMoedas int,
	senha varchar (256),
	primary key (codUsuario)
);

create table if not exists temaUsuario 
(	
	codUsuario int unsigned not null,
	codAssunto int unsigned not null,
	stats float,
	foreign key (codUsuario) references usuario (codUsuario) on delete cascade,
	foreign key (codAssunto) references assunto (codAssunto) on delete cascade
);


DELIMITER $$  

DROP PROCEDURE IF EXISTS cadastrar $$  

CREATE PROCEDURE cadastrar (in pala varchar(50), in codA int)  
BEGIN 
	DECLARE temp varchar(50);
	declare qtd int;
	declare cont int;
	
	set temp = null;
	set qtd=0;
	set cont=0;

	select palavra into temp from palavra where palavra=pala and codAssunto=codA;
	select contador into qtd from palavra where palavra=pala and codAssunto=codA;
	select codPalavra into cont from palavra where palavra=pala and codAssunto=codA;

	
if temp = pala and qtd >= 0 then
	update palavra set palavra.contador = qtd+1 where palavra.codPalavra = cont;
		
end if ;

if  qtd = 0 then
	 insert into palavra (codAssunto,palavra,contador) values (codA,pala,qtd+1);
end if;
	
END $$  
  
DELIMITER ; 
insert into assunto (nomeAssunto) value ("Escola");
insert into palavra (codAssunto,palavra,contador) value (1,"Jao",50);

call cadastrar(Palavra,codAssunto);
-- exemplo call cadastrar("Jonathan",2)
select * from palavra;
