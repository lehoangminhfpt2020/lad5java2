CREATE database giftshop;
USE database giftshop;
CREATE table GIFT(
GID int not null,
GName varchar(50),
GPrice decimal(10,0),
Gqty int,
CONSTRAINT PK_GID PRIMARY KEY (GID)
);

insert into GIFT(GID,GName,GPrice,Gqty) values
(001,"ok",40000,5);
