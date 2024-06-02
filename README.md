Calendar Program 

The Calendar program calculates the day of the week for a given date. It prompts the user to input a year, month, and date, then determines the corresponding day of the week. This program uses the formula based on Zeller's Congruence to calculate the day of the week.

Features

    Validates the year input to ensure it is a four-digit number.
    Handles leap years for accurate date validation.
    Prompts for month and date, with appropriate checks for valid ranges based on the month and leap year status.
    Calculates and displays the day of the week for the provided date.

Usage

Compile the program:

    javac Calendar.java

Run the program:

    java Calendar

Follow the prompts:

    Enter a valid four-digit year when prompted.
    Enter the month number (1 for January, 2 for February, etc.).
    Enter the date based on the chosen month.

Input Validation

    Year: The program checks if the input year is a four-digit number. If the input is invalid, it prompts the user to re-enter a valid year.
    Month: The program ensures the month input is between 1 and 12.
    Date: Depending on the month and leap year status, the program checks if the entered date is valid.

Example

    Enter year: 2023
    Enter month (month num): 6
    Enter date: 15
    -----------------------------------
    The day (15-6-2023) is: Thursday
    -----------------------------------

Internal Logic

Year Processing:

    The century part of the year (yfp) and the last two digits of the year (yd) are used.
    ydf is calculated as the integer division of yd by 4.
    A value y is assigned based on the century.

Month Value Assignment:

    A value m is assigned based on the month.

Date Validation:

    The program ensures the date is within valid ranges for the given month and year.

Day Calculation:

    The formula (date + monthcode + yearcode + last 2 digits of year + (last 3 digits of year / 4)) % 7 is used to calculate the day of the week.
    Adjustments are made for January and February in leap years.

Special Cases

    Leap year adjustments ensure February has 29 days.
    Proper handling of months with 30 and 31 days.

Day Codes:

    DayCode	     |     Day
    ----------------------
      0	     |  Saturday
      1	     |  Sunday
      2	     |  Monday
      3	     |  Tuesday
      4	     |  Wednesday
      5	     |  Thursday
      6	     |  Friday

Here are the month codes used in the program:

    Month	          |   Month Code
    ---------------------------
    January	          |     1
    February	  |     4
    March	          |     4
    April	          |     0
    May	          |     2
    June	          |     5
    July	          |     0
    August	          |     3
    September	  |     6
    October	          |     1
    November	      |     4
    December	      |     6

The year code in the program is determined based on the century part of the year and is used in the calculation of the day of the week. Here are the year codes for different centuries:

    Century (yfp)	      |   Year Code
    ------------------------------
    1600-1699	      |     6
    1700-1799	      |     4
    1800-1899	      |     2
    1900-1999	      |     0
    2000-2099	      |     6
    2100-2199	      |     4
    2200-2299	      |     2
    2300-2399	      |     0
    
Explanation

The century part of the year (yfp) is obtained by dividing the year by 100.
Based on the remainder of the division of the century by 4, the year code is assigned as follows:

    If yfp % 4 == 0, the year code is 6.
    If yfp % 4 == 1, the year code is 4.
    If yfp % 4 == 2, the year code is 2.
    If yfp % 4 == 3, the year code is 0.

Notes

This program assumes the Gregorian calendar system.

The formula used is simplified and may not cover all edge cases for historical dates before the adoption of the Gregorian calendar.
