# Fast Food Ordering System

## Overview
This project is a simple console-based fast food ordering system implemented in Java using Maven framework. 
It demonstrates fundamental object-oriented programming (OOP) concepts 
such as inheritance, encapsulation, abstraction, and polymorphism. 
The system allows a customer to place an order for various menu items like burgers, fries, and drinks, 
and calculates the total cost including tax.

## Project Structure
The project consists of the following main components:

### Interfaces
- **Taxable**: An interface that defines a contract for calculating tax on menu items.

### Abstract Classes
- **MenuItem**: An abstract class representing a general menu item, implementing the `Taxable` interface.

### Concrete Classes
- **Burger**: Represents a burger item, inheriting from `MenuItem`.
- **Fries**: Represents a fries item, inheriting from `MenuItem`.
- **Drink**: Represents a drink item, inheriting from `MenuItem`.

### Enumerations
- **Size**: Enum to represent the size of the menu items (e.g., SMALL, MEDIUM, LARGE).

### Utility Classes
- **Order**: Manages the list of `MenuItem` objects and calculates totals.
- **App**: The main class to run the application, handle user input, and display output.

## Features
- **ID Validation**: Ensures that the customer ID is alphanumeric and 6-10 characters long.
- **Menu Options**: Allows the user to select from a predefined list of menu items.
- **Order Management**: Adds selected items to the order and calculates the total cost including tax.
- **Tax Calculation**: Implements a different tax rate for each type of menu item.