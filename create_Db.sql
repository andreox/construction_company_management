CREATE TABLE Fattura( Fatt_id SERIAL NOT NULL, Acquisto BOOLEAN NOT NULL, PRIMARY KEY(Fatt_id)) ;

CREATE TABLE Fornitore( Forn_id SERIAL NOT NULL, Nome VARCHAR(30), Indirizzo VARCHAR(60), Telefono VARCHAR(10), PRIMARY KEY(Forn_id));

CREATE TABLE Cliente( Client_id SERIAL NOT NULL, Nome VARCHAR(30), Indirizzo VARCHAR(60), Telefono VARCHAR(10), PRIMARY KEY(Client_id)) ;

CREATE TABLE Fatture_Acquisti( Fatt_Acquisti SERIAL NOT NULL, Fatt_id SERIAL NOT NULL, Forn_id SERIAL NOT NULL,
							   File_location VARCHAR(50), FOREIGN KEY (Fatt_id) REFERENCES Fattura(Fatt_id), 
							   FOREIGN KEY (Forn_id) REFERENCES Fornitore(Forn_id)) ;
							   
CREATE TABLE Fatture_Vendite( Fatt_Vendite SERIAL NOT NULL, Fatt_id SERIAL NOT NULL, Client_id SERIAL NOT NULL,
							   File_location VARCHAR(50), FOREIGN KEY (Fatt_id) REFERENCES Fattura(Fatt_id), 
							   FOREIGN KEY (Client_id) REFERENCES Cliente(Client_id)) ;
							 

ALTER TABLE Fatture_Acquisti ADD COLUMN Data_fattura DATE ;
ALTER TABLE Fatture_Vendite ADD COLUMN Data_fattura DATE ;

CREATE TABLE Cantiere( Cantiere_Id SERIAL NOT NULL, Luogo VARCHAR(50), PRIMARY KEY( Cantiere_Id)) ;
CREATE TABLE Operaio( Operaio_Id SERIAL NOT NULL, Nome VARCHAR(15), Cognome VARCHAR(20), Data_nasc DATE, PRIMARY KEY(Operaio_Id)) ;
CREATE TABLE Operaio_Cantiere( LavoroId SERIAL NOT NULL, Cantiere_Id SERIAL NOT NULL, Operaio_Id SERIAL NOT NULL , Ore_Lavorate INT NOT NULL,
							 	PRIMARY KEY(LavoroId), FOREIGN KEY (Cantiere_Id) REFERENCES Cantiere(Cantiere_Id),
							 	FOREIGN KEY(Operaio_Id) REFERENCES Operaio(Operaio_Id)) ;

CREATE TABLE Materiale( Materiale_Id SERIAL NOT NULL, Nome VARCHAR(15), Tipologia VARCHAR(10), PRIMARY KEY(Materiale_Id)) ;
CREATE TABLE Materiale_Cantiere( MaterialeImpiegatoId SERIAL NOT NULL, Cantiere_Id SERIAL NOT NULL, Materiale_Id SERIAL NOT NULL , Qta INT NOT NULL,
							 	PRIMARY KEY(MaterialeImpiegatoId), FOREIGN KEY (Cantiere_Id) REFERENCES Cantiere(Cantiere_Id),
							 	FOREIGN KEY(Materiale_Id) REFERENCES Materiale(Materiale_Id) );
								
CREATE TABLE SpesaExtra( SpesaId SERIAL NOT NULL, Tipologia VARCHAR(30), PRIMARY KEY(SpesaId)) ;

CREATE TABLE Spesa_Cantiere( SpesaCantiereId SERIAL NOT NULL, Costo FLOAT NOT NULL, CantiereId SERIAL NOT NULL, SpesaId SERIAL NOT NULL,
						   		PRIMARY KEY( SpesaCantiereId), FOREIGN KEY(CantiereId) REFERENCES Cantiere(Cantiere_Id),
								FOREIGN KEY(SpesaId) REFERENCES SpesaExtra(SpesaId)) ;
								
