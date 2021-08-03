-- noinspection SqlResolveForFile

-- noinspection SqlNoDataSourceInspectionForFile

insert into name (id, version, creation_time, update_time, first, last)
values (1, 0, current_timestamp, current_timestamp, 'Horacio', 'Correia');

insert into name (id, version, creation_time, update_time, first, last)
values (2, 0, current_timestamp, current_timestamp, 'Fabio', 'Barbosa');

insert into name (id, version, creation_time, update_time, first, last)
values (3, 0, current_timestamp, current_timestamp, 'Jorge', 'Almeida');

insert into name (id, version, creation_time, update_time, first, last)
values (4, 0, current_timestamp, current_timestamp, 'Ross', 'Correia');

insert into address (id, version, creation_time, update_time, num, address, parish, town, city, county, state_province, island, region, country, postal_code)
values (1, 0, current_timestamp, current_timestamp, null, '9436-153rd Street', null, null, 'Edmonton', null, 'Alberta', null, null, 'Canada', 'T5R-1R3');

insert into address (id, version, creation_time, update_time, num, address, parish, town, city, county, state_province, island, region, country, postal_code)
values (2, 0, current_timestamp, current_timestamp, '63C', 'Rua Doutor Teófilo Braga', 'Sao Jose', null, 'Ponta Delgada', null, null, 'Sao Miguel', 'Azores', 'Portugal', '9500-247');

insert into address (id, version, creation_time, update_time, num, address, parish, town, city, county, state_province, island, region, country, postal_code)
values (3, 0, current_timestamp, current_timestamp, '19', 'Rua Eng. Hernani Santos', null, 'Vila De Nordeste', null, 'Nordeste', null, 'Sao Miguel', 'Azores', 'Portugal', '9630-202');

insert into address (id, version, creation_time, update_time, num, address, parish, town, city, county, state_province, island, region, country, postal_code)
values (4, 0, current_timestamp, current_timestamp, '28-2 Esq', 'Rua Das Freiras', 'Matriz', null, 'Ribeira Grande', null, null, 'Sao Miguel', 'Azores', 'Portugal', '9600-534');

insert into email (id, version, creation_time, update_time, email)
values (1, 0, current_timestamp, current_timestamp, 'rmcorre@gmail.com');

insert into email (id, version, creation_time, update_time, email)
values (2, 0, current_timestamp, current_timestamp, 'rmcorreUK@gmail.com');

insert into email (id, version, creation_time, update_time, email)
values (3, 0, current_timestamp, current_timestamp, 'rmcorrePortugal@gmail.com');

insert into phone (id, version, creation_time, update_time, country_code, number)
values (1, 0, current_timestamp, current_timestamp, '+(001)', '780 761 5099');

insert into phone (id, version, creation_time, update_time, country_code, number)
values (2, 0, current_timestamp, current_timestamp, '+(351)', '91 421 3861');

insert into contact (id, version, creation_time, update_time, address_id, email_id, phone_id)
values (1, 0, current_timestamp, current_timestamp, 4, 1, 2 );

insert into contact (id, version, creation_time, update_time, address_id, email_id, phone_id)
values (2, 0, current_timestamp, current_timestamp, 2, 2, 1 );

insert into summary (id, version, creation_time, update_time, summary)
values ( 1, 0, current_timestamp, current_timestamp, 'I''m a Canadian ex-pat with an adventurous spirit and a curiosity for the unknown. I love to learn. I also love problem-solving. I get immense satisfaction from both. Sometimes the process is simple. Other times it may take hours, days, weeks, or even years. A part of the satisfaction is from the learning along the way, and the other part is from successfully solving a problem. However, the greatest reward comes from not desisting in the face of difficulty and adversity.');

