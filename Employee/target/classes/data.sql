-- Insert sample data into the 'employee' table
INSERT INTO employee (firstname, lastName, email) VALUES
('John', 'Doe', 'john.doe@example.com'),
('Jane', 'Smith', 'jane.smith@example.com'),
('Bob', 'Johnson', 'bob.johnson@example.com');

-- Insert sample data into the 'roles' table
INSERT INTO roles (name) VALUES
('ROLE_USER'),
('ROLE_ADMIN');

-- Insert sample data into the 'users' table
INSERT INTO users (username, password) VALUES
('user1', '$2a$10$6yyv1w.TybTJh5JIMT0HxO3tI3SRE6fNapv4gKsJ8hY/QfISvW7rJ'), -- Password is 'password1'
('user2', '$2a$10$JPTlWkEpj/EMlEcU5x48A.qSzpuSCrGyS6YQ2VCQe9vWbM6hiae32'); -- Password is 'password2'

-- Insert user-role associations in the 'users_roles' join table
INSERT INTO users_roles (user_id, role_id) VALUES
(1, 1), -- User 1 has ROLE_USER
(2, 2); -- User 2 has ROLE_ADMIN
