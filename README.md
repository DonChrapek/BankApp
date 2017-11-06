App handle new customer bank account requests.
Contains two account types: Savings and Checking.

Do following:
* Read .csv file of names, social security numbers, account type and initial deposit
* Both account types share following properties: deposit(), withdraw(), transfer(), showInfo(), 11-digit account number (generated with the following process: 1 or 2 depending on Savings or Checking account, last two digits of SSN, unique 5-digit number, and random 3-digit number)
* Saving account holders are given a Safety Deposit Box, identified with 3-digit number and accessed with 4-digit code
* Checking Account holders are assigned a Debit Card with a 12-digit number and 4-digit PIN
* Both account types use an interface that determines the base interest rate: 
  -  Saving accounts use .25 points less than the base rate
  -  Checking accounts use 15% of the base rate
* The showInfo reveal account information as well as informations specific to the Checking account or Saving account