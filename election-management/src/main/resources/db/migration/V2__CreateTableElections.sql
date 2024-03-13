CREATE TABLE elections (
  id VARCHAR(40) NOT NULL,
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
PRIMARY KEY (id));

CREATE TABLE election_candidate (
  election_id VARCHAR(40) NOT NULL,
  candidate_id VARCHAR(40) NOT NULL,
  votes INTEGER DEFAULT 0,
PRIMARY KEY (election_id, candidate_id));

insert into candidates (id, photo, given_name, family_name, email, phone, job_title) values (1, 'http://dummyimage.com/146x100.png/dddddd/000000', 'Mallorie', 'Clinkard', 'mclinkard0@w3.org', '994-187-3080', 'Chief Design Engineer');
insert into candidates (id, photo, given_name, family_name, email, phone, job_title) values (2, 'http://dummyimage.com/211x100.png/ff4444/ffffff', 'Brandea', 'Stoller', 'bstoller1@usda.gov', '389-623-7032', 'General Manager');
insert into candidates (id, photo, given_name, family_name, email, phone, job_title) values (3, 'http://dummyimage.com/226x100.png/ff4444/ffffff', 'Leandra', 'Sneller', 'lsneller2@google.nl', '222-437-7028', 'Teacher');
insert into candidates (id, photo, given_name, family_name, email, phone, job_title) values (4, 'http://dummyimage.com/119x100.png/dddddd/000000', 'Antonin', 'Chasteney', 'achasteney3@mayoclinic.com', '809-499-4279', 'Professor');
insert into candidates (id, photo, given_name, family_name, email, phone, job_title) values (5, 'http://dummyimage.com/215x100.png/dddddd/000000', 'Natalina', 'Pentycross', 'npentycross4@ow.ly', '829-349-6407', 'Paralegal');
insert into candidates (id, photo, given_name, family_name, email, phone, job_title) values (6, 'http://dummyimage.com/172x100.png/ff4444/ffffff', 'Marrissa', 'Merkel', 'mmerkel5@senate.gov', '209-819-2325', 'Senior Financial Analyst');
insert into candidates (id, photo, given_name, family_name, email, phone, job_title) values (7, 'http://dummyimage.com/127x100.png/5fa2dd/ffffff', 'Kelsey', 'Carl', 'kcarl6@apple.com', '841-443-8451', 'Graphic Designer');
insert into candidates (id, photo, given_name, family_name, email, phone, job_title) values (8, 'http://dummyimage.com/234x100.png/dddddd/000000', 'Rabi', 'Benasik', 'rbenasik7@naver.com', '439-243-3919', 'Senior Developer');
insert into candidates (id, photo, given_name, family_name, email, phone, job_title) values (9, 'http://dummyimage.com/167x100.png/ff4444/ffffff', 'Broderic', 'Wandrack', 'bwandrack8@telegraph.co.uk', '990-586-1535', 'Biostatistician I');
insert into candidates (id, photo, given_name, family_name, email, phone, job_title) values (10, 'http://dummyimage.com/240x100.png/cc0000/ffffff', 'Moss', 'Oddy', 'moddy9@bizjournals.com', '334-923-5562', 'Senior Developer');
insert into candidates (id, photo, given_name, family_name, email, phone, job_title) values (11, 'http://dummyimage.com/178x100.png/ff4444/ffffff', 'Giuditta', 'Gower', 'ggowera@canalblog.com', '321-715-5558', 'VP Quality Control');
insert into candidates (id, photo, given_name, family_name, email, phone, job_title) values (12, 'http://dummyimage.com/243x100.png/dddddd/000000', 'Garvin', 'Sugar', 'gsugarb@berkeley.edu', '693-320-8702', 'Marketing Manager');
insert into candidates (id, photo, given_name, family_name, email, phone, job_title) values (13, 'http://dummyimage.com/154x100.png/ff4444/ffffff', 'Lonnie', 'Inskipp', 'linskippc@com.com', '672-613-2874', 'Safety Technician I');
insert into candidates (id, photo, given_name, family_name, email, phone, job_title) values (14, 'http://dummyimage.com/107x100.png/cc0000/ffffff', 'Fiona', 'Sygroves', 'fsygrovesd@theglobeandmail.com', '608-459-9396', 'Health Coach III');
insert into candidates (id, photo, given_name, family_name, email, phone, job_title) values (15, 'http://dummyimage.com/201x100.png/ff4444/ffffff', 'Priscella', 'Critcher', 'pcritchere@chicagotribune.com', '680-291-0533', 'Assistant Media Planner');
insert into candidates (id, photo, given_name, family_name, email, phone, job_title) values (16, 'http://dummyimage.com/131x100.png/ff4444/ffffff', 'Rivkah', 'Bernth', 'rbernthf@wikipedia.org', '871-760-8160', 'Design Engineer');
insert into candidates (id, photo, given_name, family_name, email, phone, job_title) values (17, 'http://dummyimage.com/191x100.png/ff4444/ffffff', 'Bellina', 'Bolin', 'bboling@sitemeter.com', '328-235-5765', 'Teacher');
insert into candidates (id, photo, given_name, family_name, email, phone, job_title) values (18, 'http://dummyimage.com/206x100.png/ff4444/ffffff', 'Shaun', 'Ruddy', 'sruddyh@stumbleupon.com', '798-703-8467', 'Graphic Designer');
insert into candidates (id, photo, given_name, family_name, email, phone, job_title) values (19, 'http://dummyimage.com/108x100.png/dddddd/000000', 'Bruce', 'Fullerd', 'bfullerdi@360.cn', '737-325-9898', 'Media Manager III');
insert into candidates (id, photo, given_name, family_name, email, phone, job_title) values (20, 'http://dummyimage.com/107x100.png/5fa2dd/ffffff', 'Willem', 'Eggerton', 'weggertonj@gizmodo.com', '591-209-3090', 'Web Developer II');
insert into candidates (id, photo, given_name, family_name, email, phone, job_title) values (21, 'http://dummyimage.com/123x100.png/cc0000/ffffff', 'Malina', 'Terrington', 'mterringtonk@instagram.com', '927-325-4737', 'Engineer II');
insert into candidates (id, photo, given_name, family_name, email, phone, job_title) values (22, 'http://dummyimage.com/110x100.png/cc0000/ffffff', 'Omar', 'Kinghorn', 'okinghornl@icio.us', '823-206-8448', 'Dental Hygienist');
insert into candidates (id, photo, given_name, family_name, email, phone, job_title) values (23, 'http://dummyimage.com/106x100.png/cc0000/ffffff', 'Moe', 'Kew', 'mkewm@hc360.com', '336-331-0546', 'Staff Scientist');
insert into candidates (id, photo, given_name, family_name, email, phone, job_title) values (24, 'http://dummyimage.com/176x100.png/dddddd/000000', 'Lauritz', 'Maddy', 'lmaddyn@amazon.com', '382-908-5161', 'Financial Analyst');
insert into candidates (id, photo, given_name, family_name, email, phone, job_title) values (25, 'http://dummyimage.com/112x100.png/5fa2dd/ffffff', 'Brigid', 'Rouge', 'brougeo@indiatimes.com', '592-259-7353', 'Assistant Media Planner');
