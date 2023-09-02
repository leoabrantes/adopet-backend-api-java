INSERT INTO tb_user (name, email, password) VALUES ('Bob Brown', 'bob@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Ana Brown', 'ana@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_TUTOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);


INSERT INTO tb_pet (name, age, personality, picture_URL, species, size, status) 
VALUES ('Bob', 3,'friendly', 'https://eu.themyersbriggs.com/en/Using-Type/Your-Type-image?typie=030f9ffa-f863-47af-8e5d-31df68e64b13', 1, 2, 2);

INSERT INTO tb_pet (name, age, personality, picture_URL, species, size, status) 
VALUES ('Bingo', 2,'loyal', 'https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.petz.com.br%2Fblog%2Fdicas%2Fcat-sitter%2F&psig=AOvVaw2tFDUYRPjSr0xuluYPN5dh&ust=1682709714213000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCLCS8Kjkyv4CFQAAAAAdAAAAABAE', 0, 1, 3);

INSERT INTO tb_shelter (name, city, state) 
VALUES ('Mauá Petz', 'Mauá', 'São Paulo');

INSERT INTO tb_shelter (name, city, state) 
VALUES ('Petz Minas', 'Ubá', 'Minas Gerais');


INSERT INTO tb_pet_shelter (pet_id, shelter_id) VALUES (1, 1);
INSERT INTO tb_pet_shelter (pet_id, shelter_id) VALUES (2, 2);
