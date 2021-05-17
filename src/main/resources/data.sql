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
values ( 1, 0, current_timestamp, current_timestamp, 'I''m a Canadian expat with an adventurous spirit and a curiosity for the unknown. These two characteristics have always been strong motivators in my life and have led me to some awesome experiences. Now, prepared to embark on a new journey, I''m itching to begin my next great adventure.');

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
values (1, 0, current_timestamp, current_timestamp, 'OOP', 1);

insert into concept (id, version, creation_time, update_time, concept, industry_id)
values (2, 0, current_timestamp, current_timestamp, 'Modeling', 1);

insert into concept (id, version, creation_time, update_time, concept, industry_id)
values (3, 0, current_timestamp, current_timestamp, 'RDBMS', 1);

insert into concept (id, version, creation_time, update_time, concept, industry_id)
values (4, 0, current_timestamp, current_timestamp, 'Patterns', 1);

insert into concept (id, version, creation_time, update_time, concept, industry_id)
values (5, 0, current_timestamp, current_timestamp, 'REST', 1);

insert into concept (id, version, creation_time, update_time, concept, industry_id)
values (6, 0, current_timestamp, current_timestamp, 'Architecture', 1);

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
values (6, 0, current_timestamp, current_timestamp, 'Chrome', 1);

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
values (1, 0, current_timestamp, current_timestamp, 'Spring', 1);

insert into framework (id, version, creation_time, update_time, framework, industry_id)
values (2, 0, current_timestamp, current_timestamp, 'Hibernate', 1);

insert into framework (id, version, creation_time, update_time, framework, industry_id)
values (3, 0, current_timestamp, current_timestamp, 'Tomcat', 1);

insert into framework (id, version, creation_time, update_time, framework, industry_id)
values (4, 0, current_timestamp, current_timestamp, 'JUnit', 1);

insert into framework (id, version, creation_time, update_time, framework, industry_id)
values (5, 0, current_timestamp, current_timestamp, 'Mockito', 1);

insert into framework (id, version, creation_time, update_time, framework, industry_id)
values (6, 0, current_timestamp, current_timestamp, 'React', 1);

insert into framework (id, version, creation_time, update_time, framework, industry_id)
values (7, 0, current_timestamp, current_timestamp, 'Bootstrap', 1);

insert into framework (id, version, creation_time, update_time, framework, industry_id)
values (8, 0, current_timestamp, current_timestamp, 'JQuery', 1);


insert into education (id, version, creation_time, update_time, institution, course, start_date, end_date, num, address, parish, town_city, county, state_province,
                       island, country_region, postal_code)
values (1, 0, current_timestamp, current_timestamp, 'Concordia University of Edmonton', 'Bachelor of Arts', '1992', '1995', null, '7128 Ada Blvd NW', null, 'Edmonton', null, 'Alberta', null, 'Canada', 'T5B 4E4');

insert into education (id, version, creation_time, update_time, institution, course, start_date, end_date, num, address, parish, town_city, county, state_province,
                       island, country_region, postal_code)
values (2, 0, current_timestamp, current_timestamp, 'Academia De Codigo', 'Full Stack Developer', '2019', '2019', null, 'Rua de Jesus', null, 'Praia de Vitoria', null, null, 'Terceira', 'Azores', '9000-000');

insert into education (id, version, creation_time, update_time, institution, course, start_date, end_date, num, address, parish, town_city, county, state_province,
                       island, country_region, postal_code)
values (3, 0, current_timestamp, current_timestamp, 'FreeCodeCamp', 'Full Stack Web Development Certification', '2016', 'Ongoing', null, null, null, null, null, null, null, 'Online', null);

insert into education (id, version, creation_time, update_time, institution, course, start_date, end_date, num, address, parish, town_city, county, state_province,
                       island, country_region, postal_code)
values (4, 0, current_timestamp, current_timestamp, 'Rede Valorizar', 'Curso ABC', '2015', '2016', null, null, null, null, null, null, 'Sao Miguel', 'Azores', null);


insert into work_experience (id, version, creation_time, update_time, organization, start_date, end_date, job_role, summary, duties)
values (1, 0, current_timestamp, current_timestamp, 'Kuehne + Nagel', 2013, 2014, 'Warehouse Technician',
        'Responsible for warehouse transfers to various Best Buy stores in the province of Alberta in addition to:',
        'Preparing daily pick-slips for co-workers; Checking transfers to ensure accuracy; Meeting daily shipping schedules and requirements; Monitoring and organizing inventory for accuracy; Loading and unloading trailers and containers');

insert into work_experience (id, version, creation_time, update_time, organization, start_date, end_date, job_role, summary, duties)
values (2, 0, current_timestamp, current_timestamp, 'Tesco', 2016, 2017, 'Customer Service Representative',
        'Responsible for assisting customers in addition to:',
        'Stocking, organizing, and labelling shelves; Checking product for expiration dates; Reducing prices on products due to expire; Checkout duties when required');

-- insert into work_experience (id, version, creation_time, update_time, organization, start_date, end_date, job_role, summary, duties)
-- values ();

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

insert into profile_education (profile_id, education_id)
values (1, 4);

insert into profile_work_experience (profile_id, work_experience_id)
values (1, 1);

insert into profile_work_experience (profile_id, work_experience_id)
values (1, 2);



