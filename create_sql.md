All the tables
  Room ( id, No, type, price)
  Guest ( id, name, email, phoneNo, room_booked)
  Admin ( id, name, email, phoneNo)
  Food ( id, name, price, type)

1) Room table creation
      Create table Room (id int NOT NULL, No int NOT NULL PRIMARY KEY type varchar(255) NOT NULL, price DECIMAL(10,2));
 
2)Guest table creation
      Create table Guest(id int NOT NULL, name varchar(255) NOT NULL, email varchar(255) NOT NULL ,phoneNo varchar(255) NOT NULL PRIMARY KEY,
                    room_booked int NOT NULL);
3)Admin table creation                    
      Create table Admin(id int NOT NULL, name varchar(255) NOT NULL, email varchar(255) NOT NULL ,phoneNo varchar(255) NOT NULL PRIMARY KEY);

4)Food table creation
      create table Food (id int NOT NULL, name varchar(255) NOT NULL PRIMARY KEY,  price DECIMAL(10,2),  type varchar(255) NOT NULL);
