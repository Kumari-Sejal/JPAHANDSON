DROP TABLE [IF EXISTS] country;
CREATE TABLE country (
  co_code varchar(2) NOT NULL,
  co_name varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
