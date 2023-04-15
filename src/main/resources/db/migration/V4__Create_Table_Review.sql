CREATE TABLE IF NOT EXISTS `review` (
  `id` BIGINT AUTO_INCREMENT PRIMARY KEY,
  `stars` INT,
  `author_id` BIGINT,
  `product_id` BIGINT,
  CONSTRAINT `fk_review_author` FOREIGN KEY (`author_id`) REFERENCES `author` (`id`),
  CONSTRAINT `fk_review_product` FOREIGN KEY (`product_id`) REFERENCES `product` (`id`)
);