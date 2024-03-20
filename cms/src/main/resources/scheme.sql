CREATE TABLE ABEEK(code varchar(5) primary key ,
                   name varchar(5) not null )
    AS SELECT * FROM CSVREAD('classpath:/data/ABEEK.csv');

CREATE TABLE ABEEK_COURSE(course_id varchar(10),
                          abeek_code varchar(5),
                          credit numeric(1,0) not null,
                          primary key (course_id, abeek_code))
    AS SELECT * FROM CSVREAD('classpath:/data/ABEEK_COURSE.csv');

CREATE TABLE COURSE(id varchar(10) primary key ,
                    name varchar(20) not null ,
                    credit numeric(2,1) not null )
    AS SELECT * FROM CSVREAD('classpath:/data/COURSE.csv');

CREATE TABLE COURSE_CLASSIFICATION(code varchar(5) primary key ,
                                   "name" varchar(10) not null )
    AS SELECT * FROM CSVREAD('classpath:/data/COURSE_CLASSIFICATION.csv');

CREATE TABLE GRADUATION_CRITERIA(admission_year int,
                                 graduation_criteria_item_code varchar(5),
                                 credit numeric(3,0),
                                 primary key (admission_year, graduation_criteria_item_code))
    AS SELECT * FROM CSVREAD('classpath:/data/GRADUATION_CRITERIA.csv');

CREATE TABLE GRADUATION_CRITERIA_ITEM(code varchar(5) primary key ,
                                      "name" varchar(10) not null)
    AS SELECT * FROM CSVREAD('classpath:/data/GRADUATION_CRITERIA_ITEM.csv');

CREATE TABLE PRE_COURSE(course_id varchar(10),
                        id varchar(10),
                        start_year int not null,
                        end_year int not null,
                        primary key (course_id, id))
    AS SELECT * FROM CSVREAD('classpath:/data/PRE_COURSE.csv');

CREATE TABLE SCORE(gp varchar(2) primary key ,
                   score numeric(2,1) not null)
    AS SELECT * FROM CSVREAD('classpath:/data/SCORE.csv');

CREATE TABLE SECTION("year" int,
                     semester int,
                     target_grade int,
                     course_id varchar(10),
                     course_classification_code varchar(5) not null,
                     primary key ("year", semester, target_grade, course_id))
    AS SELECT * FROM CSVREAD('classpath:/data/SECTION.csv');

CREATE TABLE STUDENT(id varchar(9) primary key,
                     "name" varchar(20) not null,
                     total_credit numeric(4,1),
                     GPA numeric(3,2),
                     password varchar(30) not null)
    AS SELECT * FROM CSVREAD('classpath:/data/STUDENT.csv');

CREATE TABLE TAKES("year" int,
                   semester int,
                   target_grade varchar(10),
                   course_id varchar(10),
                   student_id varchar(9),
                   gp varchar(2) not null,
                   primary key ("year", semester, target_grade, course_id, student_id))
    AS SELECT * FROM CSVREAD('classpath:/data/TAKES.csv');