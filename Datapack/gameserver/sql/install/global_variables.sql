DROP TABLE IF EXISTS `global_variables`;
CREATE TABLE IF NOT EXISTS `global_variables` (
  `var`  VARCHAR(255) NOT NULL DEFAULT '',
  `value` VARCHAR(255) ,
  PRIMARY KEY (`var`)
)  ENGINE=InnoDB DEFAULT CHARSET=UTF8MB4;