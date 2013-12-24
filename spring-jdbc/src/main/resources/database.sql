create table if not exists client (
    client_id int not null,
    client_name varchar(255) not null,
    primary key (client_id)
);