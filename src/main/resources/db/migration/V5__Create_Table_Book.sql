CREATE TABLE IF NOT EXISTS `book` (
  `id` BIGINT,
  `author_id` BIGINT,
  `genre` VARCHAR(255),
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_book_author` FOREIGN KEY (`author_id`) REFERENCES `author` (`id`),
  CONSTRAINT `fk_book_product` FOREIGN KEY (`id`) REFERENCES `product` (`id`)
);