DROP DATABASE IF EXISTS jaegers WITH (FORCE);

CREATE DATABASE jaegers;

\c jaegers;

CREATE TABLE Jaegers (
    id        SERIAL PRIMARY KEY,
    modelName TEXT,
    mark      CHAR(6),
    height    REAL,
    weight    REAL,
    status    TEXT,
    origin    TEXT,
    launch    DATE,
    kaijuKill INTEGER
);

\ir 'init_db.sql';
\ir 'queries.sql';