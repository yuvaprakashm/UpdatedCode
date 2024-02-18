package net.texala.employee.constants;

import java.util.Comparator;

import net.texala.employee.model.Employee;

public class Constants {

	public static final String FILE_NAME = "employees.csv";
	public static final String ERROR_LOG_FILE = "error.log.csv";
	public static final String CSV_HEADER = "EmpId,FirstName,LastName,Department\n";
	public static final String CSV_DELIMITER = ",";
	public static final String NEW_LINE = "\n";

	public static final String NAME_REGEX = "[a-zA-Z]+";

	public static final String LOAD_CSV_ERROR = "Error loading data from CSV: ";
	public static final String INVALID_NAME_ERROR = "Error: First Name & Last name should contain only alphabetic characters.";
	public static final String INVALID_NAME_LOG = "Invalid firstname & last name : ";
	public static final String INVALID_FIRST_NAME_ERROR = "Error: First name should contain only alphabetic characters.";
	public static final String INVALID_FIRST_NAME_LOG = "Invalid first name format - First name: ";
	public static final String INVALID_LAST_NAME_ERROR = "Error: Last name should contain only alphabetic characters.";
	public static final String INVALID_LAST_NAME_LOG = "Invalid last name format - Last name: ";
	public static final String DUPLICATE_EMPID_ERROR = "Error: Employee with EMPID ";
	public static final String DUPLICATE_EMPID_LOG = "Duplicate EMPID found: ";
	public static final String ERROR_WRITING_LOG = "Error writing to error log: ";
	public static final String UPDATE_SUCCESS_MESSAGE = "Employee details updated successfully.";
	public static final String EMPLOYEE_NOT_FOUND_ERROR = "Employee not found.";
	public static final String EMPLOYEE_NOT_FOUND_MESSAGE = "Employee with EMPID not found: ";
	public static final String DELETE_SUCCESS_MESSAGE = "Employee with EMPID deleted successfully.";
	public static final String COMMIT_SUCCESS_MESSAGE = "Changes committed to CSV.";
	public static final String COMMIT_ERROR_MESSAGE = "Error committing changes: ";
	public static final String NO_EMPLOYEES_FOUND_MESSAGE = "No employees found.";
	public static final String SORTED_EMPLOYEE_RECORDS_HEADER = "EmpId, FirstName, LastName, Department";

	public static final String FIRST_NAME_FIELD = "first name";
	public static final String LAST_NAME_FIELD = "last name";
	public static final String DEPARTMENT_FIELD = "department";
	public static final String INVALID_FIELD_TO_UPDATE_ERROR = "Invalid field to update: ";

	public static final int NUMBER_OF_FIELDS = 4;

	public static final int EMPLOYEE_ID_INDEX = 0;
	public static final int FIRST_NAME_INDEX = 1;
	public static final int LAST_NAME_INDEX = 2;
	public static final int DEPARTMENT_INDEX = 3;

	public static final int EMPTY_EMP_ID = 0;
	public static final String STORE_SORTED_SUCCESS_MESSAGE = "Sorted employee records stored in ";
	public static final String STORE_SORTED_ERROR_MESSAGE = "Error storing sorted records: ";

	public static final String MENU_OPTION_ADD = "Add Employee";
	public static final String MENU_OPTION_UPDATE = "Update Employee";
	public static final String MENU_OPTION_DELETE = "Delete Employee";
	public static final String MENU_OPTION_DISPLAY = "Display Employees";
	public static final String MENU_OPTION_COMMIT = "Commit Changes";
	public static final String MENU_OPTION_EXIT = "Exit";
	public static final String ERROR_INVALID_CHOICE = "Error: Invalid choice.";
	public static final String ERROR_INVALID_INPUT = "Error: Invalid input.";
	public static final int EXIT = 6;

	public static final String DEV_DEPARTMENT = "Dev";
	public static final String PS_DEPARTMENT = "Ps";
	public static final String QA_DEPARTMENT = "Qa";
	public static final String ADMIN_DEPARTMENT = "Admin";
	public static final String SELECT_DEPARTMENT = "Select Department: ";

	public static final String INVALID_DEPARTMENT_DEFAULTING = "Invalid department choice. Defaulting to 'Unknown'.";

	public static final String UNKNOWN_DEPARTMENT = "Unknown";

	public static final String ENTER_EMPID = "Enter EMPID:";
	public static final String ENTER_FIRST_NAME = "Enter First Name:";
	public static final String ENTER_LAST_NAME = "Enter Last Name:";
	public static final String ENTER_DEPARTMENT = "Enter Department:";
	public static final String DEPARTMENT_OPTIONS = "1. " + DEV_DEPARTMENT + "\n" + "2. " + PS_DEPARTMENT + "\n" + "3. "
			+ QA_DEPARTMENT + "\n" + "4. " + ADMIN_DEPARTMENT;
	public static final String SELECT_DEPARTMENT_PROMPT = SELECT_DEPARTMENT;

	public static final String ERROR_ADD_EMPLOYEE = "An error occurred while adding the employee: ";
	public static final String ERROR_DISPLAY_EMPLOYEE = "An error occured while displaying the employee";

	public static final String ERROR_COMMIT_EMPLOYEE = "An error occurred while committing changes: ";

	public static final String MENU_OPTION_DELETE_SPECIFIC = "Delete Specific Employee by EMPID";
	public static final String MENU_OPTION_DELETE_ALL = "Delete All Employees";
	public static final String MENU_OPTION_ENTER_CHOICE = "Enter your choice: ";

