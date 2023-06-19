INSERT INTO city (name)
VALUES ('Gotham'),
       ('Metropolis'),
       ('Central City');

INSERT INTO superhero (heroName, realName, creationYear, city_id)
VALUES ('Batman', 'Bruce Wayne', 1939, 1),
       ('Superman', 'Clark Kent', 1938, 2),
       ('Flash', 'Barry Allen', 1940, 3);

INSERT INTO superpower (name)
VALUES ('Super Strength'),
       ('Invisibility'),
       ('Flight'),
       ('Superspeed');

INSERT INTO superhero_power (hero_id, power_id)
VALUES (1, 1),
       (1, 2),
       (2, 1),
       (2, 3),
       (3, 4);
