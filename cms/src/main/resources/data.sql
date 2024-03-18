-- INSERT INTO ABEEK (abeek_code,
--                          abeek_name)
--     SELECT * FROM CSVREAD('classpath:/data/ABEEK.csv');
--
-- INSERT INTO ABEEK_COURSE (course_id,
--                                  abeek_code,
--                                  abeek_credit)
--     SELECT * FROM CSVREAD('classpath:/data/ABEEK_COURSE.csv');

INSERT INTO COURSE(course_id,
                    course_name,
                    credit)
    SELECT * FROM CSVREAD('classpath:/data/COURSE.csv');

-- INSERT INTO COURSE_CLASSIFICATION(course_classification_code,
--                                    course_classification_name)
--     SELECT * FROM CSVREAD('classpath:/data/COURSE_CLASSIFICATION.csv');
--
-- INSERT INTO GRADUATION_CRITERIA(admission_year,
--                                  graduation_criteria_item_code,
--                                  graduation_criteria_credit,
--                                  primary key (admission_year, graduation_criteria_item_code))
--     SELECT * FROM CSVREAD('classpath:/data/GRADUATION_CRITERIA.csv');
--
-- INSERT INTO GRADUATION_CRITERIA_ITEM(graduation_criteria_item_code,
--                                      graduation_criteria_item_name)
--     SELECT * FROM CSVREAD('classpath:/data/GRADUATION_CRITERIA_ITEM.csv');
--
-- INSERT INTO PRE_COURSE(course_id,
--                         pre_course_id,
--                         start_year
--                         end_year,)
--     SELECT * FROM CSVREAD('classpath:/data/PRE_COURSE.csv');
--
-- INSERT INTO SCORE(gp,
--                   score)
--     SELECT * FROM CSVREAD('classpath:/data/SCORE.csv');

INSERT INTO SECTION (section_year,
                     section_semester,
                     target_grade,
                     course_id,
                     course_classification_code)
    SELECT * FROM CSVREAD('classpath:/data/SECTION.csv');

-- INSERT INTO STUDENT(student_id,
--                      `name`,
--                      total_credit,
--                      GPA,
--                      password)
--     SELECT * FROM CSVREAD('classpath:/data/STUDENT.csv');
--
-- INSERT INTO TAKES(`year`,
--                    semester,
--                    target_grade,
--                    course_id,
--                    student_id,
--                    gp)
--     SELECT * FROM CSVREAD('classpath:/data/TAKES.csv');