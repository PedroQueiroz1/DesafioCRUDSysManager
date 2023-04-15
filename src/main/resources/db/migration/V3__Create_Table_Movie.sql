CREATE TABLE IF NOT EXISTS `movie` (
  `id` BIGINT,
  `duration` INT,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_movie_product` FOREIGN KEY (`id`) REFERENCES `product` (`id`)
);