CREATE TABLE billett
(
    id INTEGER AUTO_INCREMENT NOT NULL,
    fornavn   VARCHAR(225) NOT NULL,
    etternavn VARCHAR(225) NOT NULL,
    film      VARCHAR(225) NOT NULL,
    telefonnr VARCHAR(225) NOT NULL,
    mail      VARCHAR(225) NOT NULL,
    antall    VARCHAR(225) NOT NULL,
    PRIMARY KEY (id)
);