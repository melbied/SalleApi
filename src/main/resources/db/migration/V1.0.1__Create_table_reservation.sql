CREATE TABLE RESERVATION(
    ID_RESERVATION INT NOT NULL AUTO_INCREMENT,
	COMMENTAIRE VARCHAR(255),
	DATEDEBUT DATE,
	DATEFIN DATE,
	ID_SALLE INT,
	ID_MOTIF INT,

	CONSTRAINT PK_RESERVATION PRIMARY KEY(ID_RESERVATION ),
    CONSTRAINT FK_RESERVATION_SALLE FOREIGN KEY(ID_SALLE ) REFERENCES SALLE(ID_SALLE),
	CONSTRAINT FK_RESERVATION_MOTIF FOREIGN KEY(ID_SALLE ) REFERENCES SALLE(ID_SALLE)

);