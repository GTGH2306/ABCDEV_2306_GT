CREATE DATABASE avions;
USE avions;

CREATE TABLE AVIONS(
   AV SMALLINT CHECK (LENGTH(CONVERT(AV, CHAR)) = 3),
   AVMARQ VARCHAR(15) NOT NULL,
   AVTYPE VARCHAR(15) NOT NULL,
   CAP INT NOT NULL,
   LOC VARCHAR(20) NOT NULL,
   CONSTRAINT pk_avion  PRIMARY KEY(AV)
);

CREATE TABLE PILOTES(
   PIL INT AUTO_INCREMENT,
   PILNOM VARCHAR(15) NOT NULL,
   ADR VARCHAR(20) NOT NULL,
     CONSTRAINT pk_pilotes PRIMARY KEY(PIL)
);

CREATE TABLE VOL(
   VOL CHAR(5),
   VD VARCHAR(20) NOT NULL,
   VA VARCHAR(20) NOT NULL,
   HD SMALLINT NOT NULL CHECK(HD >= 0 AND HD <= 23),
   HA TINYINT NOT NULL CHECK(HA >= 0 AND HA <= 23),
   AV SMALLINT NOT NULL,
   PIL INT NOT NULL,
   PRIMARY KEY(VOL),
   FOREIGN KEY(AV) REFERENCES AVIONS(AV),
   FOREIGN KEY(PIL) REFERENCES PILOTES(PIL)
);

ALTER TABLE vol RENAME TO vols;



INSERT INTO avions(AV, AVMARQ, AVTYPE, CAP, LOC)
VALUES
	(100, 'AIRBUS', 'A320', 300, 'Nice'),
	(101, 'BOEING', 'B707', 250, 'Paris'),
	(102, 'AIRBUS', 'A320', 200, 'Toulouse'),
	(103, 'CARAVELLE', 'Caravelle', 200, 'Toulouse'),
	(104, 'BOEING', 'B747', 400, 'Paris'),
	(105, 'AIRBUS', 'A320', 300, 'Grenoble'),
	(106, 'ATR', 'ATR42', 50, 'Paris'),
	(107, 'BOEING', 'B727', 300, 'Lyon'),
	(108, 'BOEING', 'B727', 300, 'Nantes'),
	(109, 'AIRBUS', 'A340', 350, 'Bastia')

INSERT INTO pilotes(PIL, PILNOM, ADR)
VALUES
	(1, 'SERGE', 'Nice'),
	(2, 'JEAN', 'Paris'),
	(3, 'CLAUDE', 'Grenoble'),
	(4, 'ROBERT', 'Nantes'),
	(5, 'SIMON', 'Paris'),
	(6, 'LUCIEN', 'Toulouse'),
	(7, 'BERTRAND', 'Lyon'),
	(8, 'HERVE', 'Bastia'),
	(9, 'LUC', 'Paris')
	
INSERT INTO vols(VOL, AV, PIL, VD, VA, HD, HA)
VALUES
	('IT100', 100, 1, 'NICE', 'PARIS', 7, 9),
	('IT101', 100, 2, 'PARIS', 'TOULOUSE', 11, 12),
	('IT102', 101, 1, 'PARIS', 'NICE', 12, 14),
	('IT103', 105, 3, 'GRENOBLE', 'TOULOUSE', 9, 11),
	('IT104', 105, 3, 'TOULOUSE', 'GRENOBLE', 17, 19),
	('IT105', 107, 7, 'LYON', 'PARIS', 6, 7),
	('IT106', 109, 8, 'BASTIA', 'PARIS', 10, 13),
	('IT107', 106, 9, 'PARIS', 'BRIVE', 7, 8),
	('IT108', 106, 9, 'BRIVE', 'PARIS', 19, 20),
	('IT109', 107, 7, 'PARIS', 'LYON', 18, 19),
	('IT110', 102, 2, 'TOULOUSE', 'PARIS', 15, 16),
	('IT111', 101, 4, 'NICE', 'NANTES', 17, 19),
	('IT112', 103, 5, 'PARIS', 'NICE', 11, 13),
	('IT113', 104, 6, 'NICE', 'PARIS', 13, 15)

-- 1) Les vols au départs de paris entre 12h et 14h
SELECT * FROM vols
WHERE VD = 'PARIS' AND HD BETWEEN 12 AND 14;

-- 2) Les pilotes dont le nom commence par un S
SELECT * FROM pilotes
WHERE PILNOM LIKE 'S%';

-- 3)  Pour chaque ville, donner le nombre et les capacités minimum et maximum des avions qui s'y trouvent.
SELECT
	LOC AS 'Ville',
	COUNT(*) AS 'NbAvions',
	MIN(CAP) AS 'Cap Min',
	MAX(CAP) AS 'Cap Max'
FROM avions
GROUP BY LOC;

-- 4)  Pour chaque ville, donner la capacité moyenne des avions qui s'y trouvent et cela par type d'avion.
SELECT
	COUNT(*),
	LOC AS 'Ville',
	AVTYPE AS 'Type',
	AVG(CAP) AS 'Cap moyenne'
FROM avions
GROUP BY LOC, AVTYPE;

-- 5) Quelle est la capacité moyenne des avions pour chaque ville ayant plus de 1 avion ?
SELECT
	LOC AS 'Ville',
	ROUND(AVG(CAP), 2) AS 'Cap moyenne'
FROM avions
GROUP BY LOC
HAVING COUNT(*) > 1;

