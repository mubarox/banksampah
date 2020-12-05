DROP database if exists 'banksampah';

CREATE database banksampah;

USE banksampah;

CREATE TABLE `nasabah` (
  `ID_nasabah` char(10) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `nama_nasabah` varchar(50) DEFAULT NULL,
  `email_nasabah` varchar(50) DEFAULT NULL,
  `password_nasabah` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `penarikan` (
  `ID_penarikan` char(10) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `tanggal_penarikan` date DEFAULT NULL,
  `jumlah_penarikan` varchar(50) DEFAULT NULL,
  `ID_saldo` char(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `pengepul` (
  `ID_pengepul` char(10) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `nama_pengepul` varchar(50) DEFAULT NULL,
  `email_pengepul` varchar(50) DEFAULT NULL,
  `password_pengepul` varchar(25) DEFAULT NULL,
  `alamat_pengepul` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `saldo` (
  `ID_saldo` char(10) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `jumlah` varchar(50) DEFAULT NULL,
  `ID_nasabah` char(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `sampah` (
  `ID_sampah` char(10) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `harga_jual` varchar(50) DEFAULT NULL,
  `jenis_sampah` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `setor` (
  `ID_setor` char(10) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `tanggal_setor` date DEFAULT NULL,
  `jumlah` varchar(50) DEFAULT NULL,
  `ID_nasabah` char(10) DEFAULT NULL,
  `ID_saldo` char(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;