# OVERVIEW


Person : specified with first , last name and the age  

Student: extends from Person specified  also with ID, speciality, and list of courses that a student  is enrolled in .

Teacher: extends from Person specified  also with department and courses that a teacher teach.

Subject: is a subject having  name, ID , teached by a teacher and have list of students that study it .

Course: have id and represents a teacher , unique subject , correspond to an exam , list of students and taught in uniquer classroom .

Exam: Represents an exam with attributes for exam name, level, and associated course.

Clubs: Represents a club with a name and members.

ClassRoom: Represents a classroom with a class number.

AdministrationEmployee: Inherits from Person. Represents an administration employee with a responsibility.

TimeSheet: presents the timetable of the courses in the university .

# FEATUERS
## 1. Student Manager
  - Add students with their details.
Enroll students in courses.
## 2. Teacher Manager
  -Add teachers with their details.
  -Assign teachers to courses.
## 3. Course Manager
   -Create courses for specific subjects.
   -Register students for courses.
Design exams for courses.
## 4. Club Manager
   -Create clubs and manage club membership.
## 5. Timesheet Manager
  -Add courses to the timetable with specific schedules.
  -Display the university timetable.
## 6. Administration Employee Management
  -Add administration employees with their responsibilities.


# Getting Started 
```
  to run the code :
    git clone https://github.com/RayenMbarki/University-Management-System.git
    javac src/Main.java
    java Main

```
