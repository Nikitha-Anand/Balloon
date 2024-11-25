# Balloon
An element of a computer game using object-oriented programming

---
# Attributes
-  Health : Integer - The health of the balloon
-  Colour : String - The colour of the balloon
-  DefenceItem : The item the balloon uses to defend itself

---
# Methods
- Constructor() - Initialises the defence item and colour using the parameters, Initialises health to 100
- ChangeHealth() - Takes the change as a parameter and adds this to the health
- GetDefenceItem() - Returns the defence item of the object
- CheckHealth() - If the health is 0 or less, it returns TRUE, otherwise it returns FALSE

---
# Function - Defend()
- Takes a ballon object as a parameter
- Takes as input the strength of an oppenent from the user, uses ChangeHealth() to subract the strength of the oppenent
- Outputs the defence item of the balloon
- Checks the health of the object and outputs an appropriate message
- Reurns the amended balloon object

---
# Results
- Balloon Defence : "Sheild"
- Ballon Colour : "Red"
- Strength of opponent : 50
  
![image](https://github.com/user-attachments/assets/693bb08b-0479-42ae-9134-48cc065797ff)

