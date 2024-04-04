
create table Kund(
    KundID int primary key,
    Namn varchar(25),
    Efternamn varchar(25),
    Email varchar(100),
    Telefon varchar(12),
    Adress varchar(50),
    Ort varchar(15),
    Postnummer int

);

create table Orders(
    OrderID int primary key,
    Datum DATE,
    Status varchar(50),
    KundID int,
    ProduktID int,
    FOREIGN KEY (KundID) References Kund(KundID),
    FOREIGN KEY (ProduktID) References Produkt(ProduktID)

);

Create table Produkt(
    ProduktID int primary key,
    Namn varchar(50),
    Antal int,
    Storlek varchar(20),
    Pris Decimal(10,2)
);

Create table Material(
    MaterialID int primary key,
    pris Decimal(10, 2)
);

Create table ProduktMaterial(
    ProduktID int,
    MaterialID int,
    Primary key (ProduktID, MaterialID),
    FOREIGN KEY (ProduktID) References Produkt(ProduktID),
    FOREIGN KEY (MaterialID) References Material(MaterialID)
);

Create table Utsmyckning(
    UtsmyckningID int Primary Key,
    MaterialID int,
    Namn varchar(50),
    Typ varchar(25),
    Antal int,
    FOREIGN KEY (MaterialID) References Material(MaterialID)
);

Create table LeverantörMaterial(
    LeverantörID INT,
    MaterialID INT,
    PRIMARY KEY (LeverantörID, MaterialID),
    FOREIGN KEY (LeverantörID) REFERENCES Leverantör(LeverantörID),
    FOREIGN KEY (MaterialID) REFERENCES Material(MaterialID)

);

Create table Tyg(
    TygID int Primary Key,
    MaterialID int,
    Namn varchar(50),
    Färg varchar(15),
    Antal Decimal(3,2),
    FOREIGN KEY (MaterialID) References Material(MaterialID)
);

Create table Leverantör(
    LeverantörID int Primary Key,
    Namn varchar(50),
    Telefon varchar(15)
);

Create table Medarbetare(
    MedarbetarID int Primary Key,
    Namn varchar(25),
    Roll varchar(15),
    Epost varchar(100),
    Lösenord varchar(10)
);

Create table SkapaProdukt(
    ProduktID int,
    MedarbetarID int,
    Primary key (ProduktID, MedarbetarID),
    FOREIGN KEY (ProduktID) References Produkt(ProduktID),
    FOREIGN KEY (MedarbetarID) References Medarbetare(MedarbetarID)
);

Create Table Faktura(
    FakturaID int primary key,
    Totalbelopp decimal(10,2),
    KundID int,
    OrderID int,
    FOREIGN KEY (KundID) REFERENCES Kund(KundID),
    FOREIGN KEY (OrderID) REFERENCES Orders(OrderID)
);