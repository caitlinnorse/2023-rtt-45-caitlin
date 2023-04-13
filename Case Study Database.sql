-- insert into events (name, date, location, other_events, event_type) values ("THON", '2023-02-17 18:00:00', "Bryce Jordan Center", "Blue Band 5K", "THON");
-- insert into events (name, date, location, other_events, event_type) values ("Penn State Basketball VS Illinois", '2023-02-14 19:00:00', "University Park, PA", "N/A", "Basketball");

-- insert into events (name, date, location, other_events, event_type) values ("Penn State Basketball VS Winthrop", '2022-11-07 19:00:00', "University Park, PA", "N/A", "Basketball");

update events set date="2023/02/17" where name = "THON";
select * from events;
