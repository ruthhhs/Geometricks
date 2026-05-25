-- CREATE DATABASE geometry_db;
use geometry_db;

drop table if exists account;
drop table if exists hasil_quiz;
        
CREATE TABLE account (
    id_account VARCHAR(11) PRIMARY KEY,
    username VARCHAR(36) NOT NULL UNIQUE,
    password VARCHAR(50) NOT NULL
);

CREATE TABLE hasil_quiz (
    id_hasil VARCHAR(11) PRIMARY KEY,
    id_account VARCHAR(11) NOT NULL,
    nilai DECIMAL(18,2) NOT NULL,
    waktu INT NOT NULL,

    FOREIGN KEY (id_account) REFERENCES account(id_account)
);

INSERT INTO account (id_Account, username, password) VALUES
('A1011', 'mikael', 'friedries33');

INSERT INTO account (id_account, username, password) VALUES
('A1002', 'ethan', 'geometry88'),
('A1003', 'olivia', 'mathmaster12'),
('A1004', 'liam', 'quiztime45'),
('A1005', 'sophia', 'calcsmart99'),
('A1006', 'noah', 'bangundatar7'),
('A1007', 'emma', 'geometri123'),
('A1008', 'james', 'lingkaran88'),
('A1009', 'ava', 'segitiga45'),
('A1010', 'lucas', 'kubusbola22'),
('A1001', 'mia', 'trapesium11'),
('A1012', 'logan', 'jajargenjang9'),
('A1013', 'isabella', 'matematika77'),
('A1014', 'elijah', 'persegi55'),
('A1015', 'amelia', 'balokruang3'),
('A1016', 'benjamin', 'geocalc88'),
('A1017', 'charlotte', 'bangunruang6'),
('A1018', 'alexander', 'kuisgeometri1'),
('A1019', 'harper', 'sudut90'),
('A1020', 'daniel', 'phytagoras8'),
('A1021', 'evelyn', 'matriks44'),
('A1022', 'henry', 'integral22'),
('A1023', 'abigail', 'differential7'),
('A1024', 'jack', 'lingkaran360'),
('A1025', 'scarlett', 'segiempat9'),
('A1026', 'samuel', 'volume123'),
('A1027', 'grace', 'tabungbola5'),
('A1028', 'sebastian', 'luassegitiga'),
('A1029', 'chloe', 'sistemquiz1'),
('A1030', 'matthew', 'garisruang4'),
('A1031', 'victoria', 'hitungcepat8'),
('A1032', 'david', 'matdas2026'),
('A1033', 'zoey', 'keliling99'),
('A1034', 'joseph', 'sudutlancip7'),
('A1035', 'hannah', 'geometrihebat'),
('A1036', 'wyatt', 'persegipanjang'),
('A1037', 'lily', 'matquiz11'),
('A1038', 'john', 'teorema45'),
('A1039', 'ella', 'diagram88'),
('A1040', 'owen', 'rumuscepat5'),
('A1041', 'aria', 'bangundatar2'),
('A1042', 'leo', 'segitigasiku'),
('A1043', 'nora', 'matematikaku'),
('A1044', 'julian', 'juringlingkaran'),
('A1045', 'stella', 'kalkulator77'),
('A1046', 'isaac', 'geospace99'),
('A1047', 'violet', 'ruangdimensi'),
('A1048', 'levi', 'suduttumpul'),
('A1049', 'aurora', 'kuiscerdas'),
('A1050', 'gabriel', 'matgeo2026');

INSERT INTO hasil_quiz (id_hasil, id_account, nilai, waktu) VALUES
('H1001', 'A1001', 85.50, 320),
('H1002', 'A1002', 90.00, 280),
('H1003', 'A1003', 78.75, 450),
('H1004', 'A1004', 88.25, 390),
('H1005', 'A1005', 95.00, 250),
('H1006', 'A1006', 70.50, 500),
('H1007', 'A1007', 82.00, 410),
('H1008', 'A1008', 91.25, 275),
('H1009', 'A1009', 76.00, 520),
('H1010', 'A1010', 89.75, 300),
('H1011', 'A1011', 93.50, 260),
('H1012', 'A1012', 67.00, 600),
('H1013', 'A1013', 84.25, 350),
('H1014', 'A1014', 79.00, 470),
('H1015', 'A1015', 96.50, 230),
('H1016', 'A1016', 88.00, 340),
('H1017', 'A1017', 74.50, 540),
('H1018', 'A1018', 81.75, 420),
('H1019', 'A1019', 92.00, 290),
('H1020', 'A1020', 77.25, 510),
('H1021', 'A1021', 86.75, 315),
('H1022', 'A1022', 80.00, 445),
('H1023', 'A1023', 94.50, 240),
('H1024', 'A1024', 73.25, 555),
('H1025', 'A1025', 87.00, 330),
('H1026', 'A1026', 91.75, 295),
('H1027', 'A1027', 69.50, 610),
('H1028', 'A1028', 83.00, 360),
('H1029', 'A1029', 97.25, 210),
('H1030', 'A1030', 75.75, 495),
('H1031', 'A1031', 88.50, 305),
('H1032', 'A1032', 90.25, 285),
('H1033', 'A1033', 71.00, 580),
('H1034', 'A1034', 84.75, 375),
('H1035', 'A1035', 95.50, 225),
('H1036', 'A1036', 78.00, 460),
('H1037', 'A1037', 82.50, 400),
('H1038', 'A1038', 93.25, 255),
('H1039', 'A1039', 74.00, 530),
('H1040', 'A1040', 89.00, 310),
('H1041', 'A1041', 96.75, 205),
('H1042', 'A1042', 68.25, 620),
('H1043', 'A1043', 85.00, 345),
('H1044', 'A1044', 79.50, 480),
('H1045', 'A1045', 92.75, 270),
('H1046', 'A1046', 76.50, 515),
('H1047', 'A1047', 87.25, 325),
('H1048', 'A1048', 90.50, 290),
('H1049', 'A1049', 72.75, 565),
('H1050', 'A1050', 94.00, 235);

select user, host FROM mysql.user;
GRANT ALL PRIVILEGES ON geometry_db.* TO 'mahasiswa'@'localhost';