use ticketing;



INSERT INTO tickets (customer_name, ticket_description, ticket_status, ticket_priority)
VALUES ('John Doe', 'Issue with website login', 'Open', 'High');

SELECT * FROM tickets;


CREATE TABLE users (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(100) NOT NULL,
    access_mode ENUM('Normal') DEFAULT 'Normal',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

CREATE TABLE administrators (
    admin_id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(100) NOT NULL,
    access_mode ENUM('Administrator') DEFAULT 'Administrator',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

CREATE TABLE tickets (
    ticket_id INT AUTO_INCREMENT PRIMARY KEY,
    customer_name VARCHAR(100) NOT NULL,
    ticket_description TEXT NOT NULL,
    ticket_status ENUM('Open', 'In Progress', 'Closed') DEFAULT 'Open',
    ticket_priority ENUM('Low', 'Medium', 'High') DEFAULT 'Medium',
    assigned_to INT, -- Reference to administrators table (admin_id)
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (assigned_to) REFERENCES administrators (admin_id)
);

ALTER TABLE tickets
ADD COLUMN location VARCHAR(100) NOT NULL;

-- Inserting data into the `users` table
INSERT INTO users (username, password) VALUES
    ('john_doe', 'password123'),
    ('jane_smith', 'hello456'),
    ('bob_jackson', 'mysecret');
    
-- Inserting data into the `administrators` table
INSERT INTO administrators (username, password) VALUES
    ('gabriel.balascan', 'adminpass1'),
    ('marius.rosu', 'adminpass2');


-- Inserting data into the `tickets` table    
INSERT INTO tickets (customer_name, ticket_description, ticket_status, ticket_priority, assigned_to, location) VALUES
    ('matei.corvin', 'Resetare parola', 'Open', 'High', 1, 'Deta'),
    ('andrei.novac', 'Imprimanta blocheaza hartie', 'Open', 'Medium', 2, 'SPF Aeroport'),
    ('andreea.manea', 'Ups Stricat', 'In Progress', 'High', 1, 'Jimbolia'),
    ('daria.nicolae', 'Camera hunter defecta', 'Open', 'Low', 2,'Moravita');







