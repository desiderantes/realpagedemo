create table users
(
    id         bigint identity,
    name       nvarchar(100)                             not null,
    username   nvarchar(60)                              not null
        constraint unique_username
            unique,
    password   nvarchar(60)                              not null,
    role       nvarchar(20)
        constraint DF_users_role default N'ADMIN'        not null
        constraint enum_check
            check ([role] = N'REGULAR' OR [role] = N'ADMIN'),
    enabled    bit
        constraint DF_users_enabled default 1            not null,
    created_at datetimeoffset
        constraint DF_users_created_at default getdate() not null,
    primary key (id)
)
