DROP TABLE IF EXISTS Activity;
DROP TABLE IF EXISTS Card;
DROP TABLE IF EXISTS Category;

CREATE TABLE Category(
    Id int auto_increment primary key,
    Name varchar(64) not null,
    Status boolean not null
);

CREATE TABLE Card(
    Id int auto_increment primary key,
    Contents varchar(500) not null,
    Created_Time datetime,
    Modified_Time datetime,
    Status boolean not null,
    Category int references Category(Id),
    Category_key int
);

CREATE TABLE Activity (
    Id int auto_increment primary key,
    Action enum('ADD', 'REMOVE', 'UPDATE', 'MOVE') not null,
    Card int references Card(Id),
    Card_key int,
    Start_Category varchar(32) not null,
    End_Category varchar(32) not null
);
