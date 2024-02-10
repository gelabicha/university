create table students (
id serial primary key,
firstname text,
lastname text,
per_number VARCHAR(255),
email text,
phone VARCHAR(255)
);


create table teachers (
id serial primary key,
firstname text,
lastname text,
per_number VARCHAR(255),
email text,
phone VARCHAR(255)
);


create table groups (
id serial primary key,
student_id int,
teacher_id int,
FOREIGN KEY (student_id) REFERENCES students(id),
FOREIGN KEY (teacher_id) REFERENCES teachers(id)
);