-- 6)  Quels sont les noms des pilotes qui habitent dans la ville de localisation d'un Airbus
SELECT
	PILNOM,
	ADR
FROM pilotes
WHERE ADR IN (SELECT LOC FROM avions WHERE AVMARQ = 'AIRBUS');

-- 7)  Quels sont les noms des pilotes qui conduisent un Airbus et qui habitent dans la ville de localisation d'un Airbus ?
SELECT
	pilotes.PILNOM
FROM pilotes INNER JOIN vols ON pilotes.PIL = vols.PIL
WHERE
	pilotes.ADR IN (SELECT LOC FROM avions WHERE AVMARQ = 'AIRBUS')
	AND vols.AV IN (SELECT AV FROM avions WHERE AVMARQ = 'AIRBUS')
GROUP BY pilotes.PILNOM;

SELECT * FROM vols INNER JOIN avions ON avions.av = vols.av
INNER JOIN pilotes ON pilotes.pil = vols.pil

-- 8)  Quels sont les noms des pilotes qui conduisent un Airbus ou qui habitent dans la ville de localisation d'un Airbus ?
SELECT
	pilotes.PILNOM
FROM pilotes INNER JOIN vols ON pilotes.PIL = vols.PIL
WHERE
	pilotes.ADR IN (SELECT LOC FROM avions WHERE AVMARQ = 'AIRBUS')
	OR vols.AV IN (SELECT AV FROM avions WHERE AVMARQ = 'AIRBUS')
GROUP BY pilotes.PILNOM;

-- 9)  Quels sont les noms des pilotes qui conduisent un Airbus sauf ceux qui habitent dans la ville de localisation d'un Airbus ?
SELECT
	pilotes.PILNOM
FROM pilotes INNER JOIN vols ON pilotes.PIL = vols.PIL
WHERE
	pilotes.ADR NOT IN (SELECT LOC FROM avions WHERE AVMARQ = 'AIRBUS')
	AND vols.AV IN (SELECT AV FROM avions WHERE AVMARQ = 'AIRBUS')
GROUP BY pilotes.PILNOM;

-- 10)  Quels sont les vols ayant un trajet identique ( VD, VA ) à ceux assurés par Serge ?
SELECT vols.*, pilotes.PILNOM FROM vols INNER JOIN pilotes ON vols.pil = pilotes.pil 
WHERE
	vols.VD IN (SELECT VD FROM vols INNER JOIN pilotes ON pilotes.PIL = vols.PIL WHERE pilotes.PILNOM = 'SERGE')
	AND vols.VA IN (SELECT VA FROM vols INNER JOIN pilotes ON pilotes.PIL = vols.PIL WHERE pilotes.PILNOM = 'SERGE')
	AND pilotes.PILNOM != 'SERGE';
	
-- 11)  Donner toutes les paires de pilotes habitant la même ville ( sans doublon )
SELECT t1.PILNOM, t2.PILNOM FROM pilotes t1, pilotes t2
WHERE
	T1.ADR IN (SELECT T2.ADR FROM pilotes WHERE T1.PILNOM != T2.PILNOM)
	AND T1.PILNOM < T2.PILNOM;
	
-- 12)  Quels sont les noms des pilotes qui conduisent un avion que conduit aussi le pilote n°1 
SELECT DISTINCT pilotes.PILNOM FROM pilotes INNER JOIN vols ON vols.PIL = pilotes.PIL
WHERE pilotes.pil IN (SELECT PIL FROM vols WHERE AV IN (SELECT AV FROM vols WHERE vols.pil = 1) AND vols.pil != 1);


-- 13)  Donner toutes les paires de villes telles qu'un avion localisé dans la ville de départ soit conduit par un pilote résidant dans la ville d'arrivée.
SELECT
	avions.AV,
	avions.AVMARQ,
	avions.LOC AS 'Ville Depart',
	pilotes.ADR AS 'Ville d\'arrivé',
	pilotes.PILNOM AS 'Pilote'
FROM pilotes, avions
WHERE avions.LOC != pilotes.ADR;

-- TROUVER LES VOLS SUR LEQUELS UNE DE SES POSSIBILITE EST POSSIBLE

-- 14)  Sélectionner les numéros des pilotes qui conduisent tous les Airbus ?
SELECT DISTINCT pilotes.PILNOM, pilotes.PIL FROM vols
INNER JOIN pilotes ON pilotes.PIL = vols.PIL
WHERE vols.AV = ALL(SELECT AV FROM avions WHERE avMarq = 'AIRBUS');



SELECT t1.PILNOM, t1.PIL FROM vols
INNER JOIN pilotes t1 ON t1.PIL = vols.PIL
WHERE (SELECT avions.av FROM vols
	INNER JOIN pilotes t2 ON vols.pil = t2.pil
	INNER JOIN avions ON avions.AV = vols.av
	GROUP BY avions.av, t2.PIL
	HAVING (t1.pil = t2.PIL)) <> (SELECT AV FROM avions WHERE avMarq = 'AIRBUS')
GROUP BY t1.PIL;

SELECT avions.av FROM vols
INNER JOIN pilotes t2 ON vols.pil = pilotes.pil
INNER JOIN avions ON avions.AV = vols.av
GROUP BY avions.av, pilotes.PIL
HAVING (t1.pil = t2.PIL);

-- AJOUTER DES VOLS POUR QU'UN PILOTE CORRESPONDE