# asset-management

Build a management program for manager. With the following basic functions
1. Login
2. Search asset by name
3. Create new asset
4. Updating asset's information
5. Approve the request of employee
6. Show list of borrow asset
7. Others- Quit
Each menu choice should invoke an appropriate function to perform the selected menu item. Your program
must display the menu after each task and wait for the user to select another option until the user chooses to
quit the program. 

This system contains the following functions:
Display a menu and ask users to select an option.

– Function 0: Build the data structure 
o Classes, abstract classes, Interfaces.
o assetID, employeeID cannot change after created.
o Must implement the polymorphism properties of object-oriented programming.

– Function 1: Login 
o Employee input the employeeID and password to login.
o Program must show the result: "Successfully" or "Incorrect id or password"

– Function 2: Search asset by name 
o User input the text want to search.
o The system will search in the company, and return all asset that has name contain the search
string.
o Show result list: all information of asset(descending).
o Go back to the main menu.

– Function 3: Create new asset 
o Manager must login to use this function.
o Create a submenu that allows the manager add new asset.
o Remember that the constraints must be checked
o Add the new asset to collection and update into asset.dat file
o Ask to continuous create new asset or go back to the main menu.

– Function 4: Update asset information 
o Manager must login to use this function.
o Require enter the asset’s id.
o If asset does not exist, the notification “Asset does not exist”. Otherwise, manager can start
input new information of asset and update.
o If new information is blank, then not change old information.
o Remember that the constraints must be checked
o Then system must print out the result of the updating.
o After updating, the program returns to the main screen.

– Function 5: Approve the request of employee 
o Manager must login to use this function
o System will show list of borrow request from employee.
o The manager selects the request that he wants to approve through the request ID.
o The system will check: the borrowed quantity of this asset is still in stock (asset.dat)? If not
enough, report an error. If the quantity is enough in stock then:
o Insert data into the file borrow.dat
o Remove the data line in the file request.dat
o Update the quantity of asset in asset.dat file
o After approve, the program returns to the main screen

– Function 6: Show list of borrow asset 
o Manager must login to use this function
o The system shows a list of assets borrowed in the company (the borrow.dat file)
o After that the program returns to the main screen.
