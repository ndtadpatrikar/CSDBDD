Feature: As a Job Seeker I want to create my profile so that recruiters can find me
Scenario: email/user  
  Given  email/user
  When on submit of new profile
  Then search in db whether it already exists ,throw validation

Scenario: mobile no to create a new profile  
  Given  mobile no to create a new profile
  When on submit
  Then check for mobile no. is 10 digit long

Scenario: email to create a new profile  
  Given  email to create a new profile
  When on submit
  Then check for proper email format

Scenario: mandatory field validation error  
  Given  improper values to create a new profile
  When on submit
  Then check for mandatory fields and throw error
	
Scenario: mandatory field validation success  
  Given  proper values to create a new profile
  When on submit
  Then create profile succcessfully
	
Scenario: recruiter view with results  
  Given  user is a recruiter and searches for a keyword for which profiles exist
  When user clicks on search
  Then show job seeker profiles

Scenario: recruiter view without results  
  Given  user ia a recruiter and searches for a keyword for which profiles do not exist
  When user clicks on search
  Then don't show job seeker profiles