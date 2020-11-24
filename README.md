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




create table PolicyDetails(PolicyNo numeric(10),QuestionId varchar(15),Answer varchar(30));



-------------------------------------------------------------------------



create table questions(claimtypeid int,questionid int primary key,questions varchar2(50));
create table claimtype(claimtype varchar2(30),claimtypeid int primary key);
 create table answers(questionid int,answerid int,answers varchar2(50),AnswerWeightage  int);
alter table answers add FOREIGN KEY (questionid) REFERENCES questions(questionid);
 alter table questions add foreign key (claimtypeid) references claimtype(claimtypeid);
insert into claimtype(claimtype,claimtypeid) values('Business Auto',1);
insert into claimtype(claimtype,claimtypeid)  values('Restaurant',2);
 insert into claimtype(claimtype,claimtypeid) values('Apartment',3);
insert into claimtype(claimtype,claimtypeid) values('General Merchant',4);
 insert into questions(claimtypeid,questionid,questions) values(1,1,'Vehicle Type');
insert into questions(claimtypeid,questionid,questions) values(1,2,'Vehicle Model Year');
insert into questions(claimtypeid,questionid,questions) values(1,3,'Vehicle Model ');
 insert into questions(claimtypeid,questionid,questions) values(1,4,'Daily Commute Distance');
 insert into questions(claimtypeid,questionid,questions) values(1,5,'Service Center');
insert into questions(claimtypeid,questionid,questions) values(1,6,'Collision Coverage Limit');
insert into questions(claimtypeid,questionid,questions) values(1,7,'Bodily Injury Limit');
insert into questions(claimtypeid,questionid,questions) values(1,8,'Uninsured Motorist');
insert into questions(claimtypeid,questionid,questions) values(1,9,'Unknown Hit or Theft Coverage');
insert into questions(claimtypeid,questionid,questions) values(1,10,'Property and Liablity');
insert into questions(claimtypeid,questionid,questions) values(2,21,'Restaurant Type');
  insert into questions(claimtypeid,questionid,questions) values(2,22,'Restaurant SQ Ft');
  insert into questions(claimtypeid,questionid,questions) values(2,23,'Number of Sprinklers');
  insert into questions(claimtypeid,questionid,questions) values(2,24,'Number of Cyclinders in Kitchen');
  insert into questions(claimtypeid,questionid,questions) values(2,25,'Fine Arts');
  insert into questions(claimtypeid,questionid,questions) values(2,26,'Property Damage');
  insert into questions(claimtypeid,questionid,questions) values(2,27,'Equipment Breakdown');
  insert into questions(claimtypeid,questionid,questions) values(2,28,'Liablity Coverage');
  insert into questions(claimtypeid,questionid,questions) values(2,29,'Bodily Injury');
  insert into questions(claimtypeid,questionid,questions) values(3,31,'Apartment Sq Ft');
  insert into questions(claimtypeid,questionid,questions) values(3,32,'Number of Sprinklers');
  insert into questions(claimtypeid,questionid,questions) values(3,33,'Build Year');
  insert into questions(claimtypeid,questionid,questions) values(3,34,'Property Damage');
  insert into questions(claimtypeid,questionid,questions) values(3,35,'Bodily Injury Limit');
  insert into questions(claimtypeid,questionid,questions) values(3,36,'Number of floors');
  insert into questions(claimtypeid,questionid,questions) values(3,37,'Number of Fire Exits');
  insert into questions(claimtypeid,questionid,questions) values(3,38,'Asset Theft Limit');
  insert into questions(claimtypeid,questionid,questions) values(4,41,'Bussiness Type');
  insert into questions(claimtypeid,questionid,questions) values(4,42,'Asset Value');
  insert into questions(claimtypeid,questionid,questions) values(4,43,'Inflammable Objects');
  insert into questions(claimtypeid,questionid,questions) values(4,44,'Property Size');
  insert into questions(claimtypeid,questionid,questions) values(4,45,'Property Damage');
insert into questions(claimtypeid,questionid,questions) values(4,46,'Bodily Injury');
insert into questions(claimtypeid,questionid,questions) values(4,47,'Asset Theft Limit');
   insert into questions(claimtypeid,questionid,questions) values(4,48,'Liablity Coverage');
 insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(1,1,'Light',200);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(1,2,'Heavy',400);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(1,3,'Truck',600);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(2,1,'Less than 2000',200);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(2,2,'2001 to 2010',400);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(2,3,'More than 2010',600);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(3,1,'High Segment',200);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(3,2,'Mid Segment',400);
 insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(3,3,'Economy',600);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(4,1,'Less than 21',200);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(4,2,'21 to 50',400);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(4,3,'Greater than 50',600);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(5,1,'Authorized',200);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(5,2,'Non Authorized',400);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(5,3,'',600);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(6,1,'10000 to 30000',200);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(6,2,'30001 to 50000',400);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(6,3,'50001 to 10000',600);
   insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(7,1,'10000 to 30000',200);
insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(7,2,'30001 to 50000',400);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(7,3,'50001 to 10000',600);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(8,1,'10000 to 30000',200);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(8,2,'30001 to 50000',400);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(8,3,'50001 to 10000',600);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(9,3,'50001 to 10000',600);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(9,2,'30001 to 50000',400);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(9,1,'10000 to 30000',200);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(10,1,'10000 to 30000',200);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(10,2,'30001 to 50000',400);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(10,3,'50001 to 10000',600);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(21,1,'Only Dining',200);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(21,2,'Dining with Bar',400);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(21,3,'Dining with Bar and Entertainment',600);
 insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(22,1,'Less than 1500 sq.ft',200);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(22,2,'from 1500 to 5000 sq.ft',400);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(22,3,'more than 5000 sq.ft',600);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(23,2,'21 to 40',400);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(23,3,'more than 40 ',600);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(23,1,'Upto 20 ',200);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(24,1,'Up to 5 ',200);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(24,2,'from 6 to 15',400);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(24,3,'more than 15 ',600);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(25,3,'more than 30000 ',600);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(25,2,'15000 to 30000',400);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(25,1,'5000 to 15000',200);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(26,1,'upto 5,00,000',200);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(26,2,'from 5,00,000 to 15,00,000',400);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(26,3,'more than 15,00,000',600);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(27,3,'more than 2,00,000',600);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(27,2,'from 500000 to 2,00,000',400);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(27,1,'upto 500000',200);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(28,1,'10,000 to 15,000',200);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(28,2,'15,000 to 30000',400);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(28,3,'more than 30000',600);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(29,3,'more than 50000',600);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(29,2,'25,001 to 50,000',400);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(29,1,'upto 25,001',200);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(31,1,'upto 1500 sq.ft',200);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(31,2,'from 1500 to 5000 sq.ft',400);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(31,3,'more than 5000 sq.ft',600);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(32,3,'more than 10',600);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(32,2,'from 6 to 10',400);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(32,1,'upto 5',200);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(33,1,'before 2000',200);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(33,2,'2000 to 2010',400);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(33,3,'after 2010',600);
 insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(34,3,'more than 10,00,000',600);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(34,2,'5,00,001 to 10,00,000',400);
 insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(34,1,' upto 5,00,000',200);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(35,1,'50,000 to 1,00,000',200);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(35,2,'1,00,001 to 3,00,000',400);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(35,3,'3,00,001 to 5,00,000',600);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(36,3,'more than 30',600);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(36,2,'10 to 30',400);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(36,1,'Less than 10',200);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(37,1,'1',200);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(37,2,'2 to 3',400);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(37,3,'more than 3',600);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(38,3,'1,00,001 to 2,00,000',600);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(38,2,'50,000 to 1,00,000',400);
  insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(38,1,'upto 50,000',200);
 insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(41,1,'General Store',200);
   insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(41,2,'Hardware',400);
   insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(41,3,'Clothing',600);
   insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(42,3,'More than 25,00,001',600);
   insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(42,2,'10,00,001 to 25,00,001',400);
 insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(42,1,' Less than 10,00,000',200);
   insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(43,1,' Yes',200);
   insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(43,2,' No',400);
   insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(43,3,' ',600);
   insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(44,3,'More than 10,000 sq.ft ',600);
   insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(44,2,'5,000 to 10,000 sq.ft ',400);
   insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(44,1,'Less than 5,000 sq.ft',200);
 insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(45,1,'upto 500000',200);
   insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(45,2,'500000 to 10,00,000',400);
   insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(45,3,'10,00,000 to 15,00,000',600);
   insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(46,3,'50001 to 100000',600);
   insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(46,2,'30001 to 50000',400);
   insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(46,1,'10000 to 30000',200);
   insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(47,1,'upto 50000',200);
   insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(47,2,'50000 to 100000',400);
   insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(47,3,'1,00,001 to 2,00,000',600);
   insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(48,3,'10,000 to 30,000',600);
   insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(48,2,'10,000 to 30,000',400);
   insert into answers(questionid ,answerid ,answers,AnswerWeightage ) values(48,1,'10,000 to 30,000',200);



-------------------------------------------------------------------------------------------------------------------------------
   create table Policy(
    PolicyNumber numeric(10) ,
    PolicyPremium decimal(8,3),
    AccountNumber numeric(10),
    primary key (PolicyNumber)
   );

Table created.

 desc Policy;
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 POLICYNUMBER                              NOT NULL NUMBER(10)
 POLICYPREMIUM                                      NUMBER(8,3)
 ACCOUNTNUMBER                                      NUMBER(10)

insert into Policy values(200,50000,100452686);
insert into Policy values(201,45960,100452645);
insert into Policy values(202,12480,100452423);
insert into Policy values(203,25125,100452125);


POLICYNUMBER POLICYPREMIUM ACCOUNTNUMBER
------------ ------------- -------------
         200         50000     100452686
         201         45960     100452645
         202         12480     100452423
         203         25125     100452125


