create table Book(
    id IDENTITY ,
    title varchar(100) NOT NULL,
    rating varchar(25)
);

create table Author(
    id IDENTITY ,
    first_name varchar(25) NOT NULL,
    last_name varchar(100) NOT NULL
);

create TABLE Book_Author (
    book INTEGER,
    author INTEGER
);