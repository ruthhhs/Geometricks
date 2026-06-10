-- CREATE DATABASE geometry_db;
-- DROP USER IF EXISTS 'mahasiswa'@'localhost';
-- CREATE USER 'mahasiswa'@'localhost'
-- IDENTIFIED BY 'rahasia';

use geometry_db;

DROP TABLE IF EXISTS hasil_quiz;
DROP TABLE IF EXISTS soal_quiz;
DROP TABLE IF EXISTS account;
        
CREATE TABLE account (
    id_account INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(36) NOT NULL UNIQUE,
    password VARCHAR(50) NOT NULL
);

CREATE TABLE soal_quiz (
    id_soal INT AUTO_INCREMENT PRIMARY KEY,
    pertanyaan TEXT,
    opsi_a VARCHAR(100),
    opsi_b VARCHAR(100),
    opsi_c VARCHAR(100),
    opsi_d VARCHAR(100),
    jawaban CHAR(1)
);

CREATE TABLE hasil_quiz (
    id_hasil INT AUTO_INCREMENT PRIMARY KEY,
    id_account INT NOT NULL,
    nilai DECIMAL(18,2) NOT NULL,
    waktu INT NOT NULL,
    FOREIGN KEY (id_account) REFERENCES account(id_account)
);

INSERT INTO account (username, password) VALUES
('raisa', 'geotricks01'),
('ethan', 'geometry88'),
('olivia', 'mathmaster12'),
('liam', 'quiztime45'),
('sophia', 'calcsmart99'),
('noah', 'bangundatar7'),
('emma', 'geometri123'),
('james', 'lingkaran88'),
('ava', 'segitiga45'),
('lucas', 'kubusbola22'),
('mia', 'trapesium11'),
('logan', 'jajargenjang9'),
('isabella', 'matematika77'),
('elijah', 'persegi55'),
('amelia', 'balokruang3'),
('benjamin', 'geocalc88'),
('charlotte', 'bangunruang6'),
('alexander', 'kuisgeometri1'),
('harper', 'sudut90'),
('daniel', 'phytagoras8'),
('evelyn', 'matriks44'),
('henry', 'integral22'),
('abigail', 'differential7'),
('jack', 'lingkaran360'),
('scarlett', 'segiempat9'),
('samuel', 'volume123'),
('grace', 'tabungbola5'),
('sebastian', 'luassegitiga'),
('chloe', 'sistemquiz1'),
('matthew', 'garisruang4'),
('victoria', 'hitungcepat8'),
('david', 'matdas2026'),
('zoey', 'keliling99'),
('joseph', 'sudutlancip7'),
('hannah', 'geometrihebat'),
('wyatt', 'persegipanjang'),
('lily', 'matquiz11'),
('john', 'teorema45'),
('ella', 'diagram88'),
('owen', 'rumuscepat5'),
('aria', 'bangundatar2'),
('leo', 'segitigasiku'),
('nora', 'matematikaku'),
('julian', 'juringlingkaran'),
('stella', 'kalkulator77'),
('isaac', 'geospace99'),
('violet', 'ruangdimensi'),
('levi', 'suduttumpul'),
('aurora', 'kuiscerdas'),
('gabriel', 'matgeo2026');

INSERT INTO soal_quiz (pertanyaan, opsi_a, opsi_b, opsi_c, opsi_d, jawaban) VALUES
('5 + 5 = ?', '10', '20', '30', '40', 'a'),
('2 + 2 = ?', '1', '2', '3', '4', 'd'),
('Apa rumus dari keliling persegi?', '3 * L', '4 * L', '4 * S', '4 * S * S', 'c');

INSERT INTO hasil_quiz (id_account, nilai, waktu) VALUES
(1, 85.50, 320),
(2, 90.00, 280),
(3, 78.75, 450),
(4, 88.25, 390),
(5, 95.00, 250),
(6, 70.50, 500),
(7, 82.00, 410),
(8, 91.25, 275),
(9, 76.00, 520),
(10, 89.75, 300),
(11, 93.50, 260),
(12, 67.00, 600),
(13, 84.25, 350),
(14, 79.00, 470),
(15, 96.50, 230),
(16, 88.00, 340),
(17, 74.50, 540),
(18, 81.75, 420),
(19, 92.00, 290),
(20, 77.25, 510),
(21, 86.75, 315),
(22, 80.00, 445),
(23, 94.50, 240),
(24, 73.25, 555),
(25, 87.00, 330),
(26, 91.75, 295),
(27, 69.50, 610),
(28, 83.00, 360),
(29, 97.25, 210),
(30, 75.75, 495),
(31, 88.50, 305),
(32, 90.25, 285),
(33, 71.00, 580),
(34, 84.75, 375),
(35, 95.50, 225),
(36, 78.00, 460),
(37, 82.50, 400),
(38, 93.25, 255),
(39, 74.00, 530),
(40, 89.00, 310),
(41, 96.75, 205),
(42, 68.25, 620),
(43, 85.00, 345),
(44, 79.50, 480),
(45, 92.75, 270),
(46, 76.50, 515),
(47, 87.25, 325),
(48, 90.50, 290),
(49, 72.75, 565),
(50, 94.00, 235);

select user, host FROM mysql.user;
GRANT ALL PRIVILEGES ON geometry_db.* TO 'mahasiswa'@'localhost';
select * from account;
select * from hasil_quiz;