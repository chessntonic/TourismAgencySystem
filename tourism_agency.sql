-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Nov 10, 2023 at 11:05 AM
-- Server version: 8.0.31
-- PHP Version: 7.4.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tourism_agency`
--

-- --------------------------------------------------------

--
-- Table structure for table `accommodation_type`
--

CREATE TABLE `accommodation_type` (
  `id` int NOT NULL,
  `accommodation_name` varchar(255) COLLATE utf8mb4_general_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `accommodation_type`
--

INSERT INTO `accommodation_type` (`id`, `accommodation_name`) VALUES
(1, 'Ultra All Inclusive'),
(2, 'All Inclusive'),
(3, 'Room Breakfast'),
(4, 'Full Pension'),
(5, 'Half Board'),
(6, 'Bed Only'),
(7, 'Full Credit Excluding Alcohol');

-- --------------------------------------------------------

--
-- Table structure for table `guest`
--

CREATE TABLE `guest` (
  `id` int NOT NULL,
  `reservation_id` int NOT NULL,
  `guest_fullname` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `national_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `guest_phone` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `guest_email` varchar(255) COLLATE utf8mb4_general_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `guest`
--

INSERT INTO `guest` (`id`, `reservation_id`, `guest_fullname`, `national_id`, `guest_phone`, `guest_email`) VALUES
(15, 8, 'Ahmet Mehmet', '123123456', '00905323030303', 'ahmet@gmail.com'),
(16, 8, 'Ayşe Fatma', '123123456', '00905322020202', 'ayse@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `hotel`
--

CREATE TABLE `hotel` (
  `id` int NOT NULL,
  `hotel_name` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `city` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `district` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `star` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `address` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `hotel_email` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `hotel_phone` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `parking` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `wifi` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `pool` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `gym` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `concierge` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `spa` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `room_service` varchar(255) COLLATE utf8mb4_general_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `hotel`
--

INSERT INTO `hotel` (`id`, `hotel_name`, `city`, `district`, `star`, `address`, `hotel_email`, `hotel_phone`, `parking`, `wifi`, `pool`, `gym`, `concierge`, `spa`, `room_service`) VALUES
(1, 'Levent Otel', 'Istanbul', 'Besiktas', '5', 'Levent Caddesi no:5', 'leventotel@leventotel.com', '00902125005055', 'No', 'Yes', 'No', 'Yes', 'No', 'Yes', 'Yes'),
(2, 'Marmara Otel', 'Bursa', 'Nilufer', '3', 'Osmanoglu Caddesi no:3', 'marmaraotel@marmaraotel.com', '00905353003030', 'Yes', 'Yes', 'Yes', 'No', 'Yes', 'Yes', 'Yes'),
(3, 'Diyarbakır Suites', 'Diyarbakir', 'Merkez', '4', 'Diyar Caddesi no:2', 'diyarsuites@diyarsuites.com', '00905321232323', 'Yes', 'Yes', 'No', 'No', 'Yes', 'No', 'Yes'),
(4, 'Sheraton Ankara', 'Ankara', 'Kızılay', '5', 'Mamak Caddesi no:1', 'sheratonankara@sheraton.com', '00905349009090', 'Yes', 'Yes', 'No', 'Yes', 'No', 'No', 'Yes');

-- --------------------------------------------------------

--
-- Table structure for table `hotel_period`
--

CREATE TABLE `hotel_period` (
  `id` int NOT NULL,
  `season_start` date DEFAULT NULL,
  `season_end` date DEFAULT NULL,
  `offseason_start` date DEFAULT NULL,
  `offseason_end` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `hotel_period`
--

INSERT INTO `hotel_period` (`id`, `season_start`, `season_end`, `offseason_start`, `offseason_end`) VALUES
(1, '2023-01-01', '2023-05-30', '2023-06-01', '2023-12-31'),
(2, '2023-01-01', '2023-04-30', '2023-05-01', '2023-12-31'),
(3, '2023-01-01', '2023-08-31', '2023-09-01', '2023-12-31'),
(4, '2023-01-01', '2023-07-31', '2023-08-31', '2023-12-31');

-- --------------------------------------------------------

--
-- Table structure for table `period_type`
--

CREATE TABLE `period_type` (
  `id` int NOT NULL,
  `period_name` varchar(255) COLLATE utf8mb4_general_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `period_type`
--

INSERT INTO `period_type` (`id`, `period_name`) VALUES
(1, 'Season'),
(2, 'Off Season');

-- --------------------------------------------------------

--
-- Table structure for table `reservation`
--

CREATE TABLE `reservation` (
  `id` int NOT NULL,
  `hotel_id` int NOT NULL,
  `hotel_name` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `room_type` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `period_name` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `city` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `guest_count` int NOT NULL,
  `checkin_date` date NOT NULL,
  `checkout_date` date NOT NULL,
  `duration` int NOT NULL,
  `price` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `reservation`
--

INSERT INTO `reservation` (`id`, `hotel_id`, `hotel_name`, `room_type`, `period_name`, `city`, `guest_count`, `checkin_date`, `checkout_date`, `duration`, `price`) VALUES
(8, 2, 'Marmara Otel', 'Single', 'Season', 'Bursa', 2, '2023-01-01', '2023-01-03', 2, 1000);

-- --------------------------------------------------------

--
-- Table structure for table `room`
--

CREATE TABLE `room` (
  `id` int NOT NULL,
  `hotel_id` int NOT NULL,
  `room_type_id` int NOT NULL,
  `bed` int NOT NULL,
  `tv` int NOT NULL,
  `minibar` int NOT NULL,
  `room_size` int NOT NULL,
  `season_stock` int NOT NULL,
  `offseason_stock` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `room`
--

INSERT INTO `room` (`id`, `hotel_id`, `room_type_id`, `bed`, `tv`, `minibar`, `room_size`, `season_stock`, `offseason_stock`) VALUES
(1, 1, 1, 1, 1, 1, 10, 10, 10),
(2, 1, 2, 2, 2, 2, 30, 20, 10),
(3, 1, 3, 5, 5, 5, 150, 5, 5),
(4, 2, 1, 1, 1, 1, 20, 100, 50),
(5, 2, 2, 2, 1, 1, 50, 50, 40),
(6, 3, 2, 1, 1, 1, 100, 50, 50),
(7, 3, 3, 5, 5, 5, 250, 20, 20),
(8, 4, 1, 1, 1, 1, 25, 100, 80),
(9, 4, 2, 2, 1, 2, 50, 100, 80),
(10, 4, 3, 4, 4, 4, 250, 10, 10);

-- --------------------------------------------------------

--
-- Table structure for table `room_price`
--

CREATE TABLE `room_price` (
  `id` int NOT NULL,
  `hotel_id` int NOT NULL,
  `period_id` int NOT NULL,
  `room_type` int NOT NULL,
  `accommodation_id` int NOT NULL,
  `adult_price` int NOT NULL,
  `child_price` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `room_price`
--

INSERT INTO `room_price` (`id`, `hotel_id`, `period_id`, `room_type`, `accommodation_id`, `adult_price`, `child_price`) VALUES
(1, 1, 1, 1, 2, 1000, 500),
(2, 2, 1, 1, 3, 300, 200),
(5, 2, 1, 2, 2, 1000, 800),
(6, 3, 1, 3, 1, 10000, 5000),
(7, 1, 1, 2, 4, 500, 300),
(8, 4, 2, 2, 4, 1000, 800),
(9, 4, 2, 3, 1, 10000, 5000);

-- --------------------------------------------------------

--
-- Table structure for table `room_sales`
--

CREATE TABLE `room_sales` (
  `id` int NOT NULL,
  `hotel_id` int NOT NULL,
  `hotel_name` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `city` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `district` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `star` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `period` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `start_date` date NOT NULL,
  `end_date` date NOT NULL,
  `room_type` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `stock` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `room_sales`
--

INSERT INTO `room_sales` (`id`, `hotel_id`, `hotel_name`, `city`, `district`, `star`, `period`, `start_date`, `end_date`, `room_type`, `stock`) VALUES
(1, 1, 'Levent Otel', 'Istanbul', 'Besiktas', '5', 'Season', '2023-01-01', '2023-05-30', 'Single', 10),
(2, 1, 'Levent Otel', 'Istanbul', 'Besiktas', '5', 'Off Season', '2023-06-01', '2023-12-31', 'Single', 10),
(3, 1, 'Levent Otel', 'Istanbul', 'Besiktas', '5', 'Season', '2023-01-01', '2023-05-30', 'Double', 20),
(4, 1, 'Levent Otel', 'Istanbul', 'Besiktas', '5', 'Off Season', '2023-06-01', '2023-12-31', 'Double', 10),
(5, 1, 'Levent Otel', 'Istanbul', 'Besiktas', '5', 'Season', '2023-01-01', '2023-05-30', 'King Suite', 5),
(6, 1, 'Levent Otel', 'Istanbul', 'Besiktas', '5', 'Off Season', '2023-06-01', '2023-12-31', 'King Suite', 5),
(7, 2, 'Marmara Otel', 'Bursa', 'Nilufer', '3', 'Season', '2023-01-01', '2023-04-30', 'Single', 99),
(8, 2, 'Marmara Otel', 'Bursa', 'Nilufer', '3', 'Off Season', '2023-05-01', '2023-05-01', 'Single', 50),
(9, 2, 'Marmara Otel', 'Bursa', 'Nilufer', '3', 'Season', '2023-01-01', '2023-04-30', 'Double', 50),
(10, 2, 'Marmara Otel', 'Bursa', 'Nilufer', '3', 'Off Season', '2023-05-01', '2023-05-01', 'Double', 40),
(11, 3, 'Diyarbakır Suites', 'Diyarbakir', 'Merkez', '4', 'Season', '2023-01-01', '2023-08-31', 'Double', 50),
(12, 3, 'Diyarbakır Suites', 'Diyarbakir', 'Merkez', '4', 'Off Season', '2023-09-01', '2023-09-01', 'Double', 50),
(13, 3, 'Diyarbakır Suites', 'Diyarbakir', 'Merkez', '4', 'Season', '2023-01-01', '2023-08-31', 'King Suite', 20),
(14, 3, 'Diyarbakır Suites', 'Diyarbakir', 'Merkez', '4', 'Off Season', '2023-09-01', '2023-09-01', 'King Suite', 20),
(15, 4, 'Sheraton Ankara', 'Ankara', 'Kızılay', '5', 'Season', '2023-01-01', '2023-07-31', 'Single', 100),
(16, 4, 'Sheraton Ankara', 'Ankara', 'Kızılay', '5', 'Off Season', '2023-08-31', '2023-08-31', 'Single', 80),
(17, 4, 'Sheraton Ankara', 'Ankara', 'Kızılay', '5', 'Season', '2023-01-01', '2023-07-31', 'Double', 100),
(18, 4, 'Sheraton Ankara', 'Ankara', 'Kızılay', '5', 'Off Season', '2023-08-31', '2023-08-31', 'Double', 80),
(19, 4, 'Sheraton Ankara', 'Ankara', 'Kızılay', '5', 'Season', '2023-01-01', '2023-07-31', 'King Suite', 10),
(20, 4, 'Sheraton Ankara', 'Ankara', 'Kızılay', '5', 'Off Season', '2023-08-31', '2023-08-31', 'King Suite', 10);

-- --------------------------------------------------------

--
-- Table structure for table `room_type`
--

CREATE TABLE `room_type` (
  `id` int NOT NULL,
  `room_name` varchar(255) COLLATE utf8mb4_general_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `room_type`
--

INSERT INTO `room_type` (`id`, `room_name`) VALUES
(1, 'Single'),
(2, 'Double'),
(3, 'King Suite');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int NOT NULL,
  `name` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `username` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `password` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `type` enum('admin','employee') COLLATE utf8mb4_general_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `name`, `username`, `password`, `type`) VALUES
(1, 'admin', 'admin', '123', 'admin'),
(6, 'employee', 'employee', '123', 'employee');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `accommodation_type`
--
ALTER TABLE `accommodation_type`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `guest`
--
ALTER TABLE `guest`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `hotel`
--
ALTER TABLE `hotel`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `hotel_period`
--
ALTER TABLE `hotel_period`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `period_type`
--
ALTER TABLE `period_type`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `reservation`
--
ALTER TABLE `reservation`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `room`
--
ALTER TABLE `room`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `room_price`
--
ALTER TABLE `room_price`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `room_sales`
--
ALTER TABLE `room_sales`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `room_type`
--
ALTER TABLE `room_type`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `accommodation_type`
--
ALTER TABLE `accommodation_type`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `guest`
--
ALTER TABLE `guest`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `hotel`
--
ALTER TABLE `hotel`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `hotel_period`
--
ALTER TABLE `hotel_period`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `period_type`
--
ALTER TABLE `period_type`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `reservation`
--
ALTER TABLE `reservation`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `room`
--
ALTER TABLE `room`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `room_price`
--
ALTER TABLE `room_price`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `room_sales`
--
ALTER TABLE `room_sales`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `room_type`
--
ALTER TABLE `room_type`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
