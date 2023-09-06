INSERT INTO tb_user (name, email, password) VALUES ('Leo Abrantes', 'leo@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Bob Brown', 'bob@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Ana Brown', 'ana@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');
INSERT INTO tb_role (authority) VALUES ('ROLE_TUTOR');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 2);


INSERT INTO tb_pet (name, age, personality, picture_URL, species, size, status) 
VALUES ('Bob', 3,'friendly', 'https://www.petz.com.br/blog/wp-content/uploads/2019/05/cachorro-independente-1.jpg', 0, 4, 0);

INSERT INTO tb_pet (name, age, personality, picture_URL, species, size, status) 
VALUES ('Sara', 2,'loyal', 'https://www.petz.com.br/blog/wp-content/uploads/2019/05/cachorro-independente-3.jpg', 0, 2, 1);

INSERT INTO tb_pet (name, age, personality, picture_URL, species, size, status) 
VALUES ('Thor', 3,'adaptable', 'https://www.petz.com.br/blog/wp-content/uploads/2019/05/cachorro-independente-2.jpg', 0, 4, 1);

INSERT INTO tb_pet (name, age, personality, picture_URL, species, size, status) 
VALUES ('Gru', 7,'loyal', 'https://www.petz.com.br/blog/wp-content/uploads/2023/07/melhor-coleira-para-pitbull-1.jpg', 0, 1, 4);

INSERT INTO tb_pet (name, age, personality, picture_URL, species, size, status) 
VALUES ('Sony', 4,'friendly', 'https://www.petz.com.br/blog/wp-content/uploads/2023/07/porque-cachorro-come-fezes-de-cavalo.jpg', 0, 2, 3);

INSERT INTO tb_pet (name, age, personality, picture_URL, species, size, status) 
VALUES ('Amora', 2,'lovely', 'https://conteudo.imguol.com.br/c/entretenimento/eb/2022/03/23/cachorro-da-raca-lulu-da-pomeramia-1648065976007_v2_900x506.jpg', 0, 1, 2);

INSERT INTO tb_pet (name, age, personality, picture_URL, species, size, status) 
VALUES ('Meg', 1,'lovely', 'https://www.petz.com.br/blog/wp-content/uploads/2023/08/gato-pode-comer-uva-passa3.jpg', 1, 2, 1);

INSERT INTO tb_pet (name, age, personality, picture_URL, species, size, status) 
VALUES ('Xisto', 2,'adaptable', 'https://www.petz.com.br/blog/wp-content/uploads/2023/08/gato-pode-comer-doce-de-leite3.jpg', 1, 1, 2);

INSERT INTO tb_pet (name, age, personality, picture_URL, species, size, status) 
VALUES ('Catita', 8,'friendly', 'https://www.petz.com.br/blog/wp-content/uploads/2023/07/cachorro-de-cada-signo.jpg', 0, 1, 1);

INSERT INTO tb_pet (name, age, personality, picture_URL, species, size, status) 
VALUES ('Mel', 1,'loyal', 'https://www.petz.com.br/blog/wp-content/uploads/2023/08/gato-pode-comer-acucar3.jpg', 1, 1, 3);



INSERT INTO tb_shelter (name, city, state, email, telefone) 
VALUES ('Mauá Pets', 'Mauá', 'SP', 'mauapets@outlook.com', '(11)88887777');

INSERT INTO tb_shelter (name, city, state, email, telefone) 
VALUES ('Pets Minas', 'Ubá', 'MG', 'petsminas@outlook.com', '(32)99998888');

INSERT INTO tb_shelter (name, city, state, email, telefone) 
VALUES ('Pets House', 'Rio de Janeiro', 'RJ', 'petshouse@outlook.com', '(19)66667777');


INSERT INTO tb_pet_shelter (pet_id, shelter_id) VALUES (1, 1);
INSERT INTO tb_pet_shelter (pet_id, shelter_id) VALUES (2, 2);
INSERT INTO tb_pet_shelter (pet_id, shelter_id) VALUES (3, 3);
INSERT INTO tb_pet_shelter (pet_id, shelter_id) VALUES (4, 1);
INSERT INTO tb_pet_shelter (pet_id, shelter_id) VALUES (5, 2);
INSERT INTO tb_pet_shelter (pet_id, shelter_id) VALUES (6, 3);
INSERT INTO tb_pet_shelter (pet_id, shelter_id) VALUES (7, 1);
INSERT INTO tb_pet_shelter (pet_id, shelter_id) VALUES (8, 2);
INSERT INTO tb_pet_shelter (pet_id, shelter_id) VALUES (9, 3);
INSERT INTO tb_pet_shelter (pet_id, shelter_id) VALUES (10, 1);
