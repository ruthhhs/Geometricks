-- CREATE DATABASE geometry_db;
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

INSERT INTO account username, password) VALUES
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
('A1030', 'matthew', 'garisruang4'),
('A1031', 'victoria', 'hitungcepat8'),
('A1032', 'david', 'matdas2026'),
('A1033', 'zoey', 'keliling99'),
('A1034', 'joseph', 'sudutlancip7'),
('A1035', 'hannah', 'geometrihebat'),
('A1036', 'wyatt', 'persegipanjang'),
('A1037', 'lily', 'matquiz11'),
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
('A1001', 85.50, 320),
('A1002', 90.00, 280),
('A1003', 78.75, 450),
('A1004', 88.25, 390),
('A1005', 95.00, 250),
('A1006', 70.50, 500),
('A1007', 82.00, 410),
('A1008', 91.25, 275),
('A1009', 76.00, 520),
('A1010', 89.75, 300),
('A1011', 93.50, 260),
('A1012', 67.00, 600),
('A1013', 84.25, 350),
('A1014', 79.00, 470),
('A1015', 96.50, 230),
('A1016', 88.00, 340),
('A1017', 74.50, 540),
('A1018', 81.75, 420),
('A1019', 92.00, 290),
('A1020', 77.25, 510),
('A1021', 86.75, 315),
('A1022', 80.00, 445),
('A1023', 94.50, 240),
('A1024', 73.25, 555),
('A1025', 87.00, 330),
('A1026', 91.75, 295),
('A1027', 69.50, 610),
('A1028', 83.00, 360),
('A1029', 97.25, 210),
('A1030', 75.75, 495),
('A1031', 88.50, 305),
('A1032', 90.25, 285),
('A1033', 71.00, 580),
('A1034', 84.75, 375),
('A1035', 95.50, 225),
('A1036', 78.00, 460),
('A1037', 82.50, 400),
('A1038', 93.25, 255),
('A1039', 74.00, 530),
('A1040', 89.00, 310),
('A1041', 96.75, 205),
('A1042', 68.25, 620),
('A1043', 85.00, 345),
('A1044', 79.50, 480),
('A1045', 92.75, 270),
('A1046', 76.50, 515),
('A1047', 87.25, 325),
('A1048', 90.50, 290),
('A1049', 72.75, 565),
('A1050', 94.00, 235);

select user, host FROM mysql.user;
GRANT ALL PRIVILEGES ON geometry_db.* TO 'mahasiswa'@'localhost';