CREATE TABLE users (
  id INTEGER PRIMARY KEY,
  name VARCHAR(30)
);

CREATE TABLE email_addresses (
  id INTEGER PRIMARY KEY,
  user_id INTEGER,
  email VARCHAR(256),
  CONSTRAINT fk_users_id FOREIGN KEY (user_id)
      REFERENCES users (id)
      ON UPDATE NO ACTION ON DELETE NO ACTION
);
