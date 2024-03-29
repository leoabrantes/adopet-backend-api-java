create table tb_pet (id  bigserial not null, age float8, name varchar(255), personality varchar(255), picture_url varchar(255), size int4, species int4, status int4, primary key (id));
create table tb_pet_shelter (shelter_id int8, pet_id int8 not null, primary key (pet_id));
create table tb_role (id  bigserial not null, authority varchar(255), primary key (id));
create table tb_shelter (id  bigserial not null, city varchar(255), email varchar(255), name varchar(255), state varchar(255), telefone varchar(255), primary key (id));
create table tb_user (id  bigserial not null, email varchar(255), name varchar(255), password varchar(255), primary key (id));
create table tb_user_role (user_id int8 not null, role_id int8 not null, primary key (user_id, role_id));
alter table tb_pet_shelter add constraint FK4ygsndry160ovyurn86jqq2wd foreign key (shelter_id) references tb_shelter;
alter table tb_pet_shelter add constraint FKr04b96c8cvs3j0rsqbe9neboc foreign key (pet_id) references tb_pet;
alter table tb_user_role add constraint FKea2ootw6b6bb0xt3ptl28bymv foreign key (role_id) references tb_role;
alter table tb_user_role add constraint FK7vn3h53d0tqdimm8cp45gc0kl foreign key (user_id) references tb_user;
create table tb_pet (id  bigserial not null, age float8, name varchar(255), personality varchar(255), picture_url varchar(255), size int4, species int4, status int4, primary key (id));
create table tb_pet_shelter (shelter_id int8, pet_id int8 not null, primary key (pet_id));
create table tb_role (id  bigserial not null, authority varchar(255), primary key (id));
create table tb_shelter (id  bigserial not null, city varchar(255), email varchar(255), name varchar(255), state varchar(255), telefone varchar(255), primary key (id));
create table tb_user (id  bigserial not null, email varchar(255), name varchar(255), password varchar(255), primary key (id));
create table tb_user_role (user_id int8 not null, role_id int8 not null, primary key (user_id, role_id));
alter table tb_pet_shelter add constraint FK4ygsndry160ovyurn86jqq2wd foreign key (shelter_id) references tb_shelter;
alter table tb_pet_shelter add constraint FKr04b96c8cvs3j0rsqbe9neboc foreign key (pet_id) references tb_pet;
alter table tb_user_role add constraint FKea2ootw6b6bb0xt3ptl28bymv foreign key (role_id) references tb_role;
alter table tb_user_role add constraint FK7vn3h53d0tqdimm8cp45gc0kl foreign key (user_id) references tb_user;
create table tb_pet (id  bigserial not null, age float8, name varchar(255), personality varchar(255), picture_url varchar(255), size int4, species int4, status int4, primary key (id));
create table tb_pet_shelter (shelter_id int8, pet_id int8 not null, primary key (pet_id));
create table tb_role (id  bigserial not null, authority varchar(255), primary key (id));
create table tb_shelter (id  bigserial not null, city varchar(255), email varchar(255), name varchar(255), state varchar(255), telefone varchar(255), primary key (id));
create table tb_user (id  bigserial not null, email varchar(255), name varchar(255), password varchar(255), primary key (id));
create table tb_user_role (user_id int8 not null, role_id int8 not null, primary key (user_id, role_id));
alter table tb_pet_shelter add constraint FK4ygsndry160ovyurn86jqq2wd foreign key (shelter_id) references tb_shelter;
alter table tb_pet_shelter add constraint FKr04b96c8cvs3j0rsqbe9neboc foreign key (pet_id) references tb_pet;
alter table tb_user_role add constraint FKea2ootw6b6bb0xt3ptl28bymv foreign key (role_id) references tb_role;
alter table tb_user_role add constraint FK7vn3h53d0tqdimm8cp45gc0kl foreign key (user_id) references tb_user;
create table tb_pet (id  bigserial not null, age float8, name varchar(255), personality varchar(255), picture_url varchar(255), size int4, species int4, status int4, primary key (id));
create table tb_pet_shelter (shelter_id int8, pet_id int8 not null, primary key (pet_id));
create table tb_role (id  bigserial not null, authority varchar(255), primary key (id));
create table tb_shelter (id  bigserial not null, city varchar(255), email varchar(255), name varchar(255), state varchar(255), telefone varchar(255), primary key (id));
create table tb_user (id  bigserial not null, email varchar(255), name varchar(255), password varchar(255), primary key (id));
create table tb_user_role (user_id int8 not null, role_id int8 not null, primary key (user_id, role_id));
alter table tb_pet_shelter add constraint FK4ygsndry160ovyurn86jqq2wd foreign key (shelter_id) references tb_shelter;
alter table tb_pet_shelter add constraint FKr04b96c8cvs3j0rsqbe9neboc foreign key (pet_id) references tb_pet;
alter table tb_user_role add constraint FKea2ootw6b6bb0xt3ptl28bymv foreign key (role_id) references tb_role;
alter table tb_user_role add constraint FK7vn3h53d0tqdimm8cp45gc0kl foreign key (user_id) references tb_user;
create table tb_pet (id  bigserial not null, age float8, name varchar(255), personality varchar(255), picture_url varchar(255), size int4, species int4, status int4, primary key (id));
create table tb_pet_shelter (shelter_id int8, pet_id int8 not null, primary key (pet_id));
create table tb_role (id  bigserial not null, authority varchar(255), primary key (id));
create table tb_shelter (id  bigserial not null, city varchar(255), email varchar(255), name varchar(255), state varchar(255), telefone varchar(255), primary key (id));
create table tb_user (id  bigserial not null, email varchar(255), name varchar(255), password varchar(255), primary key (id));
create table tb_user_role (user_id int8 not null, role_id int8 not null, primary key (user_id, role_id));
alter table tb_pet_shelter add constraint FK4ygsndry160ovyurn86jqq2wd foreign key (shelter_id) references tb_shelter;
alter table tb_pet_shelter add constraint FKr04b96c8cvs3j0rsqbe9neboc foreign key (pet_id) references tb_pet;
alter table tb_user_role add constraint FKea2ootw6b6bb0xt3ptl28bymv foreign key (role_id) references tb_role;
alter table tb_user_role add constraint FK7vn3h53d0tqdimm8cp45gc0kl foreign key (user_id) references tb_user;
