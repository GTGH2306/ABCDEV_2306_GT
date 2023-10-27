-- CREATE DATABASE employes;
-- USE employes;
-- CREATE TABLE EMP (
-- 	EMPNO INTEGER AUTO_INCREMENT,
-- 	ENAME VARCHAR(20) NOT NULL,
-- 	JOB VARCHAR(20) NOT NULL,
-- 	MGR INTEGER,
-- 	HIREDATE DATE NOT NULL,
-- 	SAL DECIMAL(8,2) NOT NULL,
-- 	COMM DECIMAL(8,2),
-- 	DEPTNO INTEGER NOT NULL,
-- 	PRIMARY KEY(EMPNO)
-- );
-- INSERT INTO EMP(EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
-- VALUES
-- 	(7369, 'SMITH', 'CLERK', 7902, '1980-12-17',  800, NULL, 20),
-- 	(7499, 'ALLEN', 'SALESMAN', 7698, '1981-02-20',  1600, 300, 30),
-- 	(7521, 'WARD', 'SALESMAN', 7698, '1981-02-21', 1250, 500, 30),
-- 	(7566, 'JONES', 'MANAGER', 7839, '1981-04-02', 2975, NULL, 20),
-- 	(7654, 'MARTIN', 'SALESMAN', 7698, '1981-09-28', 1250, 1400, 30),
-- 	(7698, 'BLAKE', 'MANAGER', 7839, '1981-05-01', 2850, NULL, 30),
-- 	(7782, 'CLARK', 'MANAGER', 7839, '1981-07-09', 2450, NULL, 10),
-- 	(7788, 'SCOTT', 'ANALYST', 7566, '1982-12-09', 3000, NULL, 20),
-- 	(7839, 'KING', 'PRESIDENT', NULL, '1981-11-17', 5000, NULL, 10),
-- 	(7844, 'TURNER', 'SALESMAN', 7698, '1981-09-08', 1500, 0, 30),
-- 	(7876, 'ADAMS', 'CLERK', 7788, '1983-01-12', 1100, NULL, 20),
-- 	(7900, 'JAMES', 'CLERK', 7698, '1981-12-03', 950, NULL, 30),
-- 	(7902, 'FORD', 'ANALYST', 7566, '1981-12-03', 3000, NULL, 20),
-- 	(7934, 'MILLER', 'CLERK', 7782, '1982-01-23', 1300, NULL, 10);
-- 
-- CREATE TABLE DEPT (
-- 	DEPTNO INTEGER NOT NULL,
-- 	DNAME VARCHAR(15) NOT NULL,
-- 	LOC VARCHAR(15) NOT NULL,
-- 	PRIMARY KEY(DEPTNO)
-- );
-- INSERT INTO dept(DEPTNO, DNAME, LOC)
-- VALUES
-- 	(10, 'ACCOUNTING', 'NEW YORK'),
-- 	(20, 'RESEARCH', 'DALLAS'),
-- 	(30, 'SALES', 'CHICAGO'),
-- 	(40, 'OPERATIONS', 'BOSTON');
-- 	
-- 
-- 
-- ALTER TABLE emp
-- ADD CONSTRAINT FK_DEPTNO
-- FOREIGN KEY(DEPTNO) REFERENCES DEPT(DEPTNO);
-- 
-- ALTER TABLE emp
-- ADD CONSTRAINT FK_MGR
-- FOREIGN KEY(MGR) REFERENCES emp(EMPNO);
-- 
-- ALTER TABLE emp
-- DROP CONSTRAINT FK_MGR;
-- 
-- ALTER TABLE emp
-- MODIFY EMPNO INTEGER NOT NULL;
-- 
-- ALTER TABLE EMP
-- DROP CONSTRAINT UNIQUE EMPNO;

-- Montre les employés du département n°10
SELECT ename, job, sal FROM emp WHERE deptno = 10;

-- Montre les employés Manager avec un salaire supérieur à 2800
SELECT ename, job, sal FROM emp WHERE sal > 2800 AND job = 'MANAGER';

-- Montre les Manager qui travaille dans un autre département que le 30
SELECT ename, job, sal FROM emp WHERE deptno != 30 AND job = 'MANAGER';

-- Montre les employés ayant un salaire entre 1200 et 1400
SELECT * FROM emp WHERE sal BETWEEN 1200 AND 1400;

-- Montre les employés des déparement 10 et 30 par ordre alphabétique
SELECT * FROM emp WHERE deptno IN(10, 30, 40) ORDER BY ename;

-- Montre les employés du déparement 30 par salaire croissant
SELECT * FROM emp WHERE deptno = 30 ORDER BY sal;

-- Montre les employés en les triant par job puis salaire decroissant
SELECT * FROM emp ORDER BY job, sal DESC;

-- Montre les différents jobs présent
SELECT DISTINCT job FROM emp;

-- Montre le nom du département dans lequel travaille Allen
SELECT dname FROM dept
INNER JOIN emp ON emp.DEPTNO = dept.DEPTNO
WHERE emp.ename = 'ALLEN';

-- Montre les employés et leurs département trier par département puis salaire décroissant
SELECT dept.dname, emp.ENAME, emp.JOB, emp.SAL FROM emp
INNER JOIN dept ON emp.DEPTNO = dept.DEPTNO
ORDER BY dept.DNAME, emp.SAL DESC;

-- Montre les SALESMAN, leurs salaires, commissions, et somme des deux affiché sous "total"
SELECT ename, sal, comm, sal + comm AS total FROM emp WHERE (job = 'SALESMAN');

-- Affichera les dates en FR
SET lc_time_names = 'fr_FR';
-- Montre les employés et leurs date d'embauche
SELECT ename, job, UPPER(DATE_FORMAT(hiredate, '%a %e %b %Y')) AS 'Date d\'embauche' FROM emp;

-- Montre les plus gros salaires de chaque département
SELECT deptno, MAX(sal) FROM emp GROUP BY deptno;

-- Montre la masse salariale, le nombre d'employé et salaire moyen par département ayant au moins 2 employés
SELECT
	deptno AS 'Numéro Dept',
	SUM(sal+ifnull(comm, 0)) AS 'Masse Salariale',
	COUNT(empno) AS 'Nombre D\'employés',
	ROUND(AVG(sal), 2) AS 'Salaire Moyen'
FROM emp
GROUP BY deptno
HAVING (COUNT(deptno) >= 2);


SELECT
	deptno AS 'Numéro Dept',
	job,
	SUM(sal+ifnull(comm, 0)) AS 'Masse Salariale',
	COUNT(empno) AS 'Nombre D\'employés',
	ROUND(AVG(sal), 2) AS 'Salaire Moyen'
FROM emp
GROUP BY job, deptno
ORDER BY deptno, JOB
HAVING (COUNT(*) >= 2);

-- Montre les employés ayant le même job que JONES
SELECT ename, deptno, sal
FROM emp
WHERE job = (SELECT job FROM emp WHERE ename = 'JONES') AND ename != 'JONES';


-- Montre les salariés ayant un salaire supérieur à la moyenne
SELECT ename, sal FROM emp
WHERE sal > (SELECT AVG(sal) FROM emp);

ALTER TABLE EMP
DROP FOREIGN KEY FK_PROJ;
DROP TABLE projet;
-- Créer une table PROJET
CREATE TABLE PROJET (
	NUMPROJ INTEGER CHECK (LENGTH(CONVERT(numproj, CHAR)) = 3),
	NOMPROJ VARCHAR(5) NOT NULL,
	BUDGPROJ DECIMAL(8,2) NOT NULL,
	CONSTRAINT PK_PROJ PRIMARY KEY(NUMPROJ)
);
INSERT INTO PROJET(NUMPROJ, NOMPROJ, BUDGPROJ)
VALUES
	(101, 'ALPHA', 96000),
	(102, 'BETA', 82000),
	(103, 'GAMMA', 15000);
	
-- Ajouter une colonne numproj à la table EMP
ALTER TABLE emp
ADD COLUMN NUMPROJ INTEGER CHECK (LENGTH(CONVERT(numproj, CHAR)) = 3);
ALTER TABLE emp
ADD CONSTRAINT FK_PROJ FOREIGN KEY(NUMPROJ) REFERENCES projet(NUMPROJ);

-- puis ajouter les employés du dept 30 au projet 101 et les autres au projet 102
UPDATE emp SET NUMPROJ = NULL;
UPDATE emp	SET NUMPROJ = 101 WHERE deptno = 30 AND job = 'SALESMAN';
UPDATE emp	SET NUMPROJ = 102 WHERE empno NOT IN (SELECT empno WHERE deptno = 30 AND job = 'SALESMAN');

-- IF deptno = 30 AND job = 'SALESMAN'
-- THEN
-- 	UPDATE emp	SET NUMPROJ = 101;
--  ELSE 
-- 	UPDATE emp	SET NUMPROJ =102;
-- END IF;

-- Créer une vue des employés avec nom, job, nom de département, nom de projet
CREATE VIEW vue_emp AS
SELECT
	emp.ENAME,
	emp.JOB,
	dept.DNAME,
	projet.NOMPROJ
FROM emp
INNER JOIN dept ON dept.DEPTNO = emp.DEPTNO
INNER JOIN projet ON projet.NUMPROJ = emp.NUMPROJ;

-- Montre les employés par nom de département et nom de projet
SELECT * FROM vue_emp
ORDER BY DNAME, NOMPROJ;

-- Montre le nom du projet associé à chaque manager
SELECT ENAME, DNAME, NOMPROJ FROM vue_emp
WHERE JOB = 'MANAGER';


SELECT emp.ename, projet.NOMPROJ FROM emp INNER JOIN projet ON projet.NUMPROJ = emp.numproj
WHERE empno IN (SELECT DISTINCT MGR FROM emp
WHERE MGR IS NOT NULL);




-- DEUXIEME PARTIE





-- 1 Montre les Managers dans les département 20 et 30 
SELECT * FROM emp
WHERE deptno IN(20, 30) AND empno IN (SELECT DISTINCT MGR FROM emp
WHERE MGR IS NOT NULL);

-- 2 Montre la liste des employés qui ne sont PAS manager embauchés en 81
SELECT * FROM emp
WHERE (SELECT EXTRACT(YEAR FROM HIREDATE)) = 1981
AND empno NOT IN (SELECT DISTINCT MGR FROM emp
WHERE MGR IS NOT NULL);

-- 3 Montre la liste des employés ayant une commission
SELECT * FROM emp
WHERE IFNULL(COMM, 0) > 0;

-- 4 Montre les employés triés par départements, job et en ordre d'embauche
SELECT ename, deptno, job, HIREDATE FROM emp
ORDER BY deptno, job, HIREDATE DESC;

-- 5 Montre les employés qui travaillent à Dallas
SELECT emp.*, dept.dname FROM emp INNER JOIN dept ON emp.deptno = dept.deptno
WHERE emp.deptno IN (SELECT dept.deptno FROM dept WHERE loc = 'DALLAS');

-- 6 Montre les noms et dates d'embauches des employés embauchés avant leur manager
SELECT
	T1.ENAME AS 'Nom',
	UPPER(DATE_FORMAT(T1.hiredate, '%a %e %b %Y')) AS 'Date d\'embauche',
	T2.ENAME AS 'Nom du manager',
	UPPER(DATE_FORMAT(T2.hiredate, '%a %e %b %Y')) AS 'Date d\'embauche du manager'
FROM
	emp T1, emp T2
WHERE
	T1.HIREDATE < T2.HIREDATE AND T1.MGR = T2.EMPNO;
	
-- 7 Montre les employés qui n'ont pas de subordonnés
SELECT * FROM emp
WHERE empno NOT IN (SELECT DISTINCT MGR FROM emp
	WHERE MGR IS NOT NULL);

-- 8 Montre les noms et dates d'embauches des employés embauchés avant BLAKE
SELECT
	ENAME AS 'Nom',
	UPPER(DATE_FORMAT(hiredate, '%a %e %b %Y')) AS 'Date d\'embauche'
FROM emp
WHERE hiredate < (SELECT HIREDATE FROM emp WHERE ename = 'BLAKE');

-- 9 Montre les employés embauchés le même jour que FORD
SELECT *
FROM emp
WHERE hiredate = (SELECT HIREDATE FROM emp WHERE ename = 'FORD') AND ename != 'FORD';

-- 10 Montre les employés ayant le même manager que Clark
SELECT *
FROM emp
WHERE MGR = (SELECT MGR FROM emp WHERE ename = 'CLARK') AND ename != 'CLARK';

-- 11 Montre les employés ayant le même job et Manager que Turner
SELECT *
FROM emp
WHERE MGR = (SELECT MGR FROM emp WHERE ename = 'TURNER') AND JOB = (SELECT JOB FROM emp WHERE ename = 'TURNER') AND ename != 'TURNER';

-- 12 Montre les employés du département RESEARCH embauchés le même jour que quelqu'un du département SALES
SELECT *
FROM emp
WHERE deptno = 20 AND HIREDATE IN (SELECT HIREDATE FROM emp WHERE DEPTNO = 30);

-- 13 Montre les nom des employés et le nom du jour de la semaine ou ils ont été embauché
SELECT ename,
	UPPER(DATE_FORMAT(hiredate, '%W')) AS 'Jour d\'embauche'
FROM emp;

-- 14 Montre les nom des employés et leurs nombres de mois depuis leurs embauche/ TIMESTAMPDIFF(MONTH, NOW(), HIREDATE)
SELECT
	ename,
	((EXTRACT(YEAR FROM (SELECT CURDATE())) - EXTRACT(YEAR FROM HIREDATE)) * 12) +
	(EXTRACT(MONTH FROM (SELECT CURDATE())) - EXTRACT(MONTH FROM HIREDATE)) AS 'Mois de Travail'
FROM emp;

-- 15 Montre les employés ayant un A et un M dans leurs nom
SELECT *
FROM emp
WHERE ename LIKE '%A%' AND ename LIKE '%M%';

-- 16 Montre les employés avec deux A dans leurs noms
SELECT *
FROM emp
WHERE ename LIKE '%A%A%';

-- 17 Montre les employés embauché avant tout les employés du département 10
SELECT *
FROM emp
WHERE hiredate < (SELECT MIN(HIREDATE) FROM emp WHERE deptno = 10);

-- 18 Montre le métier ou le salaire moyen est le plus faible
SELECT JOB
FROM emp
GROUP BY JOB
ORDER BY AVG(SAL) ASC
LIMIT 1;

-- 19 Montre le département avec le plus d'employés
SELECT deptno FROM emp
GROUP BY DEPTNO
ORDER BY COUNT(deptno) DESC
LIMIT 1;

-- CORRIGER 18
SELECT JOB, AVG(SAL) FROM emp GROUP BY JOB
HAVING (AVG(SAL) <= ALL(SELECT AVG(SAL) FROM emp GROUP BY JOB));

-- CORRIGER 19
SELECT deptno, COUNT(*) FROM emp GROUP BY deptno
HAVING (COUNT(*) >= ALL (SELECT COUNT(*) FROM emp GROUP BY deptno));

-- 20 Montre la repartition des employés en % parmis les départements
SELECT
	deptno AS 'Département',
	ROUND(((COUNT(*)/(SELECT COUNT(*) FROM emp)) * 100), 2) AS 'Répartition en %'
FROM emp
GROUP BY deptno;

