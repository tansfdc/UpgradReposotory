{\rtf1\ansi\ansicpg1252\cocoartf2709
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 import java.util.*;\
\
public class WithArrayList1 \{\
\
  public static void main (String[] args) \{\
    ArrayList studentList = new ArrayList();\
    studentList.add(new Student("Sujit", 1));\
    studentList.add(new Student("Siddharth", 2));\
    studentList.add(new Student("Karanpreet", 3));\
    studentList.add("Hari");   // this would lead to runtime type error \
    studentList.add(new Student("Tricha", 4));\
    printStudentList(studentList);\
  \}\
\
  public static void printStudentList(ArrayList students) \{\
    for(Object o : students) \{\
      Student s = (Student) o;\
      System.out.println(s.getDetails());\
    \}\
  \}\
\}\
\
class Student \{\
  private final String name;\
  private final int rollNumber;\
\
  public Student(String name, int rollNumber) \{\
    this.name = name;\
    this.rollNumber = rollNumber;\
  \}\
\
  public String getDetails() \{\
    return\
      "name = " + this.name + '\\n' +\
      "roll number = " + this.rollNumber + '\\n';\
  \}\
\}\
\
/*\
  SUMMARY\
  =======\
  1. ArrayList Simple way to representation a dataset which is a collection of elementary data items.\
      This is a type-unsafe approach of creating containers. We can add anything into the List which may\
      result in a variety of runtime type errors.\
  2. When printing, the ArrayList prints the elements in the same sequence as they had been inserted.\
      In other words, ArrayList (and any other form of lists, including arrays) remember the sequence\
      of insertion. This is an important property which can be safely exploited in the program design.\
      There are other containers, e.g. Sets and Maps, where the sequence of insertion is of no \
      consequence. A program using such containers must not depend on them to remember the sequence of\
      insertion for its correctness.\
\
  3. Using a non-generic ArrayList is type-unsafe.\
*/\
}