	public static final String SUCCESS_EMPLOYEE_DELETED = "Employee with EMPID %d deleted successfully.";
	public static final String SUCCESS_ALL_EMPLOYEES_DELETED = "All employees have been deleted.";

	public static final String ERROR_EMPLOYEE_NOT_FOUND = "Employee with EMPID %d not found.";
	public static final String ERROR_INVALID_OPTION = "Invalid option selected.";

	public static final String MENU_OPTION_DISPLAY_ALL = "1. Display All Employees";
	public static final String MENU_OPTION_DISPLAY_BY_EMPID = "2. Display Employee by EMPID";
	public static final String MENU_OPTION_DISPLAY_SORTED = "3. Display Sorted Employee Records";

	public static final String SORT_BY_EMPID = "Sort by:\n1. EMPID\n2. First Name\n3. Last Name\nEnter your choice: ";

	public static final String ERROR_EMPLOYEE_NOT_FOUND_BY_EMPID = "Employee with EMPID %d not found.";

	public static final Comparator<Employee> SORT_BY_EMPID_COMPARATOR = Comparator.comparingInt(Employee::getEmpId);
	public static final Comparator<Employee> SORT_BY_FIRST_NAME_COMPARATOR = Comparator
			.comparing(Employee::getFirstName);
	public static final Comparator<Employee> SORT_BY_LAST_NAME_COMPARATOR = Comparator.comparing(Employee::getLastName);

	public static final String DISPLAY_OPTION_ALL = "1. Display All Employees";
	public static final String DISPLAY_OPTION_EMPID = "2. Display Employee by EMPID";
	public static final String DISPLAY_OPTION_SORTED = "3. Display Sorted Employee Records";
	public static final String ENTER_CHOICE = "Enter your choice: ";
	public static final String INVALID_OPTION_SELECTED = "Invalid option selected.";

	public static final String NO_EMPLOYEES_FOUND = "No employees found.";
	public static final String EMPLOYEE_HEADER = "EmpId, FirstName, LastName, Department";

	public static final String EMPLOYEE_NOT_FOUND = "Employee with EMPID %d not found.";

	public static final String SORT_BY = "Sort by:";
	public static final String SORT_OPTION_EMPID = "1. EMPID";
	public static final String SORT_OPTION_FIRST_NAME = "2. First Name";
	public static final String SORT_OPTION_LAST_NAME = "3. Last Name";

	public static final String ENTER_EMPID_TO_UPDATE = "Enter EMPID of the employee to update:";

	public static final String CHOOSE_FIELD_TO_UPDATE = "Choose field to update:";
	public static final String UPDATE_OPTION_FIRST_NAME = "1. First Name";
	public static final String UPDATE_OPTION_LAST_NAME = "2. Last Name";
	public static final String UPDATE_OPTION_DEPARTMENT = "3. Department";
	public static final String UPDATE_OPTION_ALL = "4. Update All";
	public static final String SELECT_FIELD = "Select Field: ";
	public static final String FIELD_FIRST_NAME_STRING = "First Name";
	public static final String FIELD_LAST_NAME_STRING = "Last Name";
	public static final String FIELD_DEPARTMENT_STRING = "Department";
	public static final String UPDATE_ALL_STRING = "Update All";
	public static final String UNKNOWN_STRING = "Unknown";
	public static final String INVALID_FIELD_CHOICE = "Invalid field choice. Defaulting to 'Unknown'.";
	public static final String ENTER_NEW_VALUE = "Enter new value:";
	public static final String ENTER_NEW_DEPARTMENT = "Enter new department:";
	public static final String DEV_OPTION = "1. Dev";
	public static final String PS_OPTION = "2. Ps";
	public static final String QA_OPTION = "3. Qa";
	public static final String ADMIN_OPTION = "4. Admin";

	public static final String INVALID_DEPARTMENT_CHOICE = "Invalid department choice. Defaulting to 'Unknown'.";
	public static final String ENTER_NEW_VALUES = "Enter new values for all fields:";
	public static final String ENTER_NEW_EMPID = "Enter new EMPID:";
	public static final String ENTER_NEW_FIRST_NAME = "Enter new First Name:";
	public static final String ENTER_NEW_LAST_NAME = "Enter new Last Name:";
	public static final int DEV_OPTION_CHOICE = 1;
	public static final int PS_OPTION_CHOICE = 2;
	public static final int QA_OPTION_CHOICE = 3;
	public static final int ADMIN_OPTION_CHOICE = 4;

	public static final String DEV_STRING = "Dev";
	public static final String PS_STRING = "Ps";
	public static final String QA_STRING = "Qa";
	public static final String ADMIN_STRING = "Admin";

	public static final int FIELD_FIRST_NAME = 1;
	public static final int FIELD_LAST_NAME = 2;
	public static final int FIELD_DEPARTMENT = 3;
	public static final int UPDATE__ALL = 4;

	public static final String UPDATE_EMPLOYEE_ERROR_MESSAGE = "An error occurred while updating the employee: ";
	public static final String DELETE_EMPLOYEE_PROMPT = "Enter EMPID of the employee to delete:";
	public static final String ALREADY_EXISTS = " already exists.";
	public static final String SORTED_FILE = "SortedEmployeeRecords.csv";
	public static final String CREATED = "' created successfully.";
	public static final String FILE = "File '";
	public static final String ERROR_FILE = "An error occurred while creating the file:";

	public static final String INVALID_INPUT = "Invalid input. Please enter a valid number.";
	public static final String UNEXPECTED_ERROR = "An unexpected error occurred: ";
}
