DROP
DATABASE IF EXISTS Superhero;
CREATE
DATABASE Superhero;
USE
Superhero;

DROP TABLE IF EXISTS superhero_power;
DROP TABLE IF EXISTS superhero;
DROP TABLE IF EXISTS superpower;
DROP TABLE IF EXISTS city;

CREATE TABLE city
(
    city_id INT         NOT NULL AUTO_INCREMENT,
    name    VARCHAR(50) NOT NULL,
    PRIMARY KEY (city_id),
    UNIQUE INDEX (name)
);

CREATE TABLE superhero
(
    hero_id      INT         NOT NULL AUTO_INCREMENT,
    heroName     VARCHAR(50) NOT NULL,
    realName     VARCHAR(50) NOT NULL,
    creationYear INT,
    city_id      INT,
    PRIMARY KEY (hero_id),
    FOREIGN KEY (city_id) REFERENCES city (city_id)
);

CREATE TABLE superpower
(
    power_id INT         NOT NULL AUTO_INCREMENT,
    name     VARCHAR(50) NOT NULL,
    PRIMARY KEY (power_id),
    UNIQUE INDEX (name)
);

CREATE TABLE superhero_power
(
    hero_id  INT NOT NULL,
    power_id INT NOT NULL,
    PRIMARY KEY (hero_id, power_id),
    FOREIGN KEY (hero_id) REFERENCES superhero (hero_id),
    FOREIGN KEY (power_id) REFERENCES superpower (power_id)
);