# cg-mp-team2
Team-2 PLP

create table claim(claimNumber number PRIMARY KEY, 
	              claimReason varchar2(30), 
	              accidentLocationStreet varchar2(40),
	              accidentCity varchar2(15), 
	              accidentState varchar2(15), 
	              accidentZip number, 
	              claimType varchar2(30), 
	               policyNumber number );
		      
		    
insert into claim values(100, 'Damage', 'St-12' ,'Hyderabad', 'Telangana', 500017, 'Restaurant', 200);
insert into claim values(101, 'Theft', 'St-10' ,'Hyderabad', 'Telangana', 500017, "Business Auto", 201);
insert into claim values(102, 'Repairs', 'St-1' ,'Chennai', 'TamilNadu', 600014, 'Apartment', 202);
insert into claim values(103, 'Theft', 'St-1' ,'Chennai', 'Tamilnadu', 600015, 'General-Merchant', 203);
insert into claim values(104, 'Theft', 'St-10' ,'Secunderabad', 'Telangana', 500019, 'General-Merchant', 203);
insert into claim values(105, 'Theft', 'St-10' ,'Visakhapatnam', 'AndhraPradesh', 500020, 'General-Merchant', 203);
insert into claim values(106, 'Theft', 'St-10' ,'Vijayawada', 'AndhraPradesh', 500120, 'General-Merchant', 203);
insert into claim values(107, 'Theft', 'St-11' ,'Visakhapatnam', 'AndhraPradesh', 500020, 'Apartment', 202);
insert into claim values(108, 'Theft', 'St-12' ,'Vijayawada', 'AndhraPradesh', 500020, 'Apartment', 202);
insert into claim values(109, 'Repairs', 'St-14' ,'Nellore', 'AndhraPradesh', 524001, 'Apartment', 202);
insert into claim values(110, 'Repairs', 'St-2' ,'Guntur', 'AndhraPradesh', 522001, 'Apartment', 202);
insert into claim values(111, 'Repairs', 'St-6' ,'Guntur', 'AndhraPradesh', 522001, 'Business Auto', 201);
insert into claim values(112, 'Theft', 'St-6' ,'Guntur', 'AndhraPradesh', 522001, 'Business Auto', 201);
insert into claim values(113, 'Theft', 'St-6' ,'Bangalore', 'Karnataka', 530068, 'Business Auto', 201);
insert into claim values(114, 'Repairs', 'St-26' ,'Bangalore', 'Karnataka', 530068, 'Restaurant', 200);
insert into claim values(115, 'Repairs', 'St-26' ,'Mumbai', 'Maharastra', 400011, 'Apartment', 202);
insert into claim values(116, 'Repairs', 'St-26' ,'Mumbai', 'Maharastra', 400011, 'General-Merchant', 203);

		      
		      
		      
		      
-------------------------------------------------------------------------------------------------------------------------------- 


create table Accounts(AccountNumber number(10) primary key,InsuredName varchar2(30) not null,
InsuredStreet varchar2(40),
InsuredCity varchar2(15) not null,
InsuredState varchar2(15) not null,
InsuredZip number(5) not null,
BusinessSegment varchar2(30),
UserName varchar2(20),
constraint User_fk foreign key(UserName) references UserRole(UserName));




------------------------------------------------------------------------------------------------------------------------------------

create table login_page(user_name varchar(20) constraint user_name primary key,password varchar(12),role_code varchar(20));

->desc login_page;
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 USER_NAME                                 NOT NULL VARCHAR2(20)
 PASSWORD                                           VARCHAR2(12)
 ROLE_CODE                                          VARCHAR2(20)

->insert into login_page(user_name,password,role_code) values('gayathri','ga@123','claim_handler');

SQL> insert into login_page(user_name,password,role_code) values('Divya','divya@12','claim_adjuster');

SQL> insert into login_page(user_name,password,role_code) values('Sravani','sravani@1','insured');

SQL> insert into login_page(user_name,password,role_code) values('Raguvardhan','ragu@11','insured');

SQL> insert into login_page(user_name,password,role_code) values('charitha','charitha@11','claim_handler');

SQL> insert into login_page(user_name,password,role_code) values('Swathi','swathi@88','claim_handler');

SQL> insert into login_page(user_name,password,role_code) values('Deepak','Deepak@09','insured');

SQL> insert into login_page(user_name,password,role_code) values('Rahul','rahul@00','claim_handler');

SQL> insert into login_page(user_name,password,role_code) values('Priyanka','priya@19','insured');

SQL> insert into login_page(user_name,password,role_code) values('Dinesh','dinesh@2','insured');

SQL> insert into login_page(user_name,password,role_code) values('Akshitha','akshitha@21','claim_handler');

SQL> insert into login_page(user_name,password,role_code) values('Harshitha','Harsh@52','claim_handler');

SQL> insert into login_page(user_name,password,role_code) values('Dinesh1','dinesh@2','insured');

SQL> insert into login_page(user_name,password,role_code) values('Swetha','swethas@2','insured');

SQL> insert into login_page(user_name,password,role_code) values('Mohith','mohith@6','claim_handler');

->select*from login_page;

USER_NAME            PASSWORD     ROLE_CODE
-------------------- ------------ --------------------
gayathri             ga@123       claim_handler
Divya                divya@12     claim_adjuster
Sravani              sravani@1    insured
Raguvardhan          ragu@11      insured
charitha             charitha@11  claim_handler
Swathi               swathi@88    claim_handler
Deepak               Deepak@09    insured
Rahul                rahul@00     claim_handler
Priyanka             priya@19     insured
Dinesh               dinesh@2     insured
Akshitha             akshitha@21  claim_handler

USER_NAME            PASSWORD     ROLE_CODE
-------------------- ------------ --------------------
Harshitha            Harsh@52     claim_handler
Dinesh1              dinesh@2     insured
Swetha               swethas@2    insured
Mohith               mohith@6     claim_handler
