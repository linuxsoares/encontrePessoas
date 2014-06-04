# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table usuario_sistema (
  id                        bigint not null,
  email                     varchar(255),
  password                  varchar(255),
  full_name                 varchar(255),
  is_admin                  boolean,
  constraint pk_usuario_sistema primary key (id))
;

create sequence usuario_sistema_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists usuario_sistema;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists usuario_sistema_seq;

