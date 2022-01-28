-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jan 28, 2022 at 01:17 AM
-- Server version: 8.0.21
-- PHP Version: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `project`
--

-- --------------------------------------------------------

--
-- Table structure for table `coviddetails`
--

DROP TABLE IF EXISTS `coviddetails`;
CREATE TABLE IF NOT EXISTS `coviddetails` (
  `id` int UNSIGNED NOT NULL AUTO_INCREMENT,
  `Totalcases` varchar(30) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `TotalDeaths` varchar(30) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `TotalRecovered` varchar(30) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `Date` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `coviddetails`
--

INSERT INTO `coviddetails` (`id`, `Totalcases`, `TotalDeaths`, `TotalRecovered`, `Date`) VALUES
(22, '489', '3', '16', '2021-12-21'),
(23, '256', '12', '8', '2021-12-06');

-- --------------------------------------------------------

--
-- Table structure for table `phi`
--

DROP TABLE IF EXISTS `phi`;
CREATE TABLE IF NOT EXISTS `phi` (
  `id` int UNSIGNED NOT NULL AUTO_INCREMENT,
  `Name` varchar(60) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `nic` varchar(30) NOT NULL,
  `phi_division` varchar(30) NOT NULL,
  `Phone_Number` varchar(30) NOT NULL,
  `Password` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `phi`
--

INSERT INTO `phi` (`id`, `Name`, `nic`, `phi_division`, `Phone_Number`, `Password`) VALUES
(13, 'Ranavera', '988341193v', 'Galle', '0758965412', '123456');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `userrole` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `username`, `password`, `userrole`) VALUES
(1, 'admin', '123456', 'admin'),
(15, '988341193v', '123456', 'phi');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
