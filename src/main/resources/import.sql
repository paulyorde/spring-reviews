
INSERT INTO Category(title) VALUES('trucks')
INSERT INTO Category(title) VALUES('cars')

INSERT INTO Category (reviews)
SELECT title, image_url, content, category_id FROM REVIEW;


insert into REVIEW (title, image_url, content, category_id) values ('matrices','me.png', 'id nisl venenatis lacinia aenean sit amet justo morbi ut odio cras mi pede malesuada in imperdiet et commodo', 1);
insert into REVIEW (title, image_url, content, category_id) values ('migration', 'me.png', 'nulla nisl nunc nisl duis bibendum felis sed interdum venenatis turpis enim blandit mi in porttitor', 2);
insert into REVIEW (title, image_url, content, category_id) values ('secondary', 'me.png','amet consectetuer adipiscing elit proin interdum mauris non ligula pellentesque ultrices phasellus id sapien in sapien', 1);
insert into REVIEW (title, image_url, content, category_id) values ('flexibility','me.png', 'eget orci vehicula condimentum curabitur in libero ut massa volutpat convallis morbi odio', 2);
insert into REVIEW (title, image_url, content, category_id) values ('context-sensitive', 'me.png', 'massa volutpat convallis morbi odio odio elementum eu interdum eu tincidunt in leo maecenas pulvinar lobortis est phasellus sit', 2);
insert into REVIEW (title, image_url, content, category_id) values ('Operative', 'me.png', 'congue elementum in hac habitasse platea dictumst morbi vestibulum velit id pretium iaculis diam erat fermentum', 1);
insert into REVIEW (title, image_url, content, category_id) values ('Re-contextualized', 'me.png', 'facilisi cras non velit nec nisi vulputate nonummy maecenas tincidunt lacus', 2);
insert into REVIEW (title, image_url, content, category_id) values ('Synergized', 'me.png', 'quam sapien varius ut blandit non interdum in ante vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere', 1);
insert into REVIEW (title, image_url, content, category_id) values ('Profound', 'me.png', 'cum sociis natoque penatibus et magnis dis parturient montes nascetur ridiculus', 1);
insert into REVIEW (title, image_url, content, category_id) values ('projection', 'me.png', 'eu massa donec dapibus duis at velit eu est congue elementum in hac habitasse platea dictumst morbi vestibulum velit id', 1);







