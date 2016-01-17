/*
SQLyog Ultimate v11.33 (32 bit)
MySQL - 10.1.8-MariaDB : Database - db_pinjambuku
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_pinjambuku` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `db_pinjambuku`;

/*Table structure for table `login` */

DROP TABLE IF EXISTS `login`;

CREATE TABLE `login` (
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  PRIMARY KEY (`username`,`password`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `login` */

insert  into `login`(`username`,`password`) values ('admin','admin');

/*Table structure for table `tbl_buku` */

DROP TABLE IF EXISTS `tbl_buku`;

CREATE TABLE `tbl_buku` (
  `kd_buku` varchar(10) NOT NULL,
  `judul` varchar(50) DEFAULT NULL,
  `pengarang` varchar(50) DEFAULT NULL,
  `penerbit` varchar(50) DEFAULT NULL,
  `tahun_terbit` int(11) DEFAULT NULL,
  PRIMARY KEY (`kd_buku`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tbl_buku` */

insert  into `tbl_buku`(`kd_buku`,`judul`,`pengarang`,`penerbit`,`tahun_terbit`) values ('123','Judul buku','Pengarang','penerbit',2015),('231','judul','pengaramh','penerbit',2009);

/*Table structure for table `tbl_kembali` */

DROP TABLE IF EXISTS `tbl_kembali`;

CREATE TABLE `tbl_kembali` (
  `no_pengembalian` varchar(20) DEFAULT NULL,
  `nama` varchar(100) DEFAULT NULL,
  `npm` varchar(10) DEFAULT NULL,
  `judulbuku` varchar(200) DEFAULT NULL,
  `pengarang` varchar(200) DEFAULT NULL,
  `tgl_pinjam` date DEFAULT NULL,
  `tgl_kembali` date DEFAULT NULL,
  `lamapinjam` int(11) DEFAULT NULL,
  `denda` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tbl_kembali` */

insert  into `tbl_kembali`(`no_pengembalian`,`nama`,`npm`,`judulbuku`,`pengarang`,`tgl_pinjam`,`tgl_kembali`,`lamapinjam`,`denda`) values ('PG001','Randy','1234','Judul buku','Pengarang','2015-12-01','2015-12-16',15,50000),('PG002','Randy','1234','Judul buku','Pengarang','2015-12-01','2015-12-10',9,20000);

/*Table structure for table `tbl_pinjam` */

DROP TABLE IF EXISTS `tbl_pinjam`;

CREATE TABLE `tbl_pinjam` (
  `nopeminjaman` varchar(20) NOT NULL,
  `nama` varchar(100) DEFAULT NULL,
  `npm` varchar(10) DEFAULT NULL,
  `judul` varchar(200) DEFAULT NULL,
  `pengarang` varchar(200) DEFAULT NULL,
  `tgl_pinjam` date DEFAULT NULL,
  `tgl_kembali` date DEFAULT NULL,
  PRIMARY KEY (`nopeminjaman`),
  KEY `Npm` (`npm`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tbl_pinjam` */

insert  into `tbl_pinjam`(`nopeminjaman`,`nama`,`npm`,`judul`,`pengarang`,`tgl_pinjam`,`tgl_kembali`) values ('PJ002','Randy','1234','Judul buku','Pengarang','2015-12-01','2015-12-31');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
