# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table desaparecidos (
  id                        bigint not null,
  nome                      varchar(255),
  sexo                      varchar(255),
  idade_quando_desapareceu  bigint,
  idade_atual               bigint,
  problema_mental           varchar(255),
  tipo_fisico               varchar(255),
  cor_da_pele               varchar(255),
  peso                      bigint,
  altura                    bigint,
  olhos                     varchar(255),
  cabelos                   varchar(255),
  data_cadastro             timestamp,
  data_atualizacao          timestamp,
  constraint pk_desaparecidos primary key (id))
;

create sequence desaparecidos_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists desaparecidos;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists desaparecidos_seq;

