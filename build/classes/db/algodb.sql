-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Feb 25, 2020 at 10:56 PM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `algodb`
--

-- --------------------------------------------------------

--
-- Table structure for table `consulta`
--

CREATE TABLE IF NOT EXISTS `consulta` (
  `id` int(26) NOT NULL,
  `region` varchar(26) NOT NULL,
  `numhomicidios` int(11) NOT NULL,
  `tasaaccidentes` float NOT NULL,
  KEY `id_region` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `consulta`
--

INSERT INTO `consulta` (`id`, `region`, `numhomicidios`, `tasaaccidentes`) VALUES
(1, 'Amazonas', 42, 3.8),
(2, 'Ancash', 63, 14.9),
(3, 'Apurimac', 17, 13),
(4, 'Arequipa', 79, 15),
(5, 'Ayacucho', 70, 6.6),
(6, 'Cajamarca', 86, 5.2),
(7, 'Callao', 115, 6),
(8, 'Cusco', 28, 11.9),
(9, 'Huancavelica', 73, 14.7),
(10, 'Huanuco', 64, 9.8),
(11, 'Ica', 105, 10),
(12, 'Junin', 140, 9.9),
(13, 'La Libertad', 64, 8.1),
(14, 'Lambayeque', 31, 8),
(15, 'Lima Metropolitana', 633, 3.8),
(16, 'Lima Provincias', 148, 20.4),
(17, 'Loreto', 69, 2.3),
(18, 'Madre de Dios', 15, 37.5),
(19, 'Moquegua', 42, 10.9),
(20, 'Pasco', 100, 14),
(21, 'Piura', 140, 5.5),
(22, 'Puno', 145, 17.9),
(23, 'San Martin', 72, 5.9),
(24, 'Tacna', 11, 9.7),
(25, 'Tumbes', 70, 8.2),
(26, 'Ucayali', 65, 3.2);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