insert into summary (id, version, creation_time, update_time, summary)
values ( 2, 0, current_timestamp, current_timestamp, 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate.');

insert into level (id, version, creation_time, update_time, level_name)
values (1, 0, current_timestamp, current_timestamp, 'Senior');

insert into level (id, version, creation_time, update_time, level_name)
values (2, 0, current_timestamp, current_timestamp, 'Intermediate');

insert into level (id, version, creation_time, update_time, level_name)
values (3, 0, current_timestamp, current_timestamp, 'Junior');

insert into level (id, version, creation_time, update_time, level_name)
values (4, 0, current_timestamp, current_timestamp, 'Apprentice');

insert into level (id, version, creation_time, update_time, level_name)
values (5, 0, current_timestamp, current_timestamp, 'Journeyman');

insert into category (id, version, creation_time, update_time, category_name)
values (1, 0, current_timestamp, current_timestamp, 'Developer');

insert into category (id, version, creation_time, update_time, category_name)
values (2, 0, current_timestamp, current_timestamp, 'General Manager');

insert into category (id, version, creation_time, update_time, category_name)
values (3, 0, current_timestamp, current_timestamp, 'Administration');

insert into category (id, version, creation_time, update_time, category_name)
values (4, 0, current_timestamp, current_timestamp, 'Professional DJ');

insert into sub_category (id, version, creation_time, update_time, sub_category_name)
values (1, 0, current_timestamp, current_timestamp, 'Front End');

insert into sub_category (id, version, creation_time, update_time, sub_category_name)
values (2, 0, current_timestamp, current_timestamp, 'Back End');

insert into sub_category (id, version, creation_time, update_time, sub_category_name)
values (3, 0, current_timestamp, current_timestamp, 'Full Stack');

insert into sub_category (id, version, creation_time, update_time, sub_category_name)
values (4, 0, current_timestamp, current_timestamp, 'House');

insert into sub_category (id, version, creation_time, update_time, sub_category_name)
values (5, 0, current_timestamp, current_timestamp, 'Techno');

insert into sub_category (id, version, creation_time, update_time, sub_category_name)
values (6, 0, current_timestamp, current_timestamp, 'Office');

insert into role (id, version, creation_time, update_time, level_id, category_id, sub_category_id)
values (1, 0, current_timestamp, current_timestamp, 3, 1, 1);

insert into role (id, version, creation_time, update_time, level_id, category_id, sub_category_id)
values (2, 0, current_timestamp, current_timestamp, 3, 1, 3);

insert into identity (id, version, creation_time, update_time, name_id, role_id, contact_id, summary_id)
values (1, 0, current_timestamp, current_timestamp, 1, 2, 1, 1);

insert into identity (id, version, creation_time, update_time, name_id, role_id, contact_id, summary_id)
values (2, 0, current_timestamp, current_timestamp, 2, 1, 2, 1);

insert into identity (id, version, creation_time, update_time, name_id, role_id, contact_id, summary_id)
values (3, 0, current_timestamp, current_timestamp, 4, 1, 1, 1);

insert into industry (id, version, creation_time, update_time, name)
values (1, 0, current_timestamp, current_timestamp, 'Software Development');

insert into concept (id, version, creation_time, update_time, concept, industry_id)
values (1, 0, current_timestamp, current_timestamp, 'Object Oriented Programming', 1);

insert into concept (id, version, creation_time, update_time, concept, industry_id)
values (2, 0, current_timestamp, current_timestamp, 'Domain Driven Design', 1);

insert into concept (id, version, creation_time, update_time, concept, industry_id)
values (3, 0, current_timestamp, current_timestamp, 'Data Modeling', 1);

insert into concept (id, version, creation_time, update_time, concept, industry_id)
values (4, 0, current_timestamp, current_timestamp, 'Design Patterns', 1);

insert into concept (id, version, creation_time, update_time, concept, industry_id)
values (5, 0, current_timestamp, current_timestamp, 'Architectural Patterns', 1);

insert into tool (id, version, creation_time, update_time, tool, industry_id)
values (1, 0, current_timestamp, current_timestamp, 'Git', 1);

insert into tool (id, version, creation_time, update_time, tool, industry_id)
values (2, 0, current_timestamp, current_timestamp, 'Webpack', 1);

insert into tool (id, version, creation_time, update_time, tool, industry_id)
values (3, 0, current_timestamp, current_timestamp, 'NPM', 1);

insert into tool (id, version, creation_time, update_time, tool, industry_id)
values (4, 0, current_timestamp, current_timestamp, 'IntelliJ', 1);

insert into tool (id, version, creation_time, update_time, tool, industry_id)
values (5, 0, current_timestamp, current_timestamp, 'VSCode', 1);

insert into tool (id, version, creation_time, update_time, tool, industry_id)
values (6, 0, current_timestamp, current_timestamp, 'Chrome Dev Tools', 1);

insert into tool (id, version, creation_time, update_time, tool, industry_id)
values (7, 0, current_timestamp, current_timestamp, 'Inkscape', 1);

insert into tech (id, version, creation_time, update_time, tech, industry_id)
values (1, 0, current_timestamp, current_timestamp, 'Java', 1);

insert into tech (id, version, creation_time, update_time, tech, industry_id)
values (2, 0, current_timestamp, current_timestamp, 'JavaScript', 1);

insert into tech (id, version, creation_time, update_time, tech, industry_id)
values (3, 0, current_timestamp, current_timestamp, 'HTML5', 1);

insert into tech (id, version, creation_time, update_time, tech, industry_id)
values (4, 0, current_timestamp, current_timestamp, 'CSS3', 1);

insert into tech (id, version, creation_time, update_time, tech, industry_id)
values (5, 0, current_timestamp, current_timestamp, 'SQL', 1);

insert into framework (id, version, creation_time, update_time, framework, industry_id)
values (1, 0, current_timestamp, current_timestamp, 'React', 1);

insert into framework (id, version, creation_time, update_time, framework, industry_id)
values (2, 0, current_timestamp, current_timestamp, 'Auth0', 1);

insert into framework (id, version, creation_time, update_time, framework, industry_id)
values (3, 0, current_timestamp, current_timestamp, 'Bootstrap', 1);

insert into framework (id, version, creation_time, update_time, framework, industry_id)
values (4, 0, current_timestamp, current_timestamp, 'Spring', 1);

insert into framework (id, version, creation_time, update_time, framework, industry_id)
values (5, 0, current_timestamp, current_timestamp, 'SpringBoot', 1);

insert into framework (id, version, creation_time, update_time, framework, industry_id)
values (6, 0, current_timestamp, current_timestamp, 'JPA', 1);

insert into framework (id, version, creation_time, update_time, framework, industry_id)
values (7, 0, current_timestamp, current_timestamp, 'Hibernate', 1);

insert into framework (id, version, creation_time, update_time, framework, industry_id)
values (8, 0, current_timestamp, current_timestamp, 'JSP', 1);

insert into framework (id, version, creation_time, update_time, framework, industry_id)
values (9, 0, current_timestamp, current_timestamp, 'Thymeleaf', 1);

insert into framework (id, version, creation_time, update_time, framework, industry_id)
values (10, 0, current_timestamp, current_timestamp, 'Tomcat', 1);

insert into framework (id, version, creation_time, update_time, framework, industry_id)
values (11, 0, current_timestamp, current_timestamp, 'JUnit', 1);

insert into framework (id, version, creation_time, update_time, framework, industry_id)
values (12, 0, current_timestamp, current_timestamp, 'Mockito', 1);

insert into framework (id, version, creation_time, update_time, framework, industry_id)
values (13, 0, current_timestamp, current_timestamp, 'JQuery', 1);


insert into education (id, version, creation_time, update_time, institution, course, start_date, end_date, num, address, parish, town_city, county, state_province,
                       island, country_region, postal_code)
values (1, 0, current_timestamp, current_timestamp, 'Concordia University of Edmonton', 'Bachelor of Arts', '1992', '1995', null, '7128 Ada Blvd NW', null, 'Edmonton', null, 'Alberta', null, 'Canada', 'T5B 4E4');

insert into education (id, version, creation_time, update_time, institution, course, start_date, end_date, num, address, parish, town_city, county, state_province,
                       island, country_region, postal_code)
values (2, 0, current_timestamp, current_timestamp, 'Academia De Codigo', 'Full Stack Developer', '2019', '2019', null, 'Rua de Jesus', null, 'Praia de Vitoria', null, null, 'Terceira', 'Azores', '9000-000');

insert into education (id, version, creation_time, update_time, institution, course, start_date, end_date, num, address, parish, town_city, county, state_province,
                       island, country_region, postal_code)
values (3, 0, current_timestamp, current_timestamp, 'FreeCodeCamp', 'Full Stack Web Development Certification', '2016', 'Ongoing', null, null, null, null, null, null, null, 'Online', null);

insert into work_experience (id, version, creation_time, update_time, organization, location, start_date, end_date, job_role, summary, duties)
values (1, 0, current_timestamp, current_timestamp, 'Kuehne + Nagel', 'Edmonton, Canada', 2013, 2014, 'Warehouse Transfer Fulfillment',
        'Upon assignment to a mostly autonomous function in what had been a problematic area in the past, it was my goal to take ownership and establish effective strategies that met the requirements of a fast-paced and demanding environment. Shortly after, these efforts eliminated common errors, delays, and damages in shipments and regained client trust and satisfaction.',
        '');

insert into work_experience (id, version, creation_time, update_time, organization, location, start_date, end_date, job_role, summary, duties)
values (2, 0, current_timestamp, current_timestamp, 'Tesco', 'Macclesfield, England',2016, 2017, 'Customer Assistant',
        'My main objective was to build a friendly and attentive rapport with all shoppers in the fresh department while meeting or exceeding all tasks and targets set out by the company. During my time at Tesco, the department saw an increase in revenue and customer loyalty, with a notable reduction in negative comments and surveys.',
        '');

insert into work_experience (id, version, creation_time, update_time, organization, location, start_date, end_date, job_role, summary, duties)
values (3, 0, current_timestamp, current_timestamp, 'Napa Auto Parts', 'Edmonton, Canada', 2011, 2011, 'Head Shipper',
        'After two weeks as a temporary warehouse labourer, I was hired full-time as the head shipper responsible for all branches in western Canada. My strong organizational and time-management skills were crucial in completing all shipments successfully within tight and often overlapping deadlines. ',
        '');

insert into work_experience (id, version, creation_time, update_time, organization, location, start_date, end_date, job_role, summary, duties)
values (4, 0, current_timestamp, current_timestamp, 'Sublime', 'Edmonton, Canada', 1997, 2003, 'Owner/CEO',
        'Being one of the pioneering DJs of House music in Edmonton,  Sublime materialized from a long-time aspiration to establish an after-hours dance club devoted to House music and modelled after the famed Paradise Garage in New York City. Because of the novelty of the concept, resources were scarce and licensing was a challenge. Consequently, the conception and execution had to be singular to keep with the original tenets of the project. Eventually, Sublime became recognized among devotees and attendance grew exponentially. For three years consecutively, its dancefloor and capacity filled with revellers of the genre and culture. Ultimately, this pet project grew beyond my and anyone else''s expectations. It was a true pleasure to see it succeed and receive the honour of being the premier club devoted to House music in western Canada at that time.',
        '');

insert into work_experience (id, version, creation_time, update_time, organization, location, start_date, end_date, job_role, summary, duties)
values (5, 0, current_timestamp, current_timestamp, '106 Street Social Club', 'Edmonton, Canada', 1996, 2010, 'General Manager',
        'Overseeing all operations and business activities of the club, I was responsible for developing new strategies that re-invigorated stagnant and outdated business practices and facilitated a much-needed face-lift. As a result, there was a steady increase in revenues and decrease in expenses while generating recognition as an award-winning establishment for 12 years consecutively.',
        '');

insert into work_experience (id, version, creation_time, update_time, organization, location, start_date, end_date, job_role, summary, duties)
values (6, 0, current_timestamp, current_timestamp, 'Roost', 'Edmonton, Canada', 1991, 1995, 'Afternoon Manager',
        'The Roost was my entry point into the Hospitality industry and introduced me to the basics of bar and restaurant operations. I quickly felt drawn to this field and set out to learn all that I could. My enthusiasm and passion resulted in a promotion to management, where I learned business administration, accounting principles, and leadership skills. These skills, along with creativity, proved valuable when leading a team to ward off a threat to the club''s stability from a new competitor. The short-term result was a gradual return of clientele while, in the long-term, the new format grew to be the club''s primary source of revenue for some time. ',
        '');

insert into profile (id, version, creation_time, update_time, identity_id, industry_id)
values ( 1, 0, current_timestamp, current_timestamp, 1, 1);

insert into profile (id, version, creation_time, update_time, identity_id, industry_id)
values ( 2, 0, current_timestamp, current_timestamp, 3, 1);

insert into profile_education (profile_id, education_id)
values (1, 1);

insert into profile_education (profile_id, education_id)
values (1, 2);

insert into profile_education (profile_id, education_id)
values (1, 3);

insert into profile_work_experience (profile_id, work_experience_id)
values (1, 1);

insert into profile_work_experience (profile_id, work_experience_id)
values (1, 2);

insert into profile_work_experience (profile_id, work_experience_id)
values (1, 3);

insert into profile_work_experience (profile_id, work_experience_id)
values (1, 4);

insert into profile_work_experience (profile_id, work_experience_id)
values (1, 5);

insert into profile_work_experience (profile_id, work_experience_id)
values (1, 6);



