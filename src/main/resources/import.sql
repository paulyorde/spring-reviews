// initialize reviews

INSERT INTO Review(id, title, content) VALUES(42, 'tech', 'tech review 1')
INSERT INTO Review(title, content) VALUES('Ford', 'Prefect truck')

// initialize categories

INSERT INTO Category(reviewNumber, id) VALUES('foo', 42)
INSERT INTO Category(reviewNumber, id) VALUES('bar', 42)