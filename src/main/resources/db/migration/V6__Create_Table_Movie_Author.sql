CREATE TABLE IF NOT EXISTS `movie_author` (
  `movie_id` BIGINT,
  `author_id` BIGINT,
  CONSTRAINT `pk_movie_author` PRIMARY KEY (`movie_id`, `author_id`),
  CONSTRAINT `fk_movie_author_movie` FOREIGN KEY (`movie_id`) REFERENCES `movie` (`id`),
  CONSTRAINT `fk_movie_author_author` FOREIGN KEY (`author_id`) REFERENCES `author` (`id`)
);