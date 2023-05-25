-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 25-Maio-2023 às 20:46
-- Versão do servidor: 10.4.24-MariaDB
-- versão do PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `estoque`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `produtos`
--

CREATE TABLE `produtos` (
  `id` int(11) NOT NULL,
  `data` varchar(30) DEFAULT NULL,
  `nome` varchar(30) NOT NULL,
  `fornecedor` varchar(30) NOT NULL,
  `tipo` varchar(30) NOT NULL,
  `quantidade` varchar(30) NOT NULL,
  `preco` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `produtos`
--

INSERT INTO `produtos` (`id`, `data`, `nome`, `fornecedor`, `tipo`, `quantidade`, `preco`) VALUES
(11, '19/05/2023', 'Paulo Ricardo', 'Seara', 'Hambúrguer', '60', '55.0'),
(12, '19/05/2023', 'Gustavo', 'Seara', 'Queijo Prato', '55', '55.0'),
(13, '19/05/2023', 'Cleiton', 'Seara', 'Queijo Prato', '10', '55.0'),
(15, '19/05/2023', 'Gabriel', 'Seara', 'Queijo Prato', '60', '55.0');

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE `usuario` (
  `id` int(11) NOT NULL,
  `nome` varchar(30) NOT NULL,
  `telefone` int(11) DEFAULT NULL,
  `endereco` varchar(30) DEFAULT NULL,
  `cpf` varchar(30) NOT NULL,
  `senha` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`id`, `nome`, `telefone`, `endereco`, `cpf`, `senha`) VALUES
(1, '', NULL, NULL, '123', '123'),
(2, '', NULL, NULL, '159', '159'),
(3, '', NULL, NULL, '147', '147'),
(4, '', NULL, NULL, '123', '123'),
(5, '', NULL, NULL, '1234', '1234'),
(6, '', NULL, NULL, '147', '189'),
(7, '', NULL, NULL, '1234', '123'),
(8, 'teste', 123456, 'teste', '1234', '1234');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `produtos`
--
ALTER TABLE `produtos`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `produtos`
--
ALTER TABLE `produtos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT de tabela `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
