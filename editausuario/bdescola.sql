-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 15-Fev-2019 às 13:53
-- Versão do servidor: 10.1.10-MariaDB
-- PHP Version: 5.6.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bdusuario`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `endereco`
--

CREATE TABLE `endereco` (
  `cod_end` int(4) NOT NULL,
  `tipo_logradouro` varchar(30) NOT NULL,
  `logradouro` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `endereco`
--

INSERT INTO `endereco` (`cod_end`, `tipo_logradouro`, `logradouro`) VALUES
(1, 'Avenina', 'JoÃ£o Pessoa'),
(2, 'Rua', 'JoÃ£o Pessoa'),
(3, 'Rua', '5'),
(4, 'Avenida', 'Eduardo Costa'),
(5, 'PraÃ§a', '2'),
(6, 'PraÃ§a', '2'),
(7, 'Travessa', 'Medeiros'),
(8, 'Rua', 'Silva');

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE `usuario` (
  `cod_usuario` int(4) NOT NULL,
  `nome_usuario` varchar(50) NOT NULL,
  `sobrenome_usuario` varchar(100) NOT NULL,
  `cod_end` int(4) DEFAULT NULL,
  `login` varchar(50) NOT NULL,
  `senha` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`cod_usuario`, `nome_usuario`, `sobrenome_usuario`, `cod_end`, `login`, `senha`) VALUES
(1, 'Vanessa', 'Marins', NULL, '', ''),
(2, 'Vanessa', 'da Silva', NULL, '', ''),
(3, 'Miguel', 'da Silva Moncao', NULL, '', ''),
(4, 'AndrÃ©', 'GonÃ§alves', NULL, '', ''),
(5, 'Neuza', 'Perce', NULL, '', ''),
(6, 'JosÃ© Carlos', 'Batista', NULL, '', ''),
(7, 'Angela', 'Maria', 1, '', ''),
(8, 'Paulo', 'Gustavo', 2, '', ''),
(9, 'Raphael', 'Medeiros', 3, 'rafamedeiros', 'e10adc39'),
(10, 'Maria Claudia', 'Abreu', 4, 'mcabreu', 'e10adc39'),
(11, 'Emanuel', 'Menezes', 5, 'emenezes', '123'),
(12, 'JoÃ£oPaulo', 'Ribeiro', 6, 'jpribeiro', '123456'),
(13, 'Miguel', 'Moncao', 7, 'mmoncao', 'e10adc39'),
(14, 'Gabriel', 'Oliveira', 8, 'goliveira', 'e10adc39');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `endereco`
--
ALTER TABLE `endereco`
  ADD PRIMARY KEY (`cod_end`),
  ADD UNIQUE KEY `cod_end` (`cod_end`);

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`cod_usuario`),
  ADD UNIQUE KEY `cod_usuario` (`cod_usuario`),
  ADD KEY `cod_end` (`cod_end`),
  ADD KEY `cod_end_2` (`cod_end`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `endereco`
--
ALTER TABLE `endereco`
  MODIFY `cod_end` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT for table `usuario`
--
ALTER TABLE `usuario`
  MODIFY `cod_usuario` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`cod_end`) REFERENCES `endereco` (`cod_end`